package com.gabrielMJr.twaire.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement2Test {
    private MRU mru;

    public Displacement2Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void displacement2Test () {
        Double deltaTime = 3.0;
        Double deltaSpeed = 4.0;
        String result = "12.0";
        assertEquals(result, mru.displacement2(deltaTime, deltaSpeed));
    }
}
