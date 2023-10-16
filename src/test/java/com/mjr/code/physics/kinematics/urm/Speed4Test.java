package com.mjr.code.physics.physics.kinematics.urm;

import com.mjr.code.physics.kinematics.urm.UniformRectilinearMovement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed4Test {
	UniformRectilinearMovement urm;

	public Speed4Test () {
		urm = new UniformRectilinearMovement();
	}

	@Test
	public void speed4Test () {
		double deltaDisplacement = 3.0;
		double initialTime = 2.5;
		double finalTime = 8.5;
		double result = 0.5;
		assertEquals(result, urm.speed4(deltaDisplacement, initialTime, finalTime).getResult());
	}
}
