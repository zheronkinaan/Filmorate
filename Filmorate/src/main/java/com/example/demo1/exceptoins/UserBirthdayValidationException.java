package com.example.demo1.exceptoins;

public class UserBirthdayValidationException extends RuntimeException {
    public UserBirthdayValidationException(String msg) {
        super(msg);
    }
}
