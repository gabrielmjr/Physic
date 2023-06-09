package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time1Test {
    private MUV muv;

    public Time1Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void time1Test () {
        double deltaSpeed = 3.0;
        double acceleration = 8.0;
        double result = 0.375;
        assertEquals(result, muv.time1(deltaSpeed, acceleration).getResult());
    }
}
