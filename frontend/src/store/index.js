import { createStore } from 'vuex';
import axios from 'axios';

const store = createStore({
  state() {
    return {
      authToken: localStorage.getItem('authToken') || null,
      fullName: localStorage.getItem('fullName') || null, // Store user's full name
    };
  },
  mutations: {
    setAuthToken(state, token) {
      state.authToken = token;
      localStorage.setItem('authToken', token);
    },
    setUserFullName(state, fullName) {
      state.fullName = fullName;
      localStorage.setItem('fullName', fullName);
    },
    clearAuthToken(state) {
      state.authToken = null;
      localStorage.removeItem('authToken');
      state.fullName = null;
      localStorage.removeItem('fullName');
    },
  },
  actions: {
    async login({ commit }, credentials) {
      try {
        const response = await axios.post('http://localhost:8081/api/v1/users/login', credentials);
        const { token, fullName } = response.data;

        // Save the token and full name to the store and localStorage
        commit('setAuthToken', token);
        commit('setUserFullName', fullName);

        console.log('Login successful, welcome ' + fullName);
        return response.data;
      } catch (error) {
        console.error('Login failed:', error.response?.data || error.message);
        throw error; // Ensure error is thrown for the caller to handle
      }
    },
    logout({ commit }) {
      commit('clearAuthToken');
    },
  },
  getters: {
    isAuthenticated(state) {
      return !!state.authToken;
    },
    userName(state) {
      return state.fullName; // Use fullName from the state
    },
  },
});

export default store;
