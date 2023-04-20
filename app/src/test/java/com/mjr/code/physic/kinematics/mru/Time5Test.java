package com.mjr.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time5Test {
    private MRU mru;

    public Time5Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void time5Test () {
        Double initialTime = 3.5;
        Double deltaTime = 5.5;
        String result = "9.0";
        assertEquals(result, mru.time5(initialTime, deltaTime));
    }
}
