package com.mjrfusion.code.physics.kinematics.urm;

import com.mjrfusion.code.physics.kinematics.urm.UniformRectilinearMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed3Test {
    private UniformRectilinearMovement urm;

    public Speed3Test () {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void speed3Test () {
        double initialDisplacement = 2.5;
        double finalDisplacement = 5.5;
        double deltaTime = 6.0;
        double result = 0.5;
        assertEquals(result, urm.speed3(initialDisplacement, finalDisplacement, deltaTime).getResult());
    }
}
