package com.gabrielMJr.twaire.physic.kinematics.mru;

final class Time2 {
	private static Time2 instance; 

	private Time2 () {}

	// ∆t = ∆S / media velocity
	protected  String time (double deltaDisplacement, double velocity) {
		return String.valueOf(deltaDisplacement / velocity);
	}

	protected  String time (
		double deltaDisplacement, 
		String deltaDisplacementUnit,
		double velocity,
		String velocityUnit,
		String unitOfResult) {
		return null;
	}

    public static Time2 getInstance () {
		if(!(instance instanceof Time2))
			instance = new Time2();
		return instance;
    }
}
