package com.james.springdemo.handler;

import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler({CannotGetJdbcConnectionException.class})
    public String dbConnFailHandler(){


        return "error";

}

}
