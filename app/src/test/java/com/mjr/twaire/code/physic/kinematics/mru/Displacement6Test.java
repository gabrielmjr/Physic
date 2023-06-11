package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement6Test {
    private UniformRectilinearMovement mru;

    public Displacement6Test () {
        mru = new UniformRectilinearMovement();
    }

    @Test
    public void displacement6Test () {
        double initialDisplacement = 3.5;
        double velocity = 5.5;
        double deltaTime = 9.0;
        double result = 53.0;
        assertEquals(result, mru.displacement6(initialDisplacement, velocity, deltaTime).getResult());
    }
}
