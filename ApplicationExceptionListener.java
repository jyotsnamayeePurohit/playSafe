package com.playsafe.assessment.part1.exception;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionListener {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    private class ResponseValueModel {
        private String message;
    }

    @ExceptionHandler
    public ResponseEntity<ResponseValueModel> handleMissingServletRequestParameterException(MissingServletRequestParameterException e) {
        return new ResponseEntity<>(new ResponseValueModel(e.getMessage()), HttpStatus.BAD_GATEWAY);
    }

}
