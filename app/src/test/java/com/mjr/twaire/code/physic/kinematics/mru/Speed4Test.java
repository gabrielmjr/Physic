package com.mjr.twaire.code.physic.kinematics.mru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed4Test {
	MRU mru;

	public Speed4Test () {
		mru = new MRU();
	}

	@Test
	public void speed4Test () {
		double deltaDisplacement = 3.0;
		double initialTime = 2.5;
		double finalTime = 8.5;
		double result = 0.5;
		assertEquals(result, mru.speed4(deltaDisplacement, initialTime, finalTime).getResult());
	}
}
