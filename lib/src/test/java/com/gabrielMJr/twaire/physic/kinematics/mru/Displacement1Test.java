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
        Double initialDisplacement = 3.2;
        Double finalDisplacement = 6.2;
        String result = "3.0";
        assertEquals(result, mru.displacement1(initialDisplacement, finalDisplacement));
    }
}
