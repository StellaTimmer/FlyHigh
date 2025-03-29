import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/SearchFlight.vue'
import SearchFlight from "@/views/SearchFlight.vue";

const routes = [
  {
    path: '/',
    name: 'search',
    component: SearchFlight
  },
  {
    path: '/seats',
    name: 'seats',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: function () {
      return import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
    }
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
