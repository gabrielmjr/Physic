package com.mjrfusion.code.physics.kinematics.urm;

import com.mjrfusion.code.physics.kinematics.urm.UniformRectilinearMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time2Test {
    private UniformRectilinearMovement urm;

    public Time2Test () {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void time2Test () {
        double deltaDisplacement = 9.6;
        double velocity = 5.0;
        double result = 1.92;
        assertEquals(result, urm.time2(deltaDisplacement, velocity).getResult());
    }
}
