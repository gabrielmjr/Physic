package com.gabrielmjr.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielmjr.physic.Physic.GET_RESULT;

public class Speed4Test {
    private MUV muv;

    public Speed4Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void speed4Test () {
        Double deltaTime = 8.0;
        Double acceleration = 3.0;
        Double initialVelocity = 10.0;
        String result = "34.0";
        assertEquals(result, muv.speed4(initialVelocity, deltaTime, acceleration, GET_RESULT));
    }
}
