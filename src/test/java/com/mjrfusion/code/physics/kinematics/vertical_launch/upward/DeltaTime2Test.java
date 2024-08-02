package com.mjrfusion.code.physics.kinematics.vertical_launch.upward;

import com.mjrfusion.code.physics.kinematics.vertical_launch.upward.UpWard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeltaTime2Test {
    private UpWard upWard;

    public DeltaTime2Test () {
        upWard = new UpWard();
    }

    @Test
    public void deltaTime1Test () {
        double initialVelocity = 42;
        double finalVelocity = 2;
        double gravity = 10;
        assertEquals(4, upWard.deltaTime(initialVelocity, finalVelocity, gravity).getResult());
    }
}
