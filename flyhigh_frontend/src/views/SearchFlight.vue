<template>
  <div>
    <div class="container text-center">
      <div class="row">
        <div class="col">
          Sihtkoht
        </div>
        <div class="col">
          Kuupäev
          <input type="date"
                 class="form-control"
                 >
        </div>
        <div class="col">
          Max hind
          <input type="number"
                 class="form-control"
                 min="1">
        </div>
        <div class="col">
          <div class="mt-4">
            <button @click="onclickSearchFlights" type="button" class="btn btn-outline-success">Otsi</button>
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <hr>
    </div>
    <div class="row">
      <div class="col">
        <table class="table" v-if="this.flights.length > 0">
          <thead>
            <th scope="col">Kuupäev</th>
            <th scope="col">Kell</th>
            <th scope="col">Lähtekoht</th>
            <th scope="col">Sihtkoht</th>
            <th scope="col">Hind</th>
            <th scope="col"></th>
          </thead>
          <tbody>
            <FlightResult
                v-for="flight in flights"
                :key="flight.id"
                :date="flight.date"
                :time="flight.time"
                :startCity="flight.startCity"
                :endCity="flight.endCity"
                :priceEuros="flight.priceEuros"
            />
          </tbody>
        </table>
      </div>
    </div>
  </div>
</template>

<script>

import SearchFlightsService from "@/services/SearchFlightsService";
import FlightResult from "@/components/FlightResult.vue";

export default {
  name: 'SearchFlight',
  components: {
    FlightResult
  },
  data() {
    return {
      flights: [],
    }
  },
  methods: {
    onclickSearchFlights() {
      SearchFlightsService.searchFlights()
          .then(response => this.handleSearchFlightsResponse(response))
          .catch(error => console.log(error));
    },
    handleSearchFlightsResponse(response) {
      this.flights = response.data;
      console.log(this.flights);
    }
  }
}
</script>
