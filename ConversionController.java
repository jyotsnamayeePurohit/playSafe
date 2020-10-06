package com.playsafe.assessment.part1.web.rest;

import com.playsafe.assessment.part1.service.ConversionService;
import lombok.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/conversions", produces = MediaType.APPLICATION_JSON_VALUE)
public class ConversionController {

    public final ConversionService conversionService;

    public ConversionController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }


    @GetMapping(value = "/ktoc")
    public ResponseEntity<Double> convertKelvinTocToCelsius(@RequestParam @NonNull Double kelvin) {
        return new ResponseEntity<>(conversionService.convertKelvinToCelsius(kelvin), HttpStatus.OK);
    }

    @GetMapping(value = "/ctok")
    public ResponseEntity<Double> convertCelsiusToKelvin(@RequestParam @NonNull Double celsius) {
        return new ResponseEntity<>(conversionService.convertCelsiusToKelvin(celsius), HttpStatus.OK);
    }

    @GetMapping(value = "/mtok")
    public ResponseEntity<Double> convertMilesToKilometer(@RequestParam @NonNull Double miles) {
        return new ResponseEntity<>(conversionService.convertMilesToKilometers(miles), HttpStatus.OK);
    }

    @GetMapping(value = "/ktom")
    public ResponseEntity<Double> convertKilometerToMiles(@RequestParam @NonNull Double kilometers) {
        return new ResponseEntity<>(conversionService.convertKilometersToMiles(kilometers), HttpStatus.OK);
    }
}
