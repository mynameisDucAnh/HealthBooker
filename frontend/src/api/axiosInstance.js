import axios from 'axios';
import store from '../store/index.js'; 

const axiosInstance = axios.create({
  baseURL: 'http://localhost:8081/api/v1', 
  __VUE_PROD_HYDRATION_MISMATCH_DETAILS__: 'false',
  headers: {
    Accept: 'application/json',
    'Content-Type': 'application/json',
  },
});


axiosInstance.interceptors.request.use(
  (config) => {
    const token = store.state.authToken;
    if (token) {
      config.headers.Authorization = `Bearer ${token}`;
    }
    return config;
  },
  (error) => {
    return Promise.reject(error);
  }
);

export default axiosInstance;
