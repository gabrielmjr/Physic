package com.gabrielMJr.twaire.physic.kinematics.mru;

import com.gabrielMJr.twaire.physic.Physic;

final class Displacement3 {
	private static Displacement3 instance; 

	private Displacement3 () {}

	// ∆S = (tf - ti) × media_speed
	protected String displacement (
		double initialTime,
		double finalTime,
		double deltaSpeed,
		int resultOrStep) {
		double step1 = finalTime - initialTime;
		double step2 = step1 * deltaSpeed;
		String res = "";
		String signal;
		if (resultOrStep == Physic.GET_RESULT) {
			return String.valueOf(step2);        
		} else if (resultOrStep == Physic.GET_STEP) {
			if (initialTime < 0) {
				signal = "";
			} else {
				signal = "-";
			}
			res = "∆S = ("
				+ finalTime
				+ "s "
				+ signal
				+ initialTime
				+ "s ) x ("
				+ deltaSpeed
				+ "m/s)"
				+ "\n"
				+ "∆S = "
				+ step1
				+ "s x ("
				+ deltaSpeed
				+ "m/s)"
				+ "\n"
				+ "∆S = "
				+ step2
				+ "m";
			return res;
		} else {
			return "Erro 404: fourth parameter not found";
		} 
	}

	protected String displacement (
		double initialTime,
		String initialTimeUnit,
		double finalTime,
		String finalTimeUnit,
		double deltaSpeed,
		String mediaSpeedUnit,
		String unitOfResult,
		int resultOrStep) {
		return null;
	}

    public static Displacement3 getInstance () {
		if(!(instance instanceof Displacement3))
			instance = new Displacement3();
		return instance;
    }
}
