package com.gabrielMJr.twaire.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

public class Displacement3Test {
    private MRU mru;

    public Displacement3Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void displacement3Test () {
        Double initialTime = 3.5;
        Double finalTime = 5.5;
        Double mediaSpeed = 9.0;
        String result = "18.0";
        assertEquals(result, mru.displacement3(initialTime, finalTime, mediaSpeed, GET_RESULT));
    }
}
