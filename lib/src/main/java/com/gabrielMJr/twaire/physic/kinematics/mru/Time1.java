package com.gabrielMJr.twaire.physic.kinematics.mru;

final class Time1
{
	// This object variable
	private static Time1 instance; 

	// Private constructor to avoid new classe's incence
	private Time1 ()
	{}

	// ∆t = tf - ti
	protected String time (double initialTime, double finalTime)
	{
		return String.valueOf(finalTime - initialTime);
	}

	protected String time (
		double initialTime,
		String initialTimeUnit,
		double finalTime,
		String finalTimeUnit,
		String unitOfResult)
	{
		return null;
	}

	// Get class instance object
    public static Time1 getInstance ()
    {
		if (instance == null)
		{
			instance = new Time1();
		}
		return instance;
    }
}
