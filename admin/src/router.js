import Vue from 'vue'
import Router from 'vue-router'
import Login from './views/login.vue'



Vue.use(Router);

export default new Router({
    mode: 'history',
    base: process.env.BABEL_ENV,
    router: [{
        path: '*',
        redirect: '/login',
    },{
        path: '/login',
        component: Login
    }]

})