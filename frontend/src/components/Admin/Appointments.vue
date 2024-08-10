<template>
  <div>
    <h1>Manage Appointments</h1>
    <table>
      <thead>
        <tr>
          <th>Appointment ID</th>
          <th>Patient Name</th>
          <th>Doctor Name</th>
          <th>Appointment Date</th>
          <th>Appointment Time</th>
          <th>Status</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="appointment in appointments" :key="appointment.id">
          <td>{{ appointment.id }}</td>
          <td>{{ appointment.patientName }}</td>
          <td>{{ appointment.doctorName }}</td>
          <td>{{ appointment.appointmentDate }}</td>
          <td>{{ appointment.appointmentTime }}</td>
          <td>{{ appointment.status }}</td>
          <td>
            <button @click="editAppointment(appointment.id)">Edit</button>
            <button @click="deleteAppointment(appointment.id)">Delete</button>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      appointments: [],
    };
  },
  mounted() {
    this.fetchAppointments();
  },
  methods: {
    fetchAppointments() {
      axios
        .get('/api/appointments') // Adjust the API endpoint as needed
        .then((response) => {
          this.appointments = response.data;
        })
        .catch((error) => {
          console.error('Error fetching appointments:', error);
        });
    },
    editAppointment(id) {
      // Logic to edit an appointment (e.g., redirect to an edit page)
      this.$router.push({ name: 'EditAppointment', params: { id } });
    },
    deleteAppointment(id) {
      if (confirm('Are you sure you want to delete this appointment?')) {
        axios
          .delete(`/api/appointments/delete/${id}`) // Adjust the API endpoint as needed
          .then(() => {
            this.fetchAppointments(); // Refresh the list after deletion
          })
          .catch((error) => {
            console.error('Error deleting appointment:', error);
          });
      }
    },
  },
};
</script>

<style scoped>
/* Add any required styles here */
</style>
