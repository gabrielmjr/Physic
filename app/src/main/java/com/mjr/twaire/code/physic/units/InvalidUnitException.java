package com.mjr.twaire.code.physic.units;

import com.mjr.twaire.code.physic.PhysicException;

public class InvalidUnitException extends PhysicException {
    public InvalidUnitException(String message) {
        super(message);
    }
    
    public InvalidUnitException(String message, Throwable cause) {
        super(message, cause);
    }
}
