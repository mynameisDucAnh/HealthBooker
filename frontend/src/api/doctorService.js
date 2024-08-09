import axiosInstance from './axiosInstance'; // Đường dẫn đến file axiosInstance

export const getDoctors = (page = 0, limit = 12) => {
  return axiosInstance.get(`/doctors?page=${page}&limit=${limit}`);
};