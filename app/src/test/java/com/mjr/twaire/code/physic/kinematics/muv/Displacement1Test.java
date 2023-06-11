package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement1Test {
    private MUV muv;

    public Displacement1Test () {
        muv = new MUV();
    }
	
    @Test
    public void displacement1Test () {
        double initialDisplacement = 3.0;
        double initialVelocity = 6.0;
        double deltaTime = 2.0;
        double acceleration= 3.0;
        double result = 21.0;
        assertEquals(result, muv.displacement1(initialDisplacement, initialVelocity, deltaTime, acceleration).getResult());
    }
}
