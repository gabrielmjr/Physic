package com.mjr.twaire.code.physic.kinematics.uvm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed2Test {
    private UniformlyVariedMovement uvm;

    public Speed2Test () {
        uvm = new UniformlyVariedMovement();
    }

    @Test
    public void speed2Test () {
        double initialTime = 4.0;
        double finalTime = 8.0;
        double acceleration = 9.0;
        double result = 36.0;
        assertEquals(result, uvm.speed2(initialTime, finalTime, acceleration).getResult());
    }
}
