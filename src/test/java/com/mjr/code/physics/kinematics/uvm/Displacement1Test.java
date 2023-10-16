package com.mjr.code.physics.physics.kinematics.uvm;

import com.mjr.code.physics.kinematics.uvm.UniformlyVariedMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement1Test {
    private UniformlyVariedMovement uvm;

    public Displacement1Test () {
        uvm = new UniformlyVariedMovement();
    }
	
    @Test
    public void displacement1Test () {
        double initialDisplacement = 3.0;
        double initialVelocity = 6.0;
        double deltaTime = 2.0;
        double acceleration= 3.0;
        double result = 21.0;
        assertEquals(result, uvm.displacement1(initialDisplacement, initialVelocity, deltaTime, acceleration).getResult());
    }
}
