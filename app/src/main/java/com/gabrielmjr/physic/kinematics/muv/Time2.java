package com.gabrielmjr.physic.kinematics.muv;

import com.gabrielmjr.physic.Physic;

final class Time2
{
	private static Time2 instance; 

	private Time2 ()
	{}

	protected String time (
		double initialVelocity, 
		double finalVelocity, 
		double acceleration, 
		int stepOrResult) 
	{
		double step1 = finalVelocity - initialVelocity;
		double step2 = step1 / acceleration;
		String res;
		if (stepOrResult == Physic.GET_STEP)
		{
            res = "∆t = ("
                + finalVelocity
                + "m/s - "
                + initialVelocity
                + "m/s) ÷ "
                + acceleration
                + "m/s²"
                + "\n∆t = "
                + step1
                + "m/s ÷ "
                + acceleration
                + "m/s²"
                + "\n∆t = "
                + step2
                + "s";
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

	protected String time (
		double initialVelocity,
		String initialVelocityUnit,
		double finalVelocity,
		String finalVelocityUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult)
	{
		return null;
	}

    public static Time2 getInstance ()
    {
		if (instance == null)
		{
			instance = new Time2();
		}
		return instance;
    }
}
