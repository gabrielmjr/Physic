package com.gabrielMJr.twaire.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

public class Time2Test {
    private MUV muv;

    public Time2Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void time2Test () {
        Double initialVelocity = 3.0;
        Double finalVelocity = 9.0;
        Double acceleration = 8.0;
        String result = "0.75";
        assertEquals(result, muv.time2(initialVelocity, finalVelocity, acceleration, GET_RESULT));
    }
}
