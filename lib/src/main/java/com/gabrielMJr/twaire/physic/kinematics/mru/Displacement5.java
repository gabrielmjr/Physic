package com.gabrielMJr.twaire.physic.kinematics.mru;

final class Displacement5
{
	// This object variable
	private static Displacement5 instance; 

	// Private constructor to avoid new classe's incence
	private Displacement5 ()
	{}

	// Final displacement: Sf = Si + ∆S
	protected String displacement (double initialDisplacement, double deltaDisplacement)
	{
		return String.valueOf(initialDisplacement + deltaDisplacement);
	}

	protected String displacement (
		double initialDisplacement,
		String initialDisplacementUnit, 
		double deltaDisplacement,
		String deltaDisplacementUnit,
		String unitOfResult)
	{
		return null;
	}

	// Get class instance object
    public static Displacement5 getInstance ()
    {
		if (instance == null)
		{
			instance = new Displacement5();
		}
		return instance;
    }
}
