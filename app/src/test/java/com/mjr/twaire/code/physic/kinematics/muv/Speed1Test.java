package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed1Test {
    private MUV muv;

    public Speed1Test () {
        muv = new MUV();
    }

    @Test
    public void speed1Test () {
        double deltaTime = 3.0;
        double acceleration = 9.0;
        double result = 27.0;
        assertEquals(result, muv.speed1(deltaTime, acceleration).getResult());
    }
}
