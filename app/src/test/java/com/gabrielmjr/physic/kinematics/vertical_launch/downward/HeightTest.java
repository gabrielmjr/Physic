package com.gabrielmjr.physic.kinematics.vertical_launch.downward;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightTest {
    private DownWard downWard;

    public HeightTest() {
        downWard = DownWard.getInstance();
    }

	@Test
	public void heightTest() {
		double initialHeight = 3.0;
		double initialSpeed = 2.0;
		double deltaTime = 4.0;
		double gravity = 10.0;
		assertEquals(91.0, downWard.height(initialHeight,
										   initialSpeed,
										   deltaTime, 
										   gravity).getResult());
	}
}
