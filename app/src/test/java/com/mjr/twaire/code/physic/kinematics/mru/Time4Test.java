package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time4Test {
    private MRU mru;

    public Time4Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void time4Test () {
        Double deltaTime = 3.5;
        Double finalTime = 19.5;
        String result = "16.0";
        assertEquals(result, mru.time4(deltaTime, finalTime));
    }
}
