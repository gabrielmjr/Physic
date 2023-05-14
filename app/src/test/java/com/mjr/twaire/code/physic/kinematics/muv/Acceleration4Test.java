package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.mjr.twaire.code.physic.Physic.GET_RESULT;

public class Acceleration4Test {
    private MUV muv;

    public Acceleration4Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void acceleration4Test () {
        Double initialVelocity = 3.0;
        Double finalVelocity = 9.0;
        Double initialTime = 8.0;
        Double finalTime = 18.0;
        String result = "0.6";
        assertEquals(result, muv.acceleration4(initialVelocity, finalVelocity, initialTime, finalTime, GET_RESULT));
    }
}
