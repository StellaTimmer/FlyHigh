package com.example.flyhigh.controller;

import com.example.flyhigh.service.SearchFlightsService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class SearchFlightsController {

    private final SearchFlightsService searchFlightsService;

    @GetMapping("/flights/search")
    @Operation(summary = "Searches for available flights")
    public List<FlightDto> searchFlights(
            @RequestParam(required = false) String startCity,
            @RequestParam(required = false) String endCity,
            @RequestParam(required = false) String date,
            @RequestParam(required = false) Integer maxPrice
    ) {
        startCity = cityOrNull(startCity);
        endCity = cityOrNull(endCity);

        LocalDate parsedDate = null;
        if (date != null && !date.isEmpty()) {
            parsedDate = LocalDate.parse(date);
        };

        return searchFlightsService.findFlights(startCity, endCity, parsedDate, maxPrice);
    }

    @GetMapping("/flights/cities")
    @Operation(summary = "Get all available cities")
    public List<CityDto> allCities() {
        return searchFlightsService.allCities();
    }

    private String cityOrNull(String city) {
        if (city == null) { return null; }
        if (city.isEmpty()) { return null; }
        return city;
    }

}
