package com.gabrielmjr.physic.kinematics.muv;

final class Time1 
{
	private static Time1 instance; 

	private Time1 ()
	{}

	protected String time (
		double deltaSpeed, 
		double acceleration)
    {
		return String.valueOf(deltaSpeed / acceleration);
    }

    protected String time (
		double deltaSpeed,
		String deltaSpeedUnit, 
		double acceleration,
		String accelerationUnit,
		String unitOfResult)
    {
	    return null;
    }

    public static Time1 getInstance ()
    {
		if (instance == null)
		{
			instance = new Time1();
		}
		return instance;
    }
}
