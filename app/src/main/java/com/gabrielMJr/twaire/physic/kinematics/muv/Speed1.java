package com.gabrielmjr.twaire.physic.kinematics
.muv;

final class Speed1
{
	private static Speed1 instance; 

	private Speed1 ()
	{}

    protected String speed (double deltaTime, double acceleration)
    {
		return String.valueOf(deltaTime * acceleration);
    }

    public String speed (
		double deltaTime,
		String deltaTimeUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult) 
    {
		return null;
    }

    public static Speed1 getInstance ()
    {
		if (instance == null)
		{
			instance = new Speed1();
		}
		return instance;
    }
}
