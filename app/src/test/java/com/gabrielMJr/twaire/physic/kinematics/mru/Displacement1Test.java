package com.gabrielMJr.twaire.physic.kinematics.mru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement1Test {
    private MRU mru;

    public Displacement1Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void displacement1Test () {
        double initialDisplacement = 3.2;
        double finalDisplacement = 6.2;
        double result = 3.0;
        assertEquals(result, mru.displacement1(initialDisplacement, finalDisplacement).getResult());
    }
}
