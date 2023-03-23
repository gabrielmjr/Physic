package com.gabrielMJr.twaire.physic.kinematics.vertical_launch.downward;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VelocityTest {
    
    private DownWard downWard;
    
    public VelocityTest () {
        downWard = downWard.getInstance();
    }
    
    @Test
    public void velocityTest() {
        double initialVelocity = 2.0;
        double gravity = 10.0;
        double deltaTime = 4.0;
        assertEquals(42.0, downWard.velocity(initialVelocity, gravity, deltaTime).getResult());
    }
}
