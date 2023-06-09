package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.mjr.twaire.code.physic.Physic.GET_RESULT;

public class Time2Test {
    private MUV muv;

    public Time2Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void time2Test () {
        double initialVelocity = 3.0;
        double finalVelocity = 9.0;
        double acceleration = 8.0;
        double result = 0.75;
        assertEquals(result, muv.time2(initialVelocity, finalVelocity, acceleration).getResult());;
    }
}
