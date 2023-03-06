package com.gabrielMJr.twaire.physic.kinematics.mru;

final class Time5 
{
	// This object variable
	private static Time5 instance; 

	// Private constructor to avoid new classe's incence
	private Time5 ()
	{}

	// tf = ti + ∆t
	protected String time (double initialTime, double deltaTime) 
	{
		return String.valueOf(initialTime + deltaTime);
	}

	protected String time (
		double initialTime, 
		String initialTimeUnit,
		double deltaTime,
		String deltaTimeUnit,
		String unitOfResult)
	{
		return null;
	}

	// Get class instance object
    public static Time5 getInstance ()
    {
		if (instance == null)
		{
			instance = new Time5();
		}
		return instance;
    }
}
