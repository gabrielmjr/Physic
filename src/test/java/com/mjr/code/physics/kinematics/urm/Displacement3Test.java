package com.mjr.code.physics.kinematics.urm;

import com.mjr.code.physics.kinematics.urm.UniformRectilinearMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement3Test {
    private UniformRectilinearMovement urm;

    public Displacement3Test () {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void displacement3Test () {
        double initialTime = 3.5;
        double finalTime = 5.5;
        double mediaSpeed = 9.0;
        double result = 18.0;
        assertEquals(result, urm.displacement3(initialTime, finalTime, mediaSpeed).getResult());
    }
}
