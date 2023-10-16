package com.mjr.code.physics.physics.kinematics.urm;

import com.mjr.code.physics.kinematics.urm.UniformRectilinearMovement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time5Test {
    private UniformRectilinearMovement urm;

    public Time5Test () {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void time5Test () {
        double initialTime = 3.5;
        double deltaTime = 5.5;
        double result = 9.0;
        assertEquals(result, urm.time5(initialTime, deltaTime).getResult());
    }
}
