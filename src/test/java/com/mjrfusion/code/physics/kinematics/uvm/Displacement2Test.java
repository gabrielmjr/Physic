package com.mjrfusion.code.physics.kinematics.uvm;

import com.mjrfusion.code.physics.kinematics.uvm.UniformlyVariedMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement2Test {
    private UniformlyVariedMovement uvm;

    public Displacement2Test () {
        uvm = new UniformlyVariedMovement();
    }

    @Test
    public void displacement2Test () {
        double initialVelocity = 6.0;
        double deltaTime = 2.0;
        double acceleration = 3.0;
        double displacement = 21.0;
        double result = 3.0;
        assertEquals(result, uvm.displacement2(initialVelocity, deltaTime, acceleration, displacement).getResult());
    }
}
