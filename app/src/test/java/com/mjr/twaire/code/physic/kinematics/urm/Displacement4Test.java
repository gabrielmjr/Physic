package com.mjr.twaire.code.physic.kinematics.urm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement4Test {
    private UniformRectilinearMovement urm;

    public Displacement4Test() {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void displacement4Test() {
        double deltaDisplacement = 3.5;
        double finalDisplacement = 5.5;
        double result = 2.0;
        assertEquals(result, urm.displacement4(deltaDisplacement, finalDisplacement).getResult());
    }
}
