<template>
  <div>
    <div class="container text-center">
      <div class="row">
        <div class="col">
          Lähtekoht
          <CitySelect
              :cities="cities"
              v-model="startCity"
          />
        </div>
        <div class="col">
          Sihtkoht
          <CitySelect
              :cities="cities"
              v-model="endCity"
          />
        </div>
        <div class="col">
          Kuupäev
          <input v-model="date"
                 type="date"
                 class="form-control"
                 >
        </div>
        <div class="col">
          Max hind
          <input v-model="maxPrice"
                 type="number"
                 class="form-control"
                 min="1">
        </div>
        <div class="col">
          <div class="mt-4">
            <button @click="onclickSearchFlights" type="button" class="btn btn-outline-success">Otsi</button>
          </div>
        </div>
      </div>
      <br>
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
import CitySelect from "@/components/CitySelect.vue";

export default {
  name: 'SearchFlight',
  components: {
    CitySelect,
    FlightResult
  },
  data() {
    return {
      startCity: null,
      endCity: null,
      date: null,
      maxPrice: null,
      cities: [],
      flights: [],
    }
  },
  methods: {
    getCities() {
      SearchFlightsService.getAllCities()
          .then(response => { this.handleCitiesResponse(response) })
          .catch(error => console.log(error));
    },
    handleCitiesResponse(response) {
        this.cities = response.data;
        console.log(this.cities);
    },
    onclickSearchFlights() {
      SearchFlightsService.searchFlights(this.startCity, this.endCity, this.date, this.maxPrice)
          .then(response => this.handleSearchFlightsResponse(response))
          .catch(error => console.log(error));
    },
    handleSearchFlightsResponse(response) {
      this.flights = response.data;
      console.log(this.flights);
    },
  },
  beforeMount() {
    this.getCities();
  }
}
</script>
