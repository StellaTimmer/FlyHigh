<template>

  <div>
    <div class="container text-center">
      <div class="row">
        <div class="col">
          Eelistused
        </div>
        <div class="col">

        </div>
      </div>
      <br>
      <div class="row">

        <hr>
      </div>
    </div>
    <div class="row">
      <div class="col">
        <div class="lennuk">
          ABC DEF<br>
          ABC DEF<br>
          ABC DEF<br>
          ABC DEF<br>
          ABC DEF<br>
          ABC DEF<br>
          ABC DEF<br>
          ABC DEF<br>
          ABC DEF<br>
          ABC DEF<br>
          ABC DEF<br>
          ABC DEF<br>
          ABC DEF<br>
        </div>
      </div>
    </div>

    
  </div>

</template>

<script>


import CitySelect from "@/components/CitySelect.vue";

export default {
  name: 'SeatsSelection',
  components: {
    CitySelect
  },
  data() {
    return {}
  }
}
</script>



<style scoped>

.lennuk {
  background-image: url("@/assets/lennuk.png");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-position: center;
  height: 1200px;
}
</style>