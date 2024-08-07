package com.mjrfusion.code.physics.kinematics.uvm;

import com.mjrfusion.code.physics.kinematics.uvm.UniformlyVariedMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed1Test {
    private UniformlyVariedMovement uvm;

    public Speed1Test () {
        uvm = new UniformlyVariedMovement();
    }

    @Test
    public void speed1Test () {
        double deltaTime = 3.0;
        double acceleration = 9.0;
        double result = 27.0;
        assertEquals(result, uvm.speed1(deltaTime, acceleration).getResult());
    }
}
