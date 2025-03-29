import axios from "axios";

export default {

    searchFlights() {
        return axios.get('/flights/search', {
            params: {

            }
        })
    },
}