package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed1Test {
    private UniformRectilinearMovement mru;

    public Speed1Test () {
        mru = new  UniformRectilinearMovement();
    }

    @Test
    public void speed1Test () {
        Double deltaDisplacement = 8.0;
        Double deltaTime = 5.0;
        double result = 1.6;
        assertEquals(result, mru.speed1(deltaDisplacement, deltaTime).getResult());
    }
}
