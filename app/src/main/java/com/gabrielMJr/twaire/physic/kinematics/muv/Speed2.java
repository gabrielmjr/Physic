package com.gabrielMJr.twaire.physic.kinematics.muv;

import com.gabrielMJr.twaire.physic.Physic;

final class Speed2
{
	// This object variable
	private static Speed2 instance; 

	// Private constructor to avoid new classe's incence
	private Speed2 ()
	{}

	protected String speed (
		double initialTime,
		double finalTime, 
		double acceleration,
		int stepOrResult)
	{
        double step1 = finalTime - initialTime;
        double step2 = step1 * acceleration;
        String res;
        if (stepOrResult == Physic.GET_STEP)
		{
			res = "∆v = ("
				+ finalTime
				+ "s - "
				+ initialTime
				+ "s) × ("
				+ acceleration
				+ "m/s²)"
				+ "\n∆v = "
				+ step1
				+ "s × ("
				+ acceleration
				+ "m/s²)"
				+ "\n∆v = "
				+ step2
				+ "m/s";
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

	protected String speed (
		double initialTime,
		String initialTimeUnit,
		double finalTime, 
		String finalTimeUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult)    
	{
        return null;
	}

	// Get class instance object
    public static Speed2 getInstance ()
    {
		if (instance == null)
		{
			instance = new Speed2();
		}
		return instance;
    }
}
