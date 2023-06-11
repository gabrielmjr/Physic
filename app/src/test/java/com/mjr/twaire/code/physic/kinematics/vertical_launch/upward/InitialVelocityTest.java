package com.mjr.twaire.code.physic.kinematics.vertical_launch.upward;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitialVelocityTest {
    private UpWard upWard;

    public InitialVelocityTest () {
        upWard = new UpWard();
    }

    @Test
    public void initialVelocitTest () {
        double velocity = 2;
        double gravity = 10;
        double deltaTime = 4;

        assertEquals(42, upWard.initialVelocity(velocity, gravity, deltaTime).getResult());
    }
}
