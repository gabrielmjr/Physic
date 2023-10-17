package com.mjr.code.physics.kinematics.uvm;

import com.mjr.code.physics.kinematics.uvm.UniformlyVariedMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Acceleration4Test {
    private UniformlyVariedMovement uvm;

    public Acceleration4Test () {
        uvm = new UniformlyVariedMovement();
    }

    @Test
    public void acceleration4Test () {
        double initialVelocity = 3.0;
        double finalVelocity = 9.0;
        double initialTime = 8.0;
        double finalTime = 18.0;
        double result = 0.6;
        assertEquals(result, uvm.acceleration4(initialVelocity, finalVelocity, initialTime, finalTime).getResult());
    }
}
