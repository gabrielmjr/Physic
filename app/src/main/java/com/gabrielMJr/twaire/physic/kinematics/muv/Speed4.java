package com.gabrielMJr.twaire.physic.kinematics.muv;

import com.gabrielMJr.twaire.physic.Physic;

final class Speed4 
{
	// This object variable
	private static Speed4 instance;

	// Private constructor to avoid new classe's incence
	private Speed4 ()
	{}

	protected String speed (
		double initialSpeed, 
		double deltaTime, 
		double acceleration, 
		int stepOrResult)
	{
        double step1 = deltaTime * acceleration;
		double step2 = step1 + initialSpeed;
		String res;
		if (stepOrResult == Physic.GET_STEP)
		{
			res = "vf = "
				+ deltaTime
				+ "s × "
				+ acceleration
				+ "m/s² + "
				+ initialSpeed
				+ "m/s"
				+ "\nvf = "
				+ step1
				+ "m/s + "
				+ initialSpeed
				+ "m/s"
				+ "\nvf = "
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
		double initialSpeed, 
		String initialSpeedUnit,
		double deltaTime, 
		String deltaTimeUnit,
		double acceleration, 
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult)
    {
		return null;
    }

    // Get class instance object
    public static Speed4 getInstance ()
    {
		if (instance == null)
		{
			instance = new Speed4();
		}
		return instance;
    }
}
