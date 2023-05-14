package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.mjr.twaire.code.physic.Physic.GET_RESULT;

public class Speed2Test {
    private MRU mru;

    public Speed2Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void speed2Test () {
        Double initialDisplacement = 2.5;
        Double finalDisplacement = 5.5;
        Double initialTime = 3.0;
        Double finalTime = 9.0;
        String result = "0.5";
        assertEquals(result, mru.speed2(initialDisplacement, finalDisplacement, initialTime, finalTime, GET_RESULT));
    }
}
