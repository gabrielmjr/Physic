package com.gabrielmjr.twaire.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielmjr.twaire.physic.Physic.GET_RESULT;

public class Acceleration3Test {
    private MUV muv;

    public Acceleration3Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void acceleration3Test () {
        Double initialVelocity = 3.0;
        Double finalVelocity = 9.0;
        Double deltaTime = 8.0;
        String result = "0.75";
        assertEquals(result, muv.acceleration3(initialVelocity, finalVelocity, deltaTime, GET_RESULT));
    }
}
