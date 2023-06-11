package com.mjr.twaire.code.physic.kinematics.urm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time1Test {
    private UniformRectilinearMovement urm;

    public Time1Test () {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void time1Test () {
        double initialTime = 3.5;
        double finalTime = 8.5;
        double result = 5.0;
        assertEquals(result, urm.time1(initialTime, finalTime).getResult());
    }
}
