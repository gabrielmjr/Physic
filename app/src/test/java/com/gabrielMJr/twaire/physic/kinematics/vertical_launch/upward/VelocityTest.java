package com.gabrielmjr.twaire.physic.kinematics.vertical_launch.upward;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VelocityTest {

    private UpWard upWard;

    public VelocityTest () {
        upWard = UpWard.getInstance();
    }

    @Test
    public void velocityTest() {
        double initialVelocity = 42.0;
        double gravity = 10.0;
        double deltaTime = 4.0;
        assertEquals(2.0, upWard.velocity(initialVelocity, gravity, deltaTime).getResult());
    }
}
