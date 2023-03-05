package com.gabrielMJr.twaire.physic.kinematics.mru;

import com.gabrielMJr.twaire.physic.Physic;


final class Speed4
{
	// This object variable
	private static Speed4 instance; 

	// Private constructor to avoid new classe's incence
	private Speed4 ()
	{}

	// v = ∆S ÷ (tf - ti)
	protected String speed
	(double deltaDisplacement,
     double initialTime,
     double finalTime,
     int stepOrResult)
	{
		double step1 = finalTime - initialTime;
		double step2 = deltaDisplacement / step1;
		String res = "";
		String signal_1;
		if (stepOrResult == Physic.GET_RESULT)
		{
			return String.valueOf(step2);
		}
		else if (stepOrResult == Physic.GET_STEP)
		{
			if (initialTime < 0)
			{
				signal_1 = " ";
			}
			else
			{
				signal_1 = " - ";
			}
			res = "v = ("
				+ deltaDisplacement
				+ "m) ÷ ("
				+ finalTime 
				+ "m "
				+ signal_1
				+ initialTime
				+ "m)"
				+ "\n"
				+ "v = "
				+ deltaDisplacement
				+ "m ÷ "
				+ step1
				+ "s"
				+ "\n"
				+ "v = "
				+ step2 
				+ "m/s";
			return res;
		}
		else 
		{
			return "Erro 404: third parameter not found";
		}
	}

	protected String speed (
		double deltaDisplacement,
		String deltaDisplacementUnit,
		double initialTime,
		String initialTimeUnit,
		double finalTime,
		String finalTimeUnit,
		String unitOfResult,
		int stepOrResult)
	{
		return null;
	}

	// Get class instance object
    public static Speed4 getInstance ()
    {
		if (instance == null)
		{
			instance = new Speed4();
		}
		return instance;
    }
}
