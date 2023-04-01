package com.gabrielmjr.twaire.physic.kinematics.mru;

import com.gabrielmjr.twaire.physic.Physic;


final class Speed4 {
	private static Speed4 instance; 

	private Speed4 () {}

	// v = ∆S ÷ (tf - ti)
	protected String speed
	(double deltaDisplacement,
     double initialTime,
     double finalTime,
     int stepOrResult) {
		double step1 = finalTime - initialTime;
		double step2 = deltaDisplacement / step1;
		String res = "";
		String signal_1;
		if (stepOrResult == Physic.GET_RESULT) {
			return String.valueOf(step2);
		} else if (stepOrResult == Physic.GET_STEP) {
			if (initialTime < 0) {
				signal_1 = " ";
			} else {
				signal_1 = " - ";
			}
			res = "v = ("
				+ deltaDisplacement
				+ "m) ÷ ("
				+ finalTime 
				+ "m "
				+ signal_1
				+ initialTime
				+ "m)"
				+ "\n"
				+ "v = "
				+ deltaDisplacement
				+ "m ÷ "
				+ step1
				+ "s"
				+ "\n"
				+ "v = "
				+ step2 
				+ "m/s";
			return res;
		} else {
			return "Erro 404: third parameter not found";
		}
	}

	protected String speed (
		double deltaDisplacement,
		String deltaDisplacementUnit,
		double initialTime,
		String initialTimeUnit,
		double finalTime,
		String finalTimeUnit,
		String unitOfResult,
		int stepOrResult) {
		return null;
	}

    public static Speed4 getInstance () {
		if(!(instance instanceof Speed4))
			instance = new Speed4();
		return instance;
    }
}
