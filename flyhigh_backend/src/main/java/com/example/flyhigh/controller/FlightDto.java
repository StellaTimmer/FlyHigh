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

    public boolean hasStartCityIfNotNull(String city) {
        return city == null || this.startCity.equals(city);
    }

    public boolean hasEndCityIfNotNull(String city) {
        return city == null || this.endCity.equals(city);
    }

    public boolean hasDateIfNotNull(LocalDate date) {
        return date == null || this.date.equals(date);
    }

    public boolean cheaperThanIfNotNull(Integer maxPrice) {
        return maxPrice == null || priceEuros <= maxPrice;
    }


}
