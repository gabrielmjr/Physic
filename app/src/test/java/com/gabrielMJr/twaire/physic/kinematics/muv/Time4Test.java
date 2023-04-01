package com.gabrielmjr.twaire.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielmjr.twaire.physic.Physic.GET_RESULT;

public class Time4Test {
    private MUV muv;

    public Time4Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void time4Test () {
        Double initialTime = 8.4;
        Double deltaSpeed = 3.0;
        Double acceleration = 5.0;
        String result = "9.0";
        assertEquals(result, muv.time4(initialTime, deltaSpeed, acceleration, GET_RESULT));
    }
}
