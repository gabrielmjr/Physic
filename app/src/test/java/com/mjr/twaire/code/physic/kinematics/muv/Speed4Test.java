package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.mjr.twaire.code.physic.Physic.GET_RESULT;

public class Speed4Test {
    private MUV muv;

    public Speed4Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void speed4Test () {
        double deltaTime = 8.0;
        double acceleration = 3.0;
        double initialVelocity = 10.0;
        double result = 34.0;
        assertEquals(result, muv.speed4(initialVelocity, deltaTime, acceleration).getResult());
    }
}
