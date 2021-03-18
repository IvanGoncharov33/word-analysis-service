package ru.goncharov.analyzer.handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler(EmptyInputWordException.class)
    protected ResponseEntity<?> handleEmptyInputWordException(EmptyInputWordException exception){
        String errorMessage = "Message: " + exception.getMessage();
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(RuntimeException.class)
    protected  ResponseEntity<?> handleRuntimeException(RuntimeException exception){
        String errorMessage = "Message: internal server error, try again later.";
        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
