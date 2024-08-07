package com.mjrfusion.code.physics.kinematics.vertical_launch.upward;

import com.mjrfusion.code.physics.kinematics.vertical_launch.upward.UpWard;
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
