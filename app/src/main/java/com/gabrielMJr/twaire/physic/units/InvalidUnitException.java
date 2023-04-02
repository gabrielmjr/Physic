package com.gabrielmjr.twaire.physic.units;

public class InvalidUnitException extends Exception{
    public InvalidUnitException(String message) {
        super(message);
    }
    
    public InvalidUnitException(String message, Throwable cause) {
        super(message, cause);
    }
}
