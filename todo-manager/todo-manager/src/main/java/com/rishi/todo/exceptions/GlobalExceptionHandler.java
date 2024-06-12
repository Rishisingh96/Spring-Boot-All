package com.rishi.todo.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {
    Logger logger =  LoggerFactory.getLogger(GlobalExceptionHandler.class);
    //We have created handler methods for specific exception
    @ExceptionHandler(NullPointerException.class)  // for single exception
    public ResponseEntity<String> nullPointerExceptionHandler(NullPointerException ex){

        logger.info("Its Null pointer exception from Global handler");
        return new ResponseEntity<>("Null pointer exception generated" + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    //handling resource
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handlerResourceNotFoundException(ResourceNotFoundException ex) {
        logger.error("ERROR : {}",ex.getMessage());
        ExceptionResponse response = new ExceptionResponse();
        response.setMessage(ex.getMessage());
        response.setStatus(HttpStatus.NOT_FOUND);
        response.setSuccess(false);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

    }

}
