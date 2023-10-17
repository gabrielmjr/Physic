package com.mjr.code.physics.kinematics.uvm;

import com.mjr.code.physics.kinematics.uvm.UniformlyVariedMovement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Acceleration1Test {
    private UniformlyVariedMovement uvm;

    public Acceleration1Test () {
        uvm = new UniformlyVariedMovement();
	}

    @Test
    public void acceleration1Test () {
        Double deltaSpeed = 9.0;
        Double deltaTime = 3.2;
        double result = 2.8125;
        assertEquals(result, uvm.acceleration1(deltaSpeed, deltaTime).getResult());
    }
}
