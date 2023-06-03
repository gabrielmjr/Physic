package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.mjr.twaire.code.physic.Physic.GET_RESULT;

public class Speed3Test {
    private MRU mru;

    public Speed3Test () {
        mru = MRU.getInstance();
    }

    @Test
    public void speed3Test () {
        double initialDisplacement = 2.5;
        double finalDisplacement = 5.5;
        double deltaTime = 6.0;
        double result = 0.5;
        assertEquals(result, mru.speed3(initialDisplacement, finalDisplacement, deltaTime).getResult());
    }
}
