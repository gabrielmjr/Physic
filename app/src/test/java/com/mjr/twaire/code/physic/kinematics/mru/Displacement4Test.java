package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement4Test {
    private MRU mru;

    public Displacement4Test() {
        mru = new MRU();
    }

    @Test
    public void displacement4Test() {
        double deltaDisplacement = 3.5;
        double finalDisplacement = 5.5;
        double result = 2.0;
        assertEquals(result, mru.displacement4(deltaDisplacement, finalDisplacement).getResult());
    }
}
