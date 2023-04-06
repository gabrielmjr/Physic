package com.gabrielmjr.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed1Test {
    private MRU mru;

    public Speed1Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void speed1Test () {
        Double deltaDisplacement = 8.0;
        Double deltaTime = 5.0;
        String result = "1.6";
        assertEquals(result, mru.speed1(deltaDisplacement, deltaTime));
    }
}
