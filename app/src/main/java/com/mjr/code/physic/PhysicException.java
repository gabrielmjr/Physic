package com.mjr.code.physic;

public class PhysicException extends Exception {
    public PhysicException(String message) { 
        super(message);
    }
    
    public PhysicException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
