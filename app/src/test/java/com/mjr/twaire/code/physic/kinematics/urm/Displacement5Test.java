package com.mjr.twaire.code.physic.kinematics.urm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement5Test {
    private UniformRectilinearMovement urm;

    public Displacement5Test () {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void displacement5Test () {
        double initialDisplacement = 3.5;
        double deltaDisplacement = 5.5;
        double result = 9.0;
        assertEquals(result, urm.displacement5(initialDisplacement, deltaDisplacement).getResult());
    }
}
