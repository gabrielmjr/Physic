package com.mjr.code.physics.kinematics.urm;

import com.mjr.code.physics.kinematics.urm.UniformRectilinearMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time3Test {
    private UniformRectilinearMovement urm;

    public Time3Test () {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void time3Test () {
        double initialDisplacement = 3.5;
        double finalDisplacement = 5.5;
        double velocity = 8.0;
        double result = 0.25;
        assertEquals(result, urm.time3(initialDisplacement, finalDisplacement, velocity).getResult());
    }
}
