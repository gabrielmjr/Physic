package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.mjr.twaire.code.physic.Physic.GET_RESULT;

public class Time3Test {
    private MRU mru;

    public Time3Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void time3Test () {
        double initialDisplacement = 3.5;
        double finalDisplacement = 5.5;
        double velocity = 8.0;
        double result = 0.25;
        assertEquals(result, mru.time3(initialDisplacement, finalDisplacement, velocity).getResult());
    }
}
