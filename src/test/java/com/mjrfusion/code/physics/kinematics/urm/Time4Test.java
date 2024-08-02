package com.mjrfusion.code.physics.kinematics.urm;

import com.mjrfusion.code.physics.kinematics.urm.UniformRectilinearMovement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time4Test {
    private UniformRectilinearMovement urm;

    public Time4Test () {
        urm = new UniformRectilinearMovement();
    }

    @Test
    public void time4Test () {
        Double deltaTime = 3.5;
        Double finalTime = 19.5;
        double result = 16.0;
        assertEquals(result, urm.time4(deltaTime, finalTime).getResult());
    }
}
