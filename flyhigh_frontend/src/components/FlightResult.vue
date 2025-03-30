
<template>
<tr>
  <td>{{ date }}</td>
  <td>{{ shortTime() }} </td>
  <td>{{ startCity }}</td>
  <td>{{ endCity }}</td>
  <td>{{ priceEuros }} eur</td>
  <td><button class="btn btn-sm btn-outline-success" @click="goToSeatsView">Istekohad</button></td>
</tr>
</template>


<script>
import NavigationService from "@/services/NavigationService";

export default {
  name: 'FlightResult',
  props: {
    date: { type: String, required: true },
    time: { type: String, required: true },
    startCity: { type: String, required: true },
    endCity: { type: String, required: true },
    priceEuros: { type: Number, required: true },
  },
  methods: {
    shortTime() {
      return this.time.substring(0, 5);
    },
    goToSeatsView() {
      NavigationService.goToSeatsView();
    }
  }
}


</script>
