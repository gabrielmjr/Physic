package com.mjr.twaire.code.physic.kinematics.uvm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Acceleration3Test {
    private UniformlyVariedMovement uvm;

    public Acceleration3Test () {
        uvm = new UniformlyVariedMovement();
    }

    @Test
    public void acceleration3Test () {
        double initialVelocity = 3.0;
        double finalVelocity = 9.0;
        double deltaTime = 8.0;
        double result = 0.75;
        assertEquals(result, uvm.acceleration3(initialVelocity, finalVelocity, deltaTime).getResult());
    }
}
