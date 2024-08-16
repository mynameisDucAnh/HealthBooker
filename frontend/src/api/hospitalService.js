import axiosInstance from './axiosInstance';
// import { API_BASE_URL } from './apiConfig';

export const getHospitals = (page = 0, limit = 12) => {
  return axiosInstance.get(`/hospital?page=${page}&limit=${limit}`);
};