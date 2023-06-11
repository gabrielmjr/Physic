package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Acceleration2Test {
    private MUV muv;

    public Acceleration2Test () {
        muv = new MUV();
    }

    @Test
    public void acceleration2Test () {
        double deltaSpeed = 9.0;
        double initialTime = 3.0;
        double finalTime = 6.0;
        double result = 3.0;
        assertEquals(result, muv.acceleration2(deltaSpeed, initialTime, finalTime).getResult());
    }
}
