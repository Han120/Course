import {createApp} from 'vue'
import App from './app.vue'
import router from './router'

config.productionTip= false

createApp(App).use(router).mount('#app');

