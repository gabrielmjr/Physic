package com.gabrielMJr.twaire.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

public class Speed2Test {
    private MUV muv;

    public Speed2Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void speed2Test () {
        Double initialTime = 4.0;
        Double finalTime = 8.0;
        Double acceleration = 9.0;
        String result = "36.0";
        assertEquals(result, muv.speed2(initialTime, finalTime, acceleration, GET_RESULT));
    }
}
