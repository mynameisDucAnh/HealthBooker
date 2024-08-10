<template>
  <div>
    <h1>Edit Appointment</h1>
    <form @submit.prevent="updateAppointment">
      <!-- Form fields for editing appointment -->
      <input v-model="appointment.appointmentDate" type="date" required />
      <input v-model="appointment.appointmentTime" type="time" required />
      <select v-model="appointment.status">
        <option value="scheduled">Scheduled</option>
        <option value="completed">Completed</option>
        <option value="cancelled">Cancelled</option>
      </select>
      <button type="submit">Save</button>
    </form>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      appointment: {},
    };
  },
  mounted() {
    this.fetchAppointment();
  },
  methods: {
    fetchAppointment() {
      axios
        .get(`/api/appointments/${this.$route.params.id}`)
        .then((response) => {
          this.appointment = response.data;
        })
        .catch((error) => {
          console.error('Error fetching appointment:', error);
        });
    },
    updateAppointment() {
      axios
        .put(`/api/appointments/update/${this.$route.params.id}`, this.appointment)
        .then(() => {
          this.$router.push({ name: 'AdminAppointments' });
        })
        .catch((error) => {
          console.error('Error updating appointment:', error);
        });
    },
  },
};
</script>

<style scoped>
/* Add any required styles here */
</style>
