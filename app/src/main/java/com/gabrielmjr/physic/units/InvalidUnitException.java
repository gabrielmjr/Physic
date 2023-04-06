package com.gabrielmjr.physic.units;

import com.gabrielmjr.physic.PhysicException;

public class InvalidUnitException extends PhysicException {
    public InvalidUnitException(String message) {
        super(message);
    }
    
    public InvalidUnitException(String message, Throwable cause) {
        super(message, cause);
    }
}
