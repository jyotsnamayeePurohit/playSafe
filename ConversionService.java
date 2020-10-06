package com.playsafe.assessment.part1.service;

/**
 * A service responsible for the conversion of values between various measurement scales.
 *
 * @author Ndumiso
 */
public interface ConversionService {

    /**
     * Should return an output amount in celsius when given an input amount in kelvin.
     *
     * @param kelvinValue - The input amount in kelvin
     * @return - The output amount in celsius
     */
    Double convertKelvinToCelsius(Double kelvinValue);

    /**
     * Should return an output amount in kelvin when given an input amount in celsius.
     *
     * @param celsiusValue - The input amount in celsius
     * @return - The output amount in kelvin
     */
    Double convertCelsiusToKelvin(Double celsiusValue);

    /**
     * Should return, when given an input amount in miles, an output amount in kilometers.
     *
     * @param mileValue - The input amount in miles
     * @return - The output amount in kilometers
     */
    Double convertMilesToKilometers(Double mileValue);


    /**
     * Should return, when given an input amount in kilometers, an output amount in miles.
     *
     * @param kilometerValue - The input amount in kilometers
     * @return - The output amount in miles
     */
    Double convertKilometersToMiles(Double kilometerValue);

}
