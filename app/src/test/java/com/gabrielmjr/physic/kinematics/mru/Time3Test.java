package com.gabrielmjr.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielmjr.physic.Physic.GET_RESULT;

public class Time3Test {
    private MRU mru;

    public Time3Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void time3Test () {
        Double initialDisplacement = 3.5;
        Double finalDisplacement = 5.5;
        Double velocity = 8.0;
        String result = "0.25";
        assertEquals(result, mru.time3(initialDisplacement, finalDisplacement, velocity, GET_RESULT));
    }
}
