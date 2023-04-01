package com.gabrielmjr.twaire.physic.kinematics.muv;

import com.gabrielmjr.twaire.physic.Physic;

final class Time3
{
	private static Time3 instance; 

	private Time3 ()
	{}

	protected String time (
		double finalTime,
		double deltaSpeed,
		double acceleration,
		int stepOrResult)
	{
		double step1 = deltaSpeed / acceleration;
		double step2 = finalTime - step1;
		String res;
		if (stepOrResult == Physic.GET_STEP)
		{
			res = "ti = "
				+ finalTime
				+ "s - "
				+ deltaSpeed
				+ "m/s ÷ "
				+ acceleration
				+ "m/s²"
				+ "\nti = "
				+ finalTime
				+ "s - "
				+ step1
				+ "s"
				+ "\nti = "
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

    public String time (
		double finalTime,
		String finalTimeUnit,
		double deltaSpeed, 
		String deltaSpeedUnit,
		double acceleration, 
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult)
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
