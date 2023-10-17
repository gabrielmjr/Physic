package com.mjr.code.physics.kinematics.urm;

import com.mjr.code.physics.kinematics.urm.UniformRectilinearMovement;
import com.mjr.code.physics.units.Length;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement1Test {
    private UniformRectilinearMovement urm;

    public Displacement1Test () {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void displacement1Test () {
        Length initialDisplacement = new Length(3.2);
        Length finalDisplacement = new Length(6.2);
        Length result = new Length(3.0);
        assertEquals(result, urm.displacement1(initialDisplacement, finalDisplacement).getResult());
    }
}
