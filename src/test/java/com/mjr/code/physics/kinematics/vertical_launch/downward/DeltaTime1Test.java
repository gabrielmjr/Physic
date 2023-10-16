package com.mjr.code.physics.physics.kinematics.vertical_launch.downward;

import com.mjr.code.physics.kinematics.vertical_launch.downward.DownWard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeltaTime1Test {
    private DownWard downWard;
    
    public DeltaTime1Test () {
        downWard = new DownWard();
    }
    
    @Test
    public void deltaTime1Test () {
        double deltaSpeed = 40;
        double gravity = 10;
        assertEquals(4, downWard.deltaTime(deltaSpeed, gravity).getResult());
    }
}
