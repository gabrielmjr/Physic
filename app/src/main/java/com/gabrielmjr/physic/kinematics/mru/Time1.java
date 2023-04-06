package com.gabrielmjr.physic.kinematics.mru;

final class Time1 {
	private static Time1 instance; 

	private Time1 () {}

	// ∆t = tf - ti
	protected String time (double initialTime, double finalTime) {
		return String.valueOf(finalTime - initialTime);
	}

	protected String time (
		double initialTime,
		String initialTimeUnit,
		double finalTime,
		String finalTimeUnit,
		String unitOfResult) {
		return null;
	}

    public static Time1 getInstance () {
		if(!(instance instanceof Time1))
			instance = new Time1();
		return instance;
    }
}
