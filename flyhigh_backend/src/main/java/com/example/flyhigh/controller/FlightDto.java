package com.example.flyhigh.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDto {
    private int id;
    private String startCity;
    private String endCity;
    private LocalDate date;
    private LocalTime time;
    private int priceEuros;
}
