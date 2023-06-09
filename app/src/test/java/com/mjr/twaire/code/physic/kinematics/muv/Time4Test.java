package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.mjr.twaire.code.physic.Physic.GET_RESULT;

public class Time4Test {
    private MUV muv;

    public Time4Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void time4Test () {
        double initialTime = 8.4;
        double deltaSpeed = 3.0;
        double acceleration = 5.0;
        double result = 9.0;
        assertEquals(result, muv.time4(initialTime, deltaSpeed, acceleration).getResult());
    }
}
