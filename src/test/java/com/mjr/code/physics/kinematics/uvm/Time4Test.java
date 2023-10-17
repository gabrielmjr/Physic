package com.mjr.code.physics.kinematics.uvm;

import com.mjr.code.physics.kinematics.uvm.UniformlyVariedMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time4Test {
    private UniformlyVariedMovement uvm;

    public Time4Test () {
        uvm = new UniformlyVariedMovement();
    }

    @Test
    public void time4Test () {
        double initialTime = 8.4;
        double deltaSpeed = 3.0;
        double acceleration = 5.0;
        double result = 9.0;
        assertEquals(result, uvm.time4(initialTime, deltaSpeed, acceleration).getResult());
    }
}
