import { createApp } from 'vue'
import App from './App.vue'
import axios from 'axios'

//createApp(App).mount('#app')

//axios 전역화 및 뷰 인스턴스 생성
axios.defaults.baseURL = "http://localhost:8080"
const app = createApp(App)
app.config.globalProperties.$axios = axios;
app.mount('#app')