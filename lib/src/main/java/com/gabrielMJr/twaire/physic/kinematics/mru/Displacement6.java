package com.gabrielMJr.twaire.physic.kinematics.mru;

import com.gabrielMJr.twaire.physic.Physic;

final class Displacement6
{
	private static Displacement6 instance; 
	
	private Displacement6 ()
	{}

	// S = Si + v * ∆t
	protected String displacement (
		double initialDisplacement,
		double velocity,
		double deltaTime,
		int stepOrResult) 
	{
		double step1 = velocity * deltaTime;
		double step2 = step1 + initialDisplacement;
		String res = "";
		if  (stepOrResult == Physic.GET_RESULT)
		{
			return String.valueOf(step2);
		} 
		else if (stepOrResult == Physic.GET_STEP) 
		{
			res = "S = "
				+ initialDisplacement
				+ "m + "
				+ velocity
				+ "m/s x "
				+ deltaTime
				+ "s"
				+ "\n"
				+ "S = "
				+ initialDisplacement
				+ "m + "
				+ step1
				+ "m"
				+ "\n"
				+ "S = " 
				+ step2
				+ "m";
			return res;
		} 
		else 
		{
			return "Erro 404: fourth parameter not found";
		}
	}

	protected String displacement (
		double initialDisplacement,
		String initialDisplacementUnit,
		double velocity,
		String velocityUnit,
		double deltaTime,
		String deltaTimeUnit,
		String unitOfRest,
		int stepOrResult) 
	{
		return null;
	}

    public static Displacement6 getInstance ()
    {
		if (instance == null)
		{
			instance = new Displacement6();
		}
		return instance;
    }
}
