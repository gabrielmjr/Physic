package com.gabrielMJr.twaire.physic.kinematics.mru;

final class Displacement4
{
	private static Displacement4 instance; 

	private Displacement4 ()
	{}

	// Si = Sf - ∆S
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

    public static Displacement4 getInstance ()
    {
		if (instance == null)
		{
			instance = new Displacement4();
		}
		return instance;
    }
}
