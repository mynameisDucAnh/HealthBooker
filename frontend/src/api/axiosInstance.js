import axios from 'axios';


const axiosInstance = axios.create({
  baseURL: 'http://localhost:8081/api/v1', // Your API base URL
  __VUE_PROD_HYDRATION_MISMATCH_DETAILS__: 'false',
  headers: {
    Accept: 'application/json',
    'Content-Type': 'application/json',
   
  },
});

export default axiosInstance;
