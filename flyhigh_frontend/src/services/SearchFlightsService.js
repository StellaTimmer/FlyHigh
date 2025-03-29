import axios from "axios";

export default {

    searchFlights(startCity, endCity, date, maxPrice) {
        return axios.get('/flights/search', {
            params: {
                startCity: startCity,
                endCity: endCity,
                date: date,
                maxPrice: maxPrice
            }
        })
    },

    getAllCities() {
        return axios.get('/flights/cities', {})
    }
}