package com.mjr.code.physics.kinematics.uvm;

import com.mjr.code.physics.kinematics.uvm.UniformlyVariedMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time3Test {
    private UniformlyVariedMovement uvm;

    public Time3Test () {
        uvm = new UniformlyVariedMovement();
    }

    @Test
    public void time3Test () {
        double finalTime = 9.0;
        double deltaSpeed = 3.0;
        double acceleration = 5.0;
        double result = 8.4;
        assertEquals(result, uvm.time3(finalTime, deltaSpeed, acceleration).getResult());
    }
}
