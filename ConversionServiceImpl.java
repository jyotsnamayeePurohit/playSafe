package com.playsafe.assessment.part1.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConversionServiceImpl implements ConversionService {

    private static final double KELVIN_ABSOLUTE_ZERO = 273.15;

    private static final double MILE_KILOMETER_CONSTANT = 1.609344;

    @Override
    public Double convertKelvinToCelsius(Double kelvinValue) {
        long startTime = System.currentTimeMillis();
        double c = kelvinValue - KELVIN_ABSOLUTE_ZERO;
        logMethodExecutionDuration(startTime, "convertKelvinToCelsius", kelvinValue);
        return c;
    }

    @Override
    public Double convertCelsiusToKelvin(Double celsiusValue) {
        long startTime = System.currentTimeMillis();
        double kelvin = celsiusValue + KELVIN_ABSOLUTE_ZERO;
        logMethodExecutionDuration(startTime, "convertCelsiusToKelvin", celsiusValue);
        return kelvin;
    }

    @Override
    public Double convertMilesToKilometers(Double mileValue) {
        long startTime = System.currentTimeMillis();
        double kilometers = mileValue * MILE_KILOMETER_CONSTANT;
        logMethodExecutionDuration(startTime, "convertMilesToKilometers", mileValue);
        return kilometers;
    }

    @Override
    public Double convertKilometersToMiles(Double kilometerValue) {
        long startTime = System.currentTimeMillis();
        double miles = kilometerValue / MILE_KILOMETER_CONSTANT;
        logMethodExecutionDuration(startTime, "convertKilometersToMiles", kilometerValue);
        return miles;
    }

    private void logMethodExecutionDuration(long startTime, String methodName, Double inputValue) {
        //log.info("{}(Double {}) took " + (System.currentTimeMillis() - startTime) + " milliseconds", methodName, inputValue);
    }
}
