package com.gabrielMJr.twaire.physic.kinematics.mru;

final class Displacement2
{
	private static Displacement2 instance; 

	// Private constructor to avoid new classe's incence
	private Displacement2 ()
	{}

	// ∆S = ∆t × media_speed
	protected String displacement (double variationTime, double mediaSpeed) 
	{
		return String.valueOf(variationTime * mediaSpeed);
	}

	protected String displacement (
		double variationTime, 
		String variationTimeUnit,
		double mediaSpeed,
		String mediaSpeedUnit,
		String unitOfResult) 
	{
		return null;
	}

    public static Displacement2 getInstance ()
    {
		if (instance == null)
		{
			instance = new Displacement2();
		}
		return instance;
    }
}
