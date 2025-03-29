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
    public List<FlightDto> searchFlights() {
        // TODO filtrid
        return searchFlightsService.findFlights();
    }

    @GetMapping("/flights/cities")
    @Operation(summary = "Get all available cities")
    public List<CityDto> allCities() {
        return searchFlightsService.allCities();
    }

}
