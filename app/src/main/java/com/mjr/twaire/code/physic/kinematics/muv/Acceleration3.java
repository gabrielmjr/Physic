package com.mjr.twaire.code.physic.kinematics.muv;

import com.mjr.twaire.code.physic.Physic;

public final class Acceleration3
{
	private static Acceleration3 instance; 
	
	private Acceleration3 ()
	{}

	// a = (vf - vi) / ∆t
	protected String acceleration (
		double initialVelocity,
		double finalVelocity, 
		double deltaTime,
		int stepOrResult)
	{
		double step1 = finalVelocity - initialVelocity;
		double step2 = step1 / deltaTime;
		String res; 
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
	
    public static Acceleration3 getInstance ()
    {
		if (instance == null)
		{
			instance = new Acceleration3();
		}
		return instance;
    }
}
