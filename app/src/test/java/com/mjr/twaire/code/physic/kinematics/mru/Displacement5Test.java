package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement5Test {
    private MRU mru;

    public Displacement5Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void displacement5Test () {
        double initialDisplacement = 3.5;
        double deltaDisplacement = 5.5;
        double result = 9.0;
        assertEquals(result, mru.displacement5(initialDisplacement, deltaDisplacement).getResult());
    }
}
