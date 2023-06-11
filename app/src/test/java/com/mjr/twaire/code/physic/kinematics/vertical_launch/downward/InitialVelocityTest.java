package com.mjr.twaire.code.physic.kinematics.vertical_launch.downward;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitialVelocityTest {
    private DownWard downWard;
    
    public InitialVelocityTest () {
        downWard = new DownWard();
    }
    
    @Test
    public void initialVelocitTest () {
        double velocity = 42;
        double gravity = 10;
        double deltaTime = 4;
        
        assertEquals(2, downWard.initialVelocity(velocity, gravity, deltaTime).getResult());
    }
}
