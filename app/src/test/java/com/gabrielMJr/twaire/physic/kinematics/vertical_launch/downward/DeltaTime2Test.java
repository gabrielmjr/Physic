package com.gabrielmjr.twaire.physic.kinematics.vertical_launch.downward;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeltaTime2Test {
    private DownWard downWard;

    public DeltaTime2Test () {
        downWard = DownWard.getInstance();
    }

    @Test
    public void deltaTime1Test () {
        double initialVelocity = 2;
        double finalVelocity = 42;
        double gravity = 10;
        assertEquals(4, downWard.deltaTime(initialVelocity, finalVelocity, gravity).getResult());
    }
}
