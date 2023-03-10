package com.gabrielMJr.twaire.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

public class Acceleration2Test {
    private MUV muv;

    public Acceleration2Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void acceleration2Test () {
        Double deltaSpeed = 9.0;
        Double initialTime = 3.0;
        Double finalTime = 6.0;
        String result = "3.0";
        assertEquals(result, muv.acceleration2(deltaSpeed, initialTime, finalTime, GET_RESULT));
    }
}
