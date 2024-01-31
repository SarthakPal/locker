package com.example.locker.exception;

public class PackageSizeMappingException extends Exception {
    public PackageSizeMappingException(String message) {
        super(message);
        System.out.println(message);
    }
}
