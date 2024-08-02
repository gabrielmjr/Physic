package com.mjrfusion.code.physics.kinematics.urm;

import com.mjrfusion.code.physics.kinematics.urm.UniformRectilinearMovement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed1Test {
    private UniformRectilinearMovement urm;

    public Speed1Test () {
        urm = new  UniformRectilinearMovement();
    }

    @Test
    public void speed1Test () {
        Double deltaDisplacement = 8.0;
        Double deltaTime = 5.0;
        double result = 1.6;
        assertEquals(result, urm.speed1(deltaDisplacement, deltaTime).getResult());
    }
}
