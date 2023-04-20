package com.mjr.code.physic.kinematics.vertical_launch.upward;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeltaTime2Test {
    private UpWard upWard;

    public DeltaTime2Test () {
        upWard = UpWard.getInstance();
    }

    @Test
    public void deltaTime1Test () {
        double initialVelocity = 42;
        double finalVelocity = 2;
        double gravity = 10;
        assertEquals(4, upWard.deltaTime(initialVelocity, finalVelocity, gravity).getResult());
    }
}
