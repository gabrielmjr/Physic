package com.mjr.twaire.code.physic.kinematics.uvm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Acceleration2Test {
    private UniformlyVariedMovement uvm;

    public Acceleration2Test () {
        uvm = new UniformlyVariedMovement();
    }

    @Test
    public void acceleration2Test () {
        double deltaSpeed = 9.0;
        double initialTime = 3.0;
        double finalTime = 6.0;
        double result = 3.0;
        assertEquals(result, uvm.acceleration2(deltaSpeed, initialTime, finalTime).getResult());
    }
}
