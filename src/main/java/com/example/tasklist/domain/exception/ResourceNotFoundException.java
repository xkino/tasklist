package com.example.tasklist.domain.exception;

// не проверяемое исключение
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
