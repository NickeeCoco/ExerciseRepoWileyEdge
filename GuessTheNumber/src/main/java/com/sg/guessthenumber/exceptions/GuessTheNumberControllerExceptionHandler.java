/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.exceptions;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

/**
 *
 * @author Nickee Coco
 */
@ControllerAdvice
@RestController
public class GuessTheNumberControllerExceptionHandler {
    
    @ExceptionHandler(GuessTheNumberFinishedGameException.class)
    public final ResponseEntity<Error> handleException(
            GuessTheNumberFinishedGameException ex,
            WebRequest request) {
        
        Error err = new Error();
        err.setMessage(ex.getMessage());
        err.setTimestamp(LocalDateTime.now());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(GuessTheNumberInvalidAnswerException.class)
    public final ResponseEntity<Error> handleException(
            GuessTheNumberInvalidAnswerException ex,
            WebRequest request) {
        
        Error err = new Error();
        err.setMessage(ex.getMessage());
        err.setTimestamp(LocalDateTime.now());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(GuessTheNumberInvalidAnswerTypeException.class)
    public final ResponseEntity<Error> handleException(
            GuessTheNumberInvalidAnswerTypeException ex,
            WebRequest request) {
        
        Error err = new Error();
        err.setMessage(ex.getMessage());
        err.setTimestamp(LocalDateTime.now());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(GuessTheNumberInvalidGameIdException.class)
    public final ResponseEntity<Error> handleException(
            GuessTheNumberInvalidGameIdException ex,
            WebRequest request) {
        
        Error err = new Error();
        err.setMessage(ex.getMessage());
        err.setTimestamp(LocalDateTime.now());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(InvalidFormatException.class)
    public final ResponseEntity<Error> handleException(
            InvalidFormatException ex,
            WebRequest request) {
        
        Error err = new Error();
        err.setMessage("You entered an invalid ID. Make sure it is an integer.");
        err.setTimestamp(LocalDateTime.now());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
}
