package com.gabrielMJr.twaire.physic.kinematics.mru;

final class Displacement1 {
	private static Displacement1 instance; 

	private Displacement1 () {}

	// ∆S = sf - si
	protected String displacement (double initialDisplacement, double finalDisplacement) {
		return String.valueOf(
			finalDisplacement - initialDisplacement);
	}

	protected String displacement (
		double initialDisplacement,
		String initialDisplacementUnit,
		double finalDisplacement,
		String finaldisplacementUnit,
		String unitOfResult) {
		return null;
	}

    public static Displacement1 getInstance () {
		if(!(instance instanceof Displacement1))
			instance = new Displacement1();
		return instance;
    }
}
