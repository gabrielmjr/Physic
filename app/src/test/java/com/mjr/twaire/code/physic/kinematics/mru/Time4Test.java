package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time4Test {
    private UniformRectilinearMovement mru;

    public Time4Test () {
        mru = new UniformRectilinearMovement();
    }

    @Test
    public void time4Test () {
        Double deltaTime = 3.5;
        Double finalTime = 19.5;
        double result = 16.0;
        assertEquals(result, mru.time4(deltaTime, finalTime).getResult());
    }
}
