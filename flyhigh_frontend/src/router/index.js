import { createRouter, createWebHistory } from 'vue-router'
import SearchFlight from "@/views/SearchFlight.vue";
import SeatsSelection from "@/views/SeatsSelection.vue";

const routes = [
  {
    path: '/',
    name: 'search',
    component: SearchFlight
  },
  {
    path: '/seats',
    name: 'seats',
    component: SeatsSelection
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
