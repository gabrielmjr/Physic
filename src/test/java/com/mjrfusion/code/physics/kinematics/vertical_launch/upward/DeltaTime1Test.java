package com.mjrfusion.code.physics.kinematics.vertical_launch.upward;

import com.mjrfusion.code.physics.kinematics.vertical_launch.upward.UpWard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeltaTime1Test {
    private UpWard upWard;

    public DeltaTime1Test () {
        upWard = new UpWard();
    }

    @Test
    public void deltaTime1Test () {
        double deltaSpeed = - 40;
        double gravity = 10;
        assertEquals(4, upWard.deltaTime(deltaSpeed, gravity).getResult());
    }
}
