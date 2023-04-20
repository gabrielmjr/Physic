package com.mjr.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time1Test {
    private MUV muv;

    public Time1Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void time1Test () {
        Double deltaSpeed = 3.0;
        Double acceleration = 8.0;
        String result = "0.375";
        assertEquals(result, muv.time1(deltaSpeed, acceleration));
    }
}
