package com.gabrielMJr.twaire.physic.kinematics.mru;

import com.gabrielMJr.twaire.physic.Physic;

final class Time3 
{
	private static Time3 instance; 

	private Time3 ()
	{}

	// ∆t = (Sf - Si) / v
	protected String time (
		double initialDisplacement,
		double finalDisplacement,
		double velocity,
		int resultOrStep)
	{
		double step1 = finalDisplacement - initialDisplacement;
		double step2 = step1 / velocity;
		String res = "";
		String signal;
		if (resultOrStep == Physic.GET_RESULT) 
		{
			return String.valueOf(step2);
		}
		else if (resultOrStep == Physic.GET_STEP) 
		{
			if (initialDisplacement < 0) 
			{
				signal = " ";
			} 
			else 
			{
				signal = " - ";
			}
			res =
				"∆t = ("
				+ String.valueOf(finalDisplacement)
				+ "m"
				+ signal
				+ String.valueOf(initialDisplacement)
				+ "m) ÷ ("
				+ String.valueOf(velocity)
				+ "m/s)"
				+ "\n"
				+ "∆t = "
				+ String.valueOf(step1) 
				+ "m ÷ (" 
				+ String.valueOf(velocity) 
				+ "m/s)"
				+ "\n"
				+ "∆t = " 
				+ String.valueOf(step2) 
				+ "s";
			return res;
		} 
		else 
		{
			return "Erro 404: fourth parameter not found";
		}
	}

	protected String time (
		double initialDisplacement,
		String initialDisplacementUnit,
		double finalDisplacement,
		String finalDisplacementUnit,
		double velocity,
		String velocityUnit,
		String unifOfResult,
		int resultOrStep)
	{
		return null;
	}

    public static Time3 getInstance ()
    {
		if (instance == null)
		{
			instance = new Time3();
		}
		return instance;
    }
}
