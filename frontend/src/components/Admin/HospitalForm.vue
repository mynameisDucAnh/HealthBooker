<template>
  <div class="modal">
    <div class="modal-content">
      <span class="close" @click="closeModal">&times;</span>
      <p>{{hospitalData}}</p>
      <div v-if="hospitalData.length > 0">
        <ul>
          <li v-for="(hospital, index) in hospitalData" :key="index">
            {{ hospital.name }}
          </li>
        </ul>
      </div>
      <p v-else>Loading hospitals...</p>
    </div>
  </div>
</template>

<script>
import { fetchHospitals } from "../../api/hospitalService.js";

export default {
  data() {
    return {
      hospitalData: [],  // Initialize as an array to hold multiple hospitals
    };
  },
  mounted() {
    this.loadHospitals();
  },
  methods: {
  async loadHospitals() {
  try {
    const data = await fetchHospitals();
    this.hospitalData = data; // Cập nhật để phản ánh cấu trúc dữ liệu trả về từ API
    console.log("Hospital Data:", this.hospitalData); // Xem xét cấu trúc dữ liệu
  } catch (error) {
    console.error("Error fetching hospitals:", error);
  }
},
  closeModal() {
    // Implement your modal close functionality here
  },
}
};
</script>

<style scoped>
.modal {
  display: block;
  position: fixed;
  z-index: 1;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  overflow: auto;
  background-color: rgba(0, 0, 0, 0.4);
}

.modal-content {
  background-color: #fefefe;
  margin: 15% auto;
  padding: 20px;
  border: 1px solid #888;
  width: 80%;
  position: relative;
}

.close {
  color: #aaa;
  position: absolute;
  top: 10px;
  right: 10px;
  font-size: 28px;
  font-weight: bold;
  cursor: pointer;
}

.close:hover {
  color: black;
  text-decoration: none;
}
</style>
