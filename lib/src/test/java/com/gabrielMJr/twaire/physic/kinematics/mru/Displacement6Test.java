package com.gabrielMJr.twaire.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

public class Displacement6Test {
    private MRU mru;

    public Displacement6Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void displacement6Test () {
        Double initialDisplacement = 3.5;
        Double velocity = 5.5;
        Double deltaTime = 9.0;
        String result = "53.0";
        assertEquals(result, mru.displacement6(initialDisplacement, velocity, deltaTime, GET_RESULT));
    }
}
