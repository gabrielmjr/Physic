package com.gabrielMJr.twaire.physic.kinematics.muv;

import com.gabrielMJr.twaire.physic.Physic;

final class Time4 
{
    // This object variable
	private static Time4 instance; 

	// Private constructor to avoid new classe's incence
	private Time4 ()
	{}

	protected String time (
		double initialTime, 
		double deltaSpeed, 
		double acceleration, 
		int stepOrResult)
    {
		double step1 = deltaSpeed / acceleration;
		double step2 = step1 + initialTime;
		String res;
	    if (stepOrResult == Physic.GET_STEP)
		{
			res = "tf = "
				+ initialTime
				+ "s + ("
				+ deltaSpeed
				+ "m/s ÷ "
				+ acceleration
				+ "m/s²)"
				+ "\ntf = "
				+ initialTime
				+ "s + "
				+ step1
				+ "s"
				+ "\ntf = "
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

	protected  String time (
		double initialTime, 
		String initialTimeUnit,
		double deltaSpeed, 
		String deltaSpeedUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult)
    {
		return null;
    }

    // Get class instance object
    public static Time4 getInstance ()
    {
		if (instance == null)
		{
			instance = new Time4();
		}
		return instance;
    }
}
