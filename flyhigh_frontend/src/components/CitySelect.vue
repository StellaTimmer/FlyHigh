<template>
  <select class="form-select" v-model="selectedCity">
    <option value=""></option>
    <option v-for="city in cities" :key="city.name" :value="city.name">{{ city.name }}</option>
  </select>
</template>


<script>
export default {
  name: 'CitySelect',
  props: {
    cities: { type: Array, required: true },
  },
  data() {
    return {
      selectedCity: null,
    }
  }
}


</script>