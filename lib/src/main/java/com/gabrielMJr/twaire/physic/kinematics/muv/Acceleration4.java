package com.gabrielMJr.twaire.physic.kinematics.muv;

import com.gabrielMJr.twaire.physic.Physic;

final class Acceleration4 
{
	// This object variable
	private static Acceleration4 instance; 

	// Private constructor to avoid new classe's incence
	private Acceleration4 ()
	{}

	protected String acceleration (
		double initialVelocity,
		double finalVelocity,
		double initialTime,
		double finalTime,
		int stepOrResult)
    {
		// Attributes 
		double step1 = finalVelocity - initialVelocity;
		double step2 = finalTime - initialTime;
		double step3 = step1 / step2;
		String res;
		// if stepOrResult.equals (getStep)
		if (stepOrResult == Physic.GET_STEP)
		{
			res = "a = ("
				+ finalVelocity
				+ "m/s - "
				+ initialVelocity
				+ "m/s) ÷ ("
				+ finalTime
				+ "s - "
				+ initialTime
				+ "s)"
				+ "\na = ("
				+ step1
				+ "m/s) ÷ "
				+ step2
				+ "s"
				+ "\na = "
				+ step3
				+ "m/s²";
			return res;
		}
		else if (stepOrResult == Physic.GET_RESULT)
		{
		    return String.valueOf(step3);
		}
		else
		{
			return "Error 404: fifth parameter not found.";
		}
    }

    protected String acceleration (
		double initialVelocity, 
		String initialVelocityUnit, 
		double finalVelocity, 
		String finalVelocityUnit, 
		double initialTime, 
		String initialTimeUnit, 
		double finalTime, 
		String finalTimeUnit,
		String unitOfResult, 
		int stepOrResult)
    {
		return null;
    }

    // Get class instance object
    public static Acceleration4 getInstance ()
    {
		if (instance == null)
		{
			instance = new Acceleration4();
		}
		return instance;
    }
}
