package com.gabrielMJr.twaire.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement5Test {
    private MRU mru;

    public Displacement5Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void displacement5Test () {
        Double initialDisplacement = 3.5;
        Double deltaDisplacement = 5.5;
        String result = "9.0";
        assertEquals(result, mru.displacement5(initialDisplacement, deltaDisplacement));
    }
}
