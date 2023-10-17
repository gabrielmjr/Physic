package com.mjr.code.physics.kinematics.vertical_launch.downward;

import com.mjr.code.physics.kinematics.vertical_launch.downward.DownWard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeltaTime2Test {
    private DownWard downWard;

    public DeltaTime2Test () {
        downWard = new DownWard();
    }

    @Test
    public void deltaTime1Test () {
        double initialVelocity = 2;
        double finalVelocity = 42;
        double gravity = 10;
        assertEquals(4, downWard.deltaTime(initialVelocity, finalVelocity, gravity).getResult());
    }
}
