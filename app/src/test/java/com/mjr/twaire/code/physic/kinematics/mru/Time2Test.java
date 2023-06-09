package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time2Test {
    private MRU mru;

    public Time2Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void time2Test () {
        double deltaDisplacement = 9.6;
        double velocity = 5.0;
        double result = 1.92;
        assertEquals(result, mru.time2(deltaDisplacement, velocity).getResult());
    }
}