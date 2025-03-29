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
            <button @click="handleSearchFlights" type="button" class="btn btn-outline-success">Otsi</button>
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <hr>
    </div>
    <div class="row">
      <div class="col">
        Lendude tabel
      </div>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
// import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'SearchFlight',
  components: {
    // HelloWorld
  },
  methods: {
    handleSearchFlights() {
      console.log("searchFlights");
    }
  }
}
</script>
