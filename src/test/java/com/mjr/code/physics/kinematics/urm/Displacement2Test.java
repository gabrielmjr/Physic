package com.mjr.code.physics.physics.kinematics.urm;

import com.mjr.code.physics.kinematics.urm.UniformRectilinearMovement;
import com.mjr.code.physics.units.Speed;
import com.mjr.code.physics.units.Time;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement2Test {
    private UniformRectilinearMovement urm;

    public Displacement2Test () {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void displacement2Test () {
        Time deltaTime = new Time(3.0);
        Speed deltaSpeed = new Speed(4.0);
        double result = 12.0;
        assertEquals(result, urm.displacement2(deltaTime, deltaSpeed).getResult());
    }
}