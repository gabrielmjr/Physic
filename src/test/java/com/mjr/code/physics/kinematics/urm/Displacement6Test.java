package com.mjr.code.physics.kinematics.urm;

import com.mjr.code.physics.kinematics.urm.UniformRectilinearMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement6Test {
    private UniformRectilinearMovement urm;

    public Displacement6Test () {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void displacement6Test () {
        double initialDisplacement = 3.5;
        double velocity = 5.5;
        double deltaTime = 9.0;
        double result = 53.0;
        assertEquals(result, urm.displacement6(initialDisplacement, velocity, deltaTime).getResult());
    }
}
