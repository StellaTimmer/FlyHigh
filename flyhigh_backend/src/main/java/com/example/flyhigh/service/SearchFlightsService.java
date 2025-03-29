package com.example.flyhigh.service;

import com.example.flyhigh.controller.FlightDto;
import com.example.flyhigh.persistence.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchFlightsService {

    public List<FlightDto> findFlights() {
        return FlightRepository.allFlights();
    }
}
