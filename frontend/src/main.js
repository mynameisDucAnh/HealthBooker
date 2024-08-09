import { createApp } from 'vue';
import App from './App.vue';
import router from './router';
import store from './store'; // Thêm dòng này để import Vuex store

const app = createApp(App);
app.use(router);
app.use(store); // Thêm dòng này để sử dụng Vuex store
app.mount('#app');
