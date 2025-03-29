package com.example.flyhigh.service;

import com.example.flyhigh.controller.CityDto;
import com.example.flyhigh.controller.FlightDto;
import com.example.flyhigh.persistence.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class SearchFlightsService {

    public List<FlightDto> findFlights(String startCity, String endCity, LocalDate date, Integer maxPrice) {
        ArrayList<FlightDto> matchingFlights = new ArrayList<>();
        for (FlightDto flight : FlightRepository.allFlights()) {
            if (flight.hasStartCityIfNotNull(startCity)
                    && flight.hasEndCityIfNotNull(endCity)
                    && flight.hasDateIfNotNull(date)
                    && flight.cheaperThanIfNotNull(maxPrice)) {
                matchingFlights.add(flight);
            }
        }
        return matchingFlights;
    }

    public List<CityDto> allCities() {
        Set<String> names = new HashSet<>();

        for (FlightDto flight : FlightRepository.allFlights()) {
            names.add(flight.getStartCity());
            names.add(flight.getEndCity());
        }

        ArrayList<CityDto> cities = new ArrayList<>();
        for (String name : names) {
            cities.add(new CityDto(name));
        }

        return cities;
    }
}
