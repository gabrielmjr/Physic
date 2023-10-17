package com.mjr.code.physics.kinematics.uvm;

import com.mjr.code.physics.kinematics.uvm.UniformlyVariedMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed4Test {
    private UniformlyVariedMovement uvm;

    public Speed4Test () {
        uvm = new UniformlyVariedMovement();
    }

    @Test
    public void speed4Test () {
        double deltaTime = 8.0;
        double acceleration = 3.0;
        double initialVelocity = 10.0;
        double result = 34.0;
        assertEquals(result, uvm.speed4(initialVelocity, deltaTime, acceleration).getResult());
    }
}
