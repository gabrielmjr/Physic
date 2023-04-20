package com.mjr.code.physic.kinematics.vertical_launch.upward;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitialHeightTest {
    private UpWard upWard;

    public InitialHeightTest() {
        upWard = UpWard.getInstance();
    }

    @Test
    public void initialHeightUnit() {
        double height = 3.0;
        double initialSpeed = 2.0;
        double deltaTime = 4.0;
        double gravity = 10.0;
        assertEquals(91, upWard.initialHeight(height,
                                               initialSpeed,
                                               deltaTime,
                                               gravity).getResult());
    }
}
