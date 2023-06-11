package com.mjr.twaire.code.physic.kinematics.uvm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time1Test {
    private UniformlyVariedMovement uvm;

    public Time1Test () {
        uvm = new UniformlyVariedMovement();
    }

    @Test
    public void time1Test () {
        double deltaSpeed = 3.0;
        double acceleration = 8.0;
        double result = 0.375;
        assertEquals(result, uvm.time1(deltaSpeed, acceleration).getResult());
    }
}
