import axios from 'axios';
import store from '../store/index.js'; // Đường dẫn đến file store của bạn

const axiosInstance = axios.create({
  baseURL: 'http://localhost:8081/api/v1', // Your API base URL
  __VUE_PROD_HYDRATION_MISMATCH_DETAILS__: 'false',
  headers: {
    Accept: 'application/json',
    'Content-Type': 'application/json',
  },
});

// Thêm interceptor để thêm token vào header Authorization
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
