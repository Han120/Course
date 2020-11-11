import {createApp} from 'vue';
import Router from 'vue-router'
import Login from './views/login.vue'
import App from "./app";

createApp(App).use(Router);

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [{
    path: '*',
    redirect: "/login",
  },{
    path: '/login',
    redirect: Login
  }]
})