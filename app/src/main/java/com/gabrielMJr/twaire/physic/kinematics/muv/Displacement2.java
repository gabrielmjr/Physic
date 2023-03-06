package com.gabrielMJr.twaire.physic.kinematics.muv;

import com.gabrielMJr.twaire.physic.Physic;

final class Displacement2
{
	// This object variable
	private static Displacement2 instance;

	// Private constructor to avoid new classe's incence
	private Displacement2 ()
	{}

	protected String displacement (
		double initialVelocity, 
		double deltaTime, 
		double acceleration, 
		double displacement, 
		int stepOrResult)
    {
		double step1 = initialVelocity * deltaTime;
		double step11 = Math.pow(deltaTime, 2);
		double step2 = acceleration * step11;
		double step3 = step2 / 2;
		double step4 = step1 + step3;
		double step5 = displacement - step4;
		String res;
		if (stepOrResult == Physic.GET_STEP)
		{
			res = "Si = "
				+ displacement
				+ "m - [("
				+ initialVelocity 
				+ "m/s × "
				+ deltaTime
				+ "s) + ["
				+ acceleration 
				+ "m/s² × ("
				+ deltaTime
				+ "s)²] ÷ 2]"
				+ "\nSi = "
				+ displacement 
				+ "m - ["
				+ step1
				+ "m + ("
				+ acceleration
				+ "m/s² × "
				+ step11
				+ "s²) ÷ 2]"
				+ "\nSi = "
				+ displacement
				+ "m - ["
				+ step1
				+ "m + ("
				+ step2
				+ " ÷ 2)m]"
				+ "\nSi = "
				+ displacement 
				+ "m - ("
				+ step1
				+ "m + "
				+ step3
				+ "m)"
				+ "\nSi = "
				+ displacement 
				+ "m - "
				+ step4
				+ "m \nSi = "
				+ step5
				+ "m";
            return res;
		} 
		else if (stepOrResult == Physic.GET_RESULT) 
		{
			return String.valueOf(step5);   
		} 
		else 
		{              
			return "Error 404: fifth parameter not found.";
		}
	}

	protected String displacement (
		double initialVelocity, 
		String initialVelocityUnit,
		double deltaTime, 
		String deltaTimeUnit,
		double acceleration, 
		String accelerationUnit,
		double displacement, 
		String displacementUnit,
		String unitOfResult,
		int stepOrResult)
    {
		return null;
    }

    // Get class instance object
    public static Displacement2 getInstance ()
    {
		if (instance == null)
		{
			instance = new Displacement2();
		}
		return instance;
    }
}
