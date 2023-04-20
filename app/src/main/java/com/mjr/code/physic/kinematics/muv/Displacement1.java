package com.mjr.code.physic.kinematics.muv;

import com.mjr.code.physic.Physic;

final class Displacement1 
{
	private static Displacement1 instance; 

	private Displacement1 ()
	{}

	// S = Si + vi * ∆t + (vi * ∆t²) / 2
	protected  String displacement (
		double initialDisplacement, 
		double initialVelocity, 
		double deltaTime, 
		double acceleration, 
		int stepOrResult)
    {
		double step1 = initialVelocity * deltaTime;
		double step11 = Math.pow(deltaTime, 2);
		double step2 = initialDisplacement + step1;
		double step22 = acceleration * step11;
		double step3 = step22 / 2;
		double step4 = step2 + step3;
		String res;
		if (stepOrResult == Physic.GET_STEP)
		{             
			res = "S = "
				+ initialDisplacement
				+ "m + "
				+ initialVelocity
				+ "m/s × "
				+ deltaTime
				+ "s + ["
				+ acceleration
				+ "m/s² × ("
				+ deltaTime
				+ "s)²] ÷ 2"
				+ "\nS = "
				+ initialDisplacement
				+ "m + "
				+ step1
				+ "m + ("
				+ acceleration
				+ "m/s² × "
				+ step11
				+ "s²) ÷ 2"
				+ "\nS = "
				+ step2
				+ "m + ("
				+ step22
				+ " ÷ 2) (m×s²)/s²"
				+ "\nS = "
				+ step2
				+ "m + "
				+ step3
				+ "m"
				+ "\nS = "
				+ step4
				+ "m";
			return res;
		} 
		else if 
		(stepOrResult == Physic.GET_RESULT)
		{            
			return String.valueOf(step4);
		} 
		else 
		{
			return "Error 404: fifth parameter not found.";
		}
	}

	protected String displacement (
		double initialDisplacement,
		String initialDisplacementUnit,
		double initialVelocity,
		String initialVelocityUnit,
		double deltaTime,
		String deltaTimeUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) 
    {
		return null;
    }

    public static Displacement1 getInstance ()
    {
		if (instance == null)
		{
			instance = new Displacement1();
		}
		return instance;
    }
}
