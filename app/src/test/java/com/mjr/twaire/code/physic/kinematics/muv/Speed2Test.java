package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.mjr.twaire.code.physic.Physic.GET_RESULT;

public class Speed2Test {
    private MUV muv;

    public Speed2Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void speed2Test () {
        double initialTime = 4.0;
        double finalTime = 8.0;
        double acceleration = 9.0;
        double result = 36.0;
        assertEquals(result, muv.speed2(initialTime, finalTime, acceleration).getResult());
    }
}
