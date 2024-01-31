package com.example.locker.exception;

public class PickupCodeExpiredException extends Exception {
    public PickupCodeExpiredException(String message) {
        super(message);
    }
}
