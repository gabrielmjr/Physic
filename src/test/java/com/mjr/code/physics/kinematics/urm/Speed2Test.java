package com.mjr.code.physics.physics.kinematics.urm;

import com.mjr.code.physics.kinematics.urm.UniformRectilinearMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed2Test {
    private UniformRectilinearMovement urm;

    public Speed2Test () {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void speed2Test () {
        double initialDisplacement = 2.5;
        double finalDisplacement = 5.5;
        double initialTime = 3.0;
        double finalTime = 9.0;
        double result = 0.5;
        assertEquals(result, urm.speed2(initialDisplacement, finalDisplacement, initialTime, finalTime).getResult());
    }
}
