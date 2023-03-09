package com.gabrielMJr.twaire.physic.kinematics.mru;

final class Displacement5 {
	private static Displacement5 instance; 

	private Displacement5 () {}

	// Sf = Si + ∆S
	protected String displacement (double initialDisplacement, double deltaDisplacement) {
		return String.valueOf(initialDisplacement + deltaDisplacement);
	}

	protected String displacement (
		double initialDisplacement,
		String initialDisplacementUnit, 
		double deltaDisplacement,
		String deltaDisplacementUnit,
		String unitOfResult) {
		return null;
	}

    public static Displacement5 getInstance () {
		if(!(instance instanceof Displacement5))
			instance = new Displacement5();
		return instance;
    }
}
