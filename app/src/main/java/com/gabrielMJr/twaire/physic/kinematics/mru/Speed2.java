package com.gabrielmjr.twaire.physic.kinematics.mru;

import com.gabrielmjr.twaire.physic.Physic;

final class Speed2 {
	private static Speed2 instance; 

	private Speed2 () {}

	// v = (Sf - Si) ÷ (tf - ti)
	protected  String speed (
		double initialDisplacement,
		double finalDisplacement,
		double initialTime,
		double finalTime,
		int resultOrStep) {
		double step1 = finalDisplacement - initialDisplacement;
		double step2 = finalTime - initialTime;
		double step3 = step1 / step2;
		String res = "";
		String signal1;
		String signal2;
		if (resultOrStep == Physic.GET_RESULT) {
			return String.valueOf(step3);
		} else if (resultOrStep == Physic.GET_STEP) {
			if (initialDisplacement < 0) {
				signal1 = " ";
			} else {
				signal1 = " - ";
			}
			if (initialTime < 0) {
				signal2 = " ";
			} else {
				signal2 = " - ";
			}
			res = "v = ("
				+ finalDisplacement
				+ "m"
				+ signal1
				+ initialDisplacement
				+ "m) ÷ ("
				+ finalTime
				+ "s"
				+ signal2
				+ initialTime
				+ "s)"
				+ "\n"
				+ "v = "
				+ step1 
				+ "m ÷ " 
				+ step2
				+ "s"
				+ "\n"
				+ "v = " 
				+ step3
				+ "m/s";
			return res;
		} else {
			return "Erro 404: fifth parameter not found";
		}
	}

	protected String speed (
		double initialDisplacement,
		String initialDisplacementUnit,
		double finalDisplacement,
		String finalDisplacementUnit,
		double initialTime,
		String initialTimeUnit,
		double finalTime,
		String finalTimeUnit,
		String unitOfResult,
		int resultOrStep) {
		return null;
	}

    public static Speed2 getInstance () {
		if(!(instance instanceof Speed2))
			instance = new Speed2();
		return instance;
    }
}
