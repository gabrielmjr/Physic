package com.mjr.twaire.code.physic.kinematics.muv;

import com.mjr.twaire.code.physic.Physic;

public final class Speed3 
{
	private static Speed3 instance; 
	
	private Speed3 ()
	{}

	protected String speed (
		double finalVelocity,
		double deltaTime,
		double acceleration,
		int stepOrResult) 
	{
        double step1 = deltaTime * acceleration;
        double step2 = finalVelocity - step1;
        String res;
        if (stepOrResult == Physic.GET_STEP)
		{
			res = "vi = "
				+ finalVelocity
				+ "m/s - "
				+ deltaTime
				+ "s × "
				+ acceleration
				+ "m/s²"
				+ "\nvi = "
				+ finalVelocity
				+ "m/s - "
				+ step1
				+ "m/s"
				+ "\nvi = "
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
		double finalVelocity, 
		String finalSpeedUnit,
		double deltaTime, 
		String deltaTimeUnit,
		double acceleration, 
		String accelerationUnit,
		String unit_of_result,
		int stepOrResult)
	{
		return null;
	}

    public static Speed3 getInstance ()
    {
		if (instance == null)
		{
			instance = new Speed3();
		}
		return instance;
    }
}
