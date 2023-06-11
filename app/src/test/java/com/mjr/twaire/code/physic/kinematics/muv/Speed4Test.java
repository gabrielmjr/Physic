package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed4Test {
    private MUV muv;

    public Speed4Test () {
        muv = new MUV();
    }

    @Test
    public void speed4Test () {
        double deltaTime = 8.0;
        double acceleration = 3.0;
        double initialVelocity = 10.0;
        double result = 34.0;
        assertEquals(result, muv.speed4(initialVelocity, deltaTime, acceleration).getResult());
    }
}
