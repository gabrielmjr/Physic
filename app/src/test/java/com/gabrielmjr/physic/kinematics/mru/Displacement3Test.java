package com.gabrielmjr.physic.kinematics.mru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement3Test {
    private MRU mru;

    public Displacement3Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void displacement3Test () {
        double initialTime = 3.5;
        double finalTime = 5.5;
        double mediaSpeed = 9.0;
        double result = 18.0;
        assertEquals(result, mru.displacement3(initialTime, finalTime, mediaSpeed).getResult());
    }
}
