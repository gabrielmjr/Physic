package com.gabrielmjr.physic.kinematics.muv;

public class MUV implements MUVIF 
{
	private static MUV instance;

	private Acceleration1 acceleration1;
	private Acceleration2 acceleration2;
	private Acceleration3 acceleration3;
	private Acceleration4 acceleration4;

	private Speed1 speed1;
	private Speed2 speed2;
	private Speed3 speed3;
	private Speed4 speed4;

	private Time1 time1;
	private Time2 time2;
	private Time3 time3;
	private Time4 time4;

	private Displacement1 displacement1;
	private Displacement2 displacement2;

	public MUV ()
	{
		acceleration1 = Acceleration1.getInstance();
		acceleration2 = Acceleration2.getInstance();
		acceleration3 = Acceleration3.getInstance();
		acceleration4 = Acceleration4.getInstance();

		speed1 = Speed1.getInstance();
		speed2 = Speed2.getInstance();
		speed3 = Speed3.getInstance();
		speed4 = Speed4.getInstance();

		time1 = Time1.getInstance();
		time2 = Time2.getInstance();
		time3 = Time3.getInstance();
		time4 = Time4.getInstance();

		displacement1 = Displacement1.getInstance();
		displacement2 = Displacement2.getInstance();
	}


	// a = deltaVelocity / deltaTime
	@Override
	public String acceleration1 (double deltaSpeed, double deltaTime)
	{
		return acceleration1.acceleration(deltaSpeed, deltaTime);
	}

	@Override
	public String acceleration1 (
		double deltaSpeed, 
		String deltaSpeedUnit,
		double deltaTime,
		String deltaTimeUnit,
		String unitOfResult)
    {
		return acceleration1.acceleration(
			deltaSpeed,
			deltaSpeedUnit,
			deltaTime,
			deltaTimeUnit,
			unitOfResult);
	}

	// a = (deltaSpeed) / (finalTime - initialTime)
	@Override
	public String acceleration2 (
		double deltaSpeed,
		double initialTime,
		double finalTime,
		int resultOrStep)
	{
		return acceleration2.acceleration(
			deltaSpeed,
			initialTime,
			finalTime,
			resultOrStep);
	}

	@Override
	public String acceleration2 (
		double deltaSpeed,
		String deltaSpeedUnit,
		double initialTime,
		String initialTimeUnit,
		double finalTime,
		String finalTimeUnit,
		String unitOfResult,
		int resultOrStep)
	{
		return acceleration2.acceleration(
			deltaSpeed,
			initialTime,
			finalTime,
			resultOrStep);
	}

	// a = (vf - vi) / variationTime
	@Override
	public String acceleration3 (
		double initialVelocity,
		double finalVelocity, 
		double variationTime,
		int stepOrResult)
    {
		return acceleration3.acceleration(
			initialVelocity,
			finalVelocity,
			variationTime,
			stepOrResult);
    }

	@Override 
	public String acceleration3 (
		double initialVelocity, 
		String initialVelocityUnit, 
		double finalVelocity, 
		String finalVelocityUnit, 
		double variationTime, 
		String variationTimeUnit, 
		String unitOfResult, 
		int stepOrResult)
    {
	    return acceleration3.acceleration(
			initialVelocity,
			initialVelocityUnit,
			finalVelocity,
			finalVelocityUnit,
			variationTime, 
			variationTimeUnit,
			unitOfResult,
			stepOrResult);
	}
	
	// a = (finalVelocity - initialVelocity) ÷ (finalTime - initialTime)
	@Override
	public String acceleration4 (
		double initialVelocity,
		double finalVelocity,
		double initialTime,
		double finalTime,
		int stepOrResult)
    {
		return acceleration4.acceleration(
			initialVelocity,
			finalVelocity,
			initialTime,
			finalTime,
			stepOrResult);
    }

	@Override
	public String acceleration4 (
		double initialVelocity, 
		String initialVelocityUnit, 
		double finalVelocity, 
		String finalVelocityUnit, 
		double initialTime, 
		String initialTimeUnit, 
		double finalTime, 
		String finalTimeUnit,
		String unitOfResult, 
		int stepOrResult)
    {
		return acceleration4.acceleration(
			initialVelocity,
			initialVelocityUnit,
			finalVelocity,
			finalVelocityUnit,
			initialTime,
			initialTimeUnit,
			finalTime,
			finalTimeUnit,
			unitOfResult,
			stepOrResult);
    }

    // Speed
    // First speed's formula: ∆v = ∆t * a
	@Override
	public String speed1 (double deltaTime, double acceleration)
	{
		return speed1.speed(deltaTime, acceleration);
    }

	@Override
	public String speed1 (
		double deltaTime,
		String deltaTimeUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult)
	{
	    return speed1.speed(
			deltaTime,
			deltaTimeUnit,
			acceleration,
			accelerationUnit,
			unitOfResult);
    }


    // Second speed's formula: ∆v = (tf - ti) * acceleration
	@Override
	public String speed2 (
		double initialTime,
		double finalTime, 
		double acceleration,
		int stepOrResult)
    {
		return speed2.speed(
			initialTime,
			finalTime,
			acceleration,
			stepOrResult);
    }

	@Override
	public String speed2 (
		double initialTime,
		String initialTimeUnit,
		double finalTime, 
		String finalTimeUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult)
	{
        return speed2.speed(
			initialTime,
			initialTimeUnit,
			finalTime,
			finalTimeUnit,
			acceleration,
			accelerationUnit,
			unitOfResult,
			stepOrResult);
	}

	// Initial speed: vi = vf - ∆t * a
	@Override
	public String speed3 (
		double finalVelocity,
		double deltaTime,
		double acceleration,
		int stepOrResult) 
    {
		return speed3.speed(
			finalVelocity,
			deltaTime,
			acceleration,
			stepOrResult);
	}

	@Override
	public String speed3 (
		double finalVelocity, 
		String finalVelocityUnit,
		double deltaTime, 
		String deltaTimeUnit,
		double acceleration,  
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult)
    {
		return speed3.speed(
			finalVelocity,
			finalVelocityUnit,
			deltaTime,
			deltaTimeUnit,
			acceleration,
			accelerationUnit,
			unitOfResult,
			stepOrResult);
    }

	// Final speed: vf = ∆t * a + vi
	@Override
	public String speed4 (
		double initialVelocity,
		double deltaTime,
		double acceleration,
		int stepOrResult) 
    {
		return speed4.speed(
			initialVelocity,
			deltaTime,
			acceleration,
			stepOrResult);
    }

	// 
	@Override
	public String speed4 (
		double initialVelocity, 
		String initialVelocityUnit,
		double deltaTime, 
		String deltaTimeUnit,
		double acceleration, 
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult)
    {
		return speed4.speed(
			initialVelocity,
			initialVelocityUnit,
			deltaTime,
			deltaTimeUnit,
			acceleration,
			accelerationUnit,
			unitOfResult,
			stepOrResult);
    }

	// Time
	// First variation of time: ∆t = ∆v / acceleration
	@Override
	public String time1 (double deltaVelocity, double acceleration) 
    {
		return time1.time(deltaVelocity, acceleration);
	}

	@Override  
	public String time1 (
		double deltaVelocity,
		String deltaVelocityUnit, 
		double acceleration,
		String accelerationUnit,
		String unitOfResult)
    {
		return time1.time(
			deltaVelocity,
			deltaVelocityUnit,
			acceleration,
			accelerationUnit,
			unitOfResult);
    }

	// Second variation of time: ∆t = (vf - vi) / acceleration 
	@Override
	public String time2 (
		double initialVelocity, 
		double finalVelocity,
		double acceleration,
		int stepOrResult) 
    {
		return time2.time(
			initialVelocity,
			finalVelocity,
			acceleration,
			stepOrResult);
    }

    @Override
    public String time2 (
		double initialVelocity, 
		String initialVelocityUnit,
		double finalVelocity, 
		String finalVelocityUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult)
    {
		return time2.time(
			initialVelocity,
			initialVelocityUnit,
			finalVelocity,
			finalVelocityUnit,
			acceleration,
			accelerationUnit,
			unitOfResult,
			stepOrResult);
    }

	// Initial time: ti = tf - ∆v / a
	@Override
	public String time3 (
		double finalTime,
		double deltaVelocity,
		double acceleration,
		int stepOrResult)
    {
		return time3.time(
			finalTime,
			deltaVelocity,
			acceleration,
			stepOrResult);
	}

	@Override
	public String time3 (
		double finalTime,
		String finalTimeUnit,
		double deltaVelocity, 
		String deltaVelocityUnit,
		double acceleration, 
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) 
    {
		return time3.time(
			finalTime,
			finalTimeUnit,
			deltaVelocity,
			deltaVelocityUnit,
			acceleration,
			accelerationUnit,
			unitOfResult,
			stepOrResult);
    }

	// Final time: tf = (∆v / a) + ti
	@Override
	public String time4 (
		double initialTime, 
		double deltaVelocity, 
		double acceleration, 
		int stepOrResult)
    {
		return time4.time(
			initialTime,
			deltaVelocity,
			acceleration,
			stepOrResult);
	}

	@Override
	public String time4 (
		double initialTime, 
		String initialTimeUnit,
		double deltaVelocity, 
		String deltaVelocityUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult)
    {
		return time4.time(
			initialTime,
			initialTimeUnit,
			deltaVelocity,
			deltaVelocityUnit,
			acceleration,
			accelerationUnit,
			unitOfResult,
			stepOrResult);
    }

	// Displacement 
	// total Displacement: S = si + vi * ∆t + (a * ∆t²) /2
	@Override
	public String displacement1 (
		double initialDisplacement,
		double initialVelocity,
		double deltaTime,
		double acceleration,
		int stepOrResult) 
    {
		return displacement1.displacement(
			initialDisplacement,
			initialVelocity,
			deltaTime,
			acceleration,
			stepOrResult);
	}

	@Override
	public String displacement1 (
		double initialDisplacement,
		String initialDisplacementUnit,
		double initialVelocity,
		String initialVelocityUnit,
		double deltaTime,
		String deltaTimeUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) 
    {
		return displacement1.displacement(
			initialDisplacement,
			initialDisplacementUnit,
			initialVelocity,
			initialVelocityUnit,
			deltaTime,
			deltaTimeUnit,
			acceleration,
			accelerationUnit,
			unitOfResult,
			stepOrResult);
	}

	// Initial displacement: Si = S - [(vi * ∆t) + (a * ∆t²) / 2]
	@Override
	public String displacement2 (
		double initialVelocity, 
		double deltaTime, 
		double acceleration, 
		double displacement, 
		int stepOrResult)
    {
		return displacement2.displacement(
			initialVelocity,
			deltaTime,
			acceleration,
			displacement,
			stepOrResult);
    }

	@Override
	public String displacement2 (
		double initialVelocity, 
		String initialVelocityUnit,
		double deltaTime, 
		String deltaTimeUnit,
		double acceleration, 
		String accelerationUnit,
		double displacement, 
		String displacementUnit,
		String unitOfResult,
		int stepOrResult)
    {
		return displacement2.displacement(
			initialVelocity,
			initialVelocityUnit,
			deltaTime,
			deltaTimeUnit,
			acceleration,
			accelerationUnit,
			displacement,
			displacementUnit,
			unitOfResult,
			stepOrResult);
    }

    // Get class instance object
    protected static MUV getInstance ()
    {
		if (instance == null)
		{
			instance = new MUV();
		}
		return instance;
    }
}
