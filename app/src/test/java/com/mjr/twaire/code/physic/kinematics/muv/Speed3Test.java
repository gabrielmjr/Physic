package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed3Test {
    private MUV muv;

    public Speed3Test() {
        muv = new MUV();
    }

    @Test
    public void speed3Test() {
        double finalVelocity = 36.0;
        double deltaTime = 3.0;
        double acceleration = 9.0;
        double result = 9.0;
        assertEquals(result, muv.speed3(finalVelocity, deltaTime, acceleration).getResult());
    }
}
