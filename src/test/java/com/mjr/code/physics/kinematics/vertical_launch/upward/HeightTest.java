package com.mjr.code.physics.kinematics.vertical_launch.upward;

import com.mjr.code.physics.kinematics.vertical_launch.upward.UpWard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightTest {
    private UpWard upWard;

    public HeightTest() {
        upWard = new UpWard();
    }

    @Test
    public void heightTest() {
        double initialHeight = 91.0;
        double initialSpeed = 2.0;
        double deltaTime = 4.0;
        double gravity = 10.0;
        assertEquals(3.0, upWard.height(initialHeight,
                                           initialSpeed,
                                           deltaTime, 
                                           gravity).getResult());
    }
}
