package com.gabrielmjr.physic.kinematics.mru;

final class Speed1 {
	private static Speed1 instance;

	private Speed1 () {}

	// v = ∆S / ∆T
	protected String speed1 (double deltaDisplacement, double deltaTime) {
		return String.valueOf(deltaDisplacement / deltaTime);
	}

	protected String speed1 (
		double deltaDisplacement,
		String deltaDisplacementUnit,
		double deltaTime,
		String deltaTimeUnit,
		String unitOfResult) {
		return null;
	}

    public static Speed1 getInstance () {
		if(!(instance instanceof Speed1))
			instance = new Speed1();
		return instance;
    }
}
