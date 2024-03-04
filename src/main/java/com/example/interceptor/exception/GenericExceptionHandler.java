package com.example.interceptor.exception;

import com.example.interceptor.model.ErrorDto;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GenericExceptionHandler{
    @ExceptionHandler(EmployeeNotFoundException.class)
    public ErrorDto handleEmployeeNotFoundException(EmployeeNotFoundException exception) {
        ErrorDto errorDto = new ErrorDto();
        return errorDto;
    }
}
