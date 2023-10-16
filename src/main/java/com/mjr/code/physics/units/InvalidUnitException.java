package com.mjr.code.physics.units;

import com.mjr.code.physics.PhysicException;

public class InvalidUnitException extends PhysicException {
    public InvalidUnitException(String message) {
        super(message);
    }
    
    public InvalidUnitException(String message, Throwable cause) {
        super(message, cause);
    }
}
