package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement2Test {
    private MUV muv;

    public Displacement2Test () {
        muv = new MUV();
    }

    @Test
    public void displacement2Test () {
        double initialVelocity = 6.0;
        double deltaTime = 2.0;
        double acceleration = 3.0;
        double displacement = 21.0;
        double result = 3.0;
        assertEquals(result, muv.displacement2(initialVelocity, deltaTime, acceleration, displacement).getResult());
    }
}
