package com.mjr.code.physics.physics.kinematics.uvm;

import com.mjr.code.physics.kinematics.uvm.UniformlyVariedMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time2Test {
    private UniformlyVariedMovement uvm;

    public Time2Test () {
        uvm = new UniformlyVariedMovement();
    }

    @Test
    public void time2Test () {
        double initialVelocity = 3.0;
        double finalVelocity = 9.0;
        double acceleration = 8.0;
        double result = 0.75;
        assertEquals(result, uvm.time2(initialVelocity, finalVelocity, acceleration).getResult());;
    }
}
