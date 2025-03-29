package com.example.flyhigh.persistence;

import com.example.flyhigh.controller.FlightDto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;

public class FlightRepository {

    public static List<FlightDto> allFlights() {
        ArrayList<FlightDto> flights = new ArrayList<>();
        flights.add(new FlightDto(1, "Tallinn", "London", LocalDate.of(2025, 4, 15), LocalTime.of(12, 0), 300));
        flights.add(new FlightDto(2, "Tallinn", "Berlin", LocalDate.of(2025, 4, 15), LocalTime.of(12, 0), 200));
        flights.add(new FlightDto(3, "London", "Berlin", LocalDate.of(2025, 4, 16), LocalTime.of(12, 0), 400));
        return flights;
    }
}
