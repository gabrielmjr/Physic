package com.gabrielMJr.twaire.physic.kinematics.muv;

final class Acceleration1
{
	private static Acceleration1 instance; 

	private Acceleration1 ()
	{}

	// a = ∆v / ∆t
	protected String acceleration (double deltaSpeed, double deltaTime)
	{
		return String.valueOf(deltaSpeed / deltaTime);
	}

	protected String acceleration (
		double deltaSpeed, 
		String deltaSpeedUnit,
		double deltaTime,
		String deltaTimeUnit,
		String unitOfResult)
	{
		return null;
	}

    public static Acceleration1 getInstance ()
    {
		if (instance == null)
		{
			instance = new Acceleration1();
		}
		return instance;
    }
}
