package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time1Test {
    private MRU mru;

    public Time1Test () {
        mru = new MRU();
    }

    @Test
    public void time1Test () {
        double initialTime = 3.5;
        double finalTime = 8.5;
        double result = 5.0;
        assertEquals(result, mru.time1(initialTime, finalTime).getResult());
    }
}
