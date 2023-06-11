package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time5Test {
    private UniformRectilinearMovement mru;

    public Time5Test () {
        mru = new UniformRectilinearMovement();
    }

    @Test
    public void time5Test () {
        double initialTime = 3.5;
        double deltaTime = 5.5;
        double result = 9.0;
        assertEquals(result, mru.time5(initialTime, deltaTime).getResult());
    }
}
