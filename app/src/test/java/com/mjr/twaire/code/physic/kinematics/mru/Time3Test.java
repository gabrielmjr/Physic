package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time3Test {
    private UniformRectilinearMovement mru;

    public Time3Test () {
        mru = new UniformRectilinearMovement();
    }

    @Test
    public void time3Test () {
        double initialDisplacement = 3.5;
        double finalDisplacement = 5.5;
        double velocity = 8.0;
        double result = 0.25;
        assertEquals(result, mru.time3(initialDisplacement, finalDisplacement, velocity).getResult());
    }
}
