package com.gabrielMJr.twaire.physic.kinematics.muv;

import com.gabrielMJr.twaire.physic.Physic;

final class Acceleration3
{
	// This object variable
	private static Acceleration3 instance; 

	// Private constructor to avoid new classe's incence
	private Acceleration3 ()
	{}

	protected String acceleration (
		double initialVelocity,
		double finalVelocity, 
		double deltaTime,
		int stepOrResult)
	{
		// Attributes 
		double step1 = finalVelocity - initialVelocity;
		double step2 = step1 / deltaTime;
		String res; 
		// If the user want the steps, return the steps
		if (stepOrResult == Physic.GET_STEP)
		{
			res = "a = ("
				+ finalVelocity
				+ "m/s - "
				+ initialVelocity
				+ "m/s) ÷ ("
				+ deltaTime
				+ "s)"
				+ "\na = ("
				+ step1
				+ "m/s) ÷ "
				+ deltaTime
				+ "s"
				+ "\na = "
				+ step2
				+ "m/s²";
			return res;
			// Else if equals to get result, return result
		}
		else if (stepOrResult == Physic.GET_RESULT)
		{
			return String.valueOf(step2);
		}
		else
		{
			return "Error 404: fourth parameter not found.";
		}
	}

	public String acceleration (
		double initialVelocity, 
		String initial_speed_unit, 
		double finalVelocity, 
		String final_speed_unit, 
		double deltaTime, 
		String variation_time_unit, 
		String unit_of_result, 
		int stepOrResult)
	{
		return null;
	}

	// Get class instance object
    public static Acceleration3 getInstance ()
    {
		if (instance == null)
		{
			instance = new Acceleration3();
		}
		return instance;
    }
}
