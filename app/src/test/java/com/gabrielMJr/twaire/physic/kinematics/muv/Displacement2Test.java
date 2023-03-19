package com.gabrielMJr.twaire.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

public class Displacement2Test {
    private MUV muv;

    public Displacement2Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void displacement2Test () {
        Double initialVelocity = 6.0;
        Double deltaTime = 2.0;
        Double acceleration = 3.0;
        Double displacement = 21.0;
        String result = "3.0";
        assertEquals(result, muv.displacement2(initialVelocity, deltaTime, acceleration, displacement, GET_RESULT));
    }
}
