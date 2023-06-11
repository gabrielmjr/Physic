package com.mjr.twaire.code.physic.kinematics.vertical_launch.downward;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitialHeightTest {
	private DownWard downWard;

	public InitialHeightTest() {
		downWard = new DownWard();
	}

	@Test
	public void initialHeightUnit() {
		double height = 91.0;
		double initialSpeed = 2.0;
		double deltaTime = 4.0;
		double gravity = 10.0;
		assertEquals(3, downWard.initialHeight(height,
											   initialSpeed,
											   deltaTime,
											   gravity).getResult());
	}
}
