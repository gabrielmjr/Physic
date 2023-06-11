package com.mjr.twaire.code.physic.kinematics.urm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement1Test {
    private UniformRectilinearMovement urm;

    public Displacement1Test () {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void displacement1Test () {
        double initialDisplacement = 3.2;
        double finalDisplacement = 6.2;
        double result = 3.0;
        assertEquals(result, urm.displacement1(initialDisplacement, finalDisplacement).getResult());
    }
}
