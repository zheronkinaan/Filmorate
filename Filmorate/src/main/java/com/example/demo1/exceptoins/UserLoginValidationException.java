package com.example.demo1.exceptoins;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class UserLoginValidationException extends RuntimeException {
    public UserLoginValidationException(String msg) {
        super(msg);
    }

}
