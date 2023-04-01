package com.gabrielmjr.twaire.physic.kinematics.mru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielmjr.twaire.physic.Physic.GET_RESULT;

public class Speed4Test {
	MRU mru;

	public Speed4Test () {
		mru = MRU.getInstance();
	}

	@Test
	public void speed4Test () {
		double deltaDisplacement = 3.0;
		double initialTime = 2.5;
		double finalTime = 8.5;
		String result = "0.5";
		assertEquals(result, mru.speed4(deltaDisplacement, initialTime, finalTime, GET_RESULT));
	}
}
