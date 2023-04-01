package com.gabrielmjr.twaire.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielmjr.twaire.physic.Physic.GET_RESULT;

public class Time3Test {
    private MUV muv;

    public Time3Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void time3Test () {
        Double finalTime = 9.0;
        Double deltaSpeed = 3.0;
        Double acceleration = 5.0;
        String result = "8.4";
        assertEquals(result, muv.time3(finalTime, deltaSpeed, acceleration, GET_RESULT));
    }
}
