package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.mjr.twaire.code.physic.Physic.GET_RESULT;

public class Displacement1Test {
    private MUV muv;

    public Displacement1Test () {
        muv = MUV.getInstance();
    }
	
    @Test
    public void displacement1Test () {
        Double initialDisplacement = 3.0;
        Double initialVelocity = 6.0;
        Double deltaTime = 2.0;
        Double acceleration= 3.0;
        String result = "21.0";
        assertEquals(result, muv.displacement1(initialDisplacement, initialVelocity, deltaTime, acceleration, GET_RESULT));
    }
}
