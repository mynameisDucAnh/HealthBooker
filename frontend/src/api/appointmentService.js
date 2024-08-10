// src/services/appointment.js
import axiosInstance from './axiosInstance'; 


/**
 * Tạo một cuộc hẹn mới.
 * @param {Object} appointmentData - Dữ liệu để tạo cuộc hẹn.
 * @returns {Promise} - Promise từ Axios.
 */
export const createAppointment = (appointmentData) => {
  return axiosInstance.post('/appointments/create', appointmentData);
};

/**
 * Lấy thông tin chi tiết của một cuộc hẹn theo ID.
 * @param {Number} appointmentId - ID của cuộc hẹn.
 * @returns {Promise} - Promise từ Axios.
 */
export const getAppointmentById = (appointmentId) => {
  return axiosInstance.get(`/appointments/${appointmentId}`);
};

/**
 * Cập nhật một cuộc hẹn.
 * @param {Number} appointmentId - ID của cuộc hẹn cần cập nhật.
 * @param {Object} appointmentData - Dữ liệu cập nhật cho cuộc hẹn.
 * @returns {Promise} - Promise từ Axios.
 */
export const updateAppointment = (appointmentId, appointmentData) => {
  return axiosInstance.put(`/appointments/update/${appointmentId}`, appointmentData);
};

/**
 * Xóa một cuộc hẹn theo ID.
 * @param {Number} appointmentId - ID của cuộc hẹn cần xóa.
 * @returns {Promise} - Promise từ Axios.
 */
export const deleteAppointment = (appointmentId) => {
  return axiosInstance.delete(`/appointments/delete/${appointmentId}`);
};

/**
 * Lấy tất cả các cuộc hẹn của một người dùng (bệnh nhân) theo ID.
 * @param {Number} userId - ID của người dùng (bệnh nhân).
 * @returns {Promise} - Promise từ Axios.
 */
export const getAppointmentsByUserId = (userId) => {
  return axiosInstance.get(`/appointments/user/${userId}`);
};
