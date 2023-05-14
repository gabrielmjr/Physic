package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time1Test {
    private MRU mru;

    public Time1Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void time1Test () {
        Double initialTime = 3.5;
        Double finalTime = 8.5;
        String result = "5.0";
        assertEquals(result, mru.time1(initialTime, finalTime));
    }
}
