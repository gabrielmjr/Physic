package com.gabrielMJr.twaire.physic.kinematics.mru;

final class Displacement4
{
	// This object variable
	private static Displacement4 instance; 

	// Private constructor to avoid new classe's incence
	private Displacement4 ()
	{}

	// Initial displacement: Si = Sf - ∆S
	protected String displacement (double variationDisplacement, double finalDisplacement) 
	{
		return String.valueOf(finalDisplacement - variationDisplacement);
	}

	protected String displacement (
		double variationDisplacement,
		String variationDisplacementUnit,
		double finalDisplacement,
		String finalDisplacementUnit,
		String unitOfResult) 
	{
		return null;
	}

	// Get class instance object
    public static Displacement4 getInstance ()
    {
		if (instance == null)
		{
			instance = new Displacement4();
		}
		return instance;
    }
}
