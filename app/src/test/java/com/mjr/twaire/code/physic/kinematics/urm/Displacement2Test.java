package com.mjr.twaire.code.physic.kinematics.urm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement2Test {
    private UniformRectilinearMovement urm;

    public Displacement2Test () {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void displacement2Test () {
        double deltaTime = 3.0;
        double deltaSpeed = 4.0;
        double result = 12.0;
        assertEquals(result, urm.displacement2(deltaTime, deltaSpeed).getResult());
    }
}
