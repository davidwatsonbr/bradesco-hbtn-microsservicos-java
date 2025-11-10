package com.example.demo.exception;

import com.example.demo.exception.CPFException;
import com.example.demo.exception.UserErrorResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;

@ControllerAdvice
public class ExceptionService {
    @ExceptionHandler
    ResponseEntity<CPFException> handleException(CPFException err) {
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.BAD_REQUEST.value());
        uer.setMessage("You have entered CPF " + err.getMessage() + " invalid.");
        return new ResponseEntity(uer, HttpStatus.BAD_REQUEST);
    }
}
