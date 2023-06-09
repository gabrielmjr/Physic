package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.mjr.twaire.code.physic.Physic.GET_RESULT;

public class Time3Test {
    private MUV muv;

    public Time3Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void time3Test () {
        double finalTime = 9.0;
        double deltaSpeed = 3.0;
        double acceleration = 5.0;
        double result = 8.4;
        assertEquals(result, muv.time3(finalTime, deltaSpeed, acceleration).getResult());
    }
}
