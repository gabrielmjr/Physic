package com.mjr.code.physics.physics.kinematics.vertical_launch.upward;

import com.mjr.code.physics.kinematics.vertical_launch.upward.UpWard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitialHeightTest {
    private UpWard upWard;

    public InitialHeightTest() {
        upWard = new UpWard();
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
