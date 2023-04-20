package com.mjr.code.physic.kinematics.mru;

final class Time4 {
	private static Time4 instance;

	private Time4 () {}

	// ti = tf + ∆t
	protected String time (double deltaTime, double finalTime) {
		return String.valueOf(finalTime - deltaTime);
	}

	protected String time (
		double deltaTime, 
		String deltaTimeUnit,
		double finalTime,
		String finalTimeUnit,
		String unitOfResult) {
		return null;
	}

    public static Time4 getInstance () {
		if(!(instance instanceof Time4))
			instance = new Time4();
		return instance;
    }
}
