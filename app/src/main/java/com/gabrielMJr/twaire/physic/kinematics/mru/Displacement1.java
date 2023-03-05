package com.gabrielMJr.twaire.physic.kinematics.mru;

final class Displacement1 
{
	// This object variable
	private static Displacement1 instance; 

	// Private constructor to avoid new classe's incence
	private Displacement1 ()
	{}

	// Displacement: ∆S = sf - si
	protected String displacement (double initialDisplacement, double finalDisplacement)
	{
		return String.valueOf(
			finalDisplacement - initialDisplacement);
	}

	protected String displacement (
		double initialDisplacement,
		String initialDisplacementUnit,
		double finalDisplacement,
		String finaldisplacementUnit,
		String unitOfResult)
	{
		return null;
	}

	// Get class instance object
    public static Displacement1 getInstance ()
    {
		if (instance == null)
		{
			instance = new Displacement1();
		}
		return instance;
    }
}
