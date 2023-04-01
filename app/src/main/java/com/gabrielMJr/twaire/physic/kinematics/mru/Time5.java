package com.gabrielmjr.twaire.physic.kinematics.mru;

final class Time5 {
	private static Time5 instance; 

	private Time5 () {}

	// tf = ti + ∆t
	protected String time (double initialTime, double deltaTime) {
		return String.valueOf(initialTime + deltaTime);
	}

	protected String time (
		double initialTime, 
		String initialTimeUnit,
		double deltaTime,
		String deltaTimeUnit,
		String unitOfResult) {
		return null;
	}

    public static Time5 getInstance () {
		if(!(instance instanceof Time5))
			instance = new Time5();
		return instance;
    }
}
