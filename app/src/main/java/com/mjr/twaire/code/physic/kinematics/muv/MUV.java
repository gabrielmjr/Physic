package com.mjr.twaire.code.physic.kinematics.muv;

public class MUV implements MUVIF {
	private static MUV instance;

	private Speed1 speed1;
	private Speed2 speed2;
	private Speed3 speed3;
	private Speed4 speed4;

	private Time1 time1;
	private Time2 time2;
	private Time3 time3;
	private Time4 time4;

	private Displacement2 displacement2;

	public MUV() {
		speed1 = Speed1.getInstance();
		speed2 = Speed2.getInstance();
		speed3 = Speed3.getInstance();
		speed4 = Speed4.getInstance();

		time1 = Time1.getInstance();
		time2 = Time2.getInstance();
		time3 = Time3.getInstance();
		time4 = Time4.getInstance();

		displacement2 = Displacement2.getInstance();
	}


	// a = deltaVelocity / deltaTime
	@Override
	public Acceleration1 acceleration1(double deltaSpeed, double deltaTime) {
		return new Acceleration1(deltaSpeed, deltaTime);
	}

	@Override
	public Acceleration1 acceleration1(double deltaSpeed, 
                                       int deltaSpeedUnit,
                                       double deltaTime,
                                       int deltaTimeUnit,
                                       int unitOfResult) {
		return new Acceleration1(deltaSpeed,
                                 deltaSpeedUnit,
                                 deltaTime,
                                 deltaTimeUnit,
                                 unitOfResult);
	}

	// a = (deltaSpeed) / (finalTime - initialTime)
	@Override
	public Acceleration2 acceleration2(double deltaSpeed,
                                       double initialTime,
                                       double finalTime) {
		return new Acceleration2(deltaSpeed,
                                 initialTime,
                                 finalTime);
	}

	@Override
	public Acceleration2 acceleration2(double deltaSpeed,
                                       int deltaSpeedUnit,
                                       double initialTime,
                                       int initialTimeUnit,
                                       double finalTime,
                                       int finalTimeUnit,
                                       int unitOfResult) {
		return new Acceleration2(deltaSpeed,
                                 deltaSpeedUnit,
                                 initialTime,
                                 initialTimeUnit,
                                 finalTime,
                                 finalTimeUnit,
                                 unitOfResult);
	}

	// a = (vf - vi) / variationTime
	@Override
	public Acceleration3 acceleration3(double initialVelocity,
                                       double finalVelocity, 
                                       double variationTime) {
		return new Acceleration3(initialVelocity,
                                 finalVelocity,
                                 variationTime);
    }

	@Override 
	public Acceleration3 acceleration3(double initialVelocity, 
                                       int initialVelocityUnit, 
                                       double finalVelocity, 
                                       int finalVelocityUnit, 
                                       double variationTime, 
                                       int variationTimeUnit, 
                                       int unitOfResult) {
	    return new Acceleration3(initialVelocity,
                                 initialVelocityUnit,
                                 finalVelocity,
                                 finalVelocityUnit,
                                 variationTime, 
                                 variationTimeUnit,
                                 unitOfResult);
	}

	// a = (finalVelocity - initialVelocity) ÷ (finalTime - initialTime)
	@Override
	public Acceleration4 acceleration4(
		double initialVelocity,
		double finalVelocity,
		double initialTime,
		double finalTime) {
		return new Acceleration4(initialVelocity,
                                 finalVelocity,
                                 initialTime,
                                 finalTime);
    }

	@Override
	public Acceleration4 acceleration4(double initialVelocity, 
                                       int initialVelocityUnit, 
                                       double finalVelocity, 
                                       int finalVelocityUnit, 
                                       double initialTime, 
                                       int initialTimeUnit, 
                                       double finalTime, 
                                       int finalTimeUnit,
                                       int unitOfResult) {
		return new Acceleration4(initialVelocity,
                                 initialVelocityUnit,
                                 finalVelocity,
                                 finalVelocityUnit,
                                 initialTime,
                                 initialTimeUnit,
                                 finalTime,
                                 finalTimeUnit,
                                 unitOfResult);
    }

    // Speed
    // First speed's formula: ∆v = ∆t * a
	@Override
	public String speed1(double deltaTime, double acceleration) {
		return speed1.speed(deltaTime, acceleration);
    }

	@Override
	public String speed1(
		double deltaTime,
		String deltaTimeUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult) {
	    return speed1.speed(
			deltaTime,
			deltaTimeUnit,
			acceleration,
			accelerationUnit,
			unitOfResult);
    }


    // Second speed's formula: ∆v = (tf - ti) * acceleration
	@Override
	public String speed2(
		double initialTime,
		double finalTime, 
		double acceleration,
		int stepOrResult) {
		return speed2.speed(
			initialTime,
			finalTime,
			acceleration,
			stepOrResult);
    }

	@Override
	public String speed2(
		double initialTime,
		String initialTimeUnit,
		double finalTime, 
		String finalTimeUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) {
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
	public String speed3(
		double finalVelocity,
		double deltaTime,
		double acceleration,
		int stepOrResult) {
		return speed3.speed(
			finalVelocity,
			deltaTime,
			acceleration,
			stepOrResult);
	}

	@Override
	public String speed3(
		double finalVelocity, 
		String finalVelocityUnit,
		double deltaTime, 
		String deltaTimeUnit,
		double acceleration,  
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) {
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
	public String speed4(
		double initialVelocity,
		double deltaTime,
		double acceleration,
		int stepOrResult) {
		return speed4.speed(
			initialVelocity,
			deltaTime,
			acceleration,
			stepOrResult);
    }

	// 
	@Override
	public String speed4(
		double initialVelocity, 
		String initialVelocityUnit,
		double deltaTime, 
		String deltaTimeUnit,
		double acceleration, 
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) {
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
	public String time1(double deltaVelocity, double acceleration) {
		return time1.time(deltaVelocity, acceleration);
	}

	@Override  
	public String time1(
		double deltaVelocity,
		String deltaVelocityUnit, 
		double acceleration,
		String accelerationUnit,
		String unitOfResult) {
		return time1.time(
			deltaVelocity,
			deltaVelocityUnit,
			acceleration,
			accelerationUnit,
			unitOfResult);
    }

	// Second variation of time: ∆t = (vf - vi) / acceleration 
	@Override
	public String time2(
		double initialVelocity, 
		double finalVelocity,
		double acceleration,
		int stepOrResult) {
		return time2.time(
			initialVelocity,
			finalVelocity,
			acceleration,
			stepOrResult);
    }

    @Override
    public String time2(
		double initialVelocity, 
		String initialVelocityUnit,
		double finalVelocity, 
		String finalVelocityUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) {
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
	public String time3(
		double finalTime,
		double deltaVelocity,
		double acceleration,
		int stepOrResult) {
		return time3.time(
			finalTime,
			deltaVelocity,
			acceleration,
			stepOrResult);
	}

	@Override
	public String time3(
		double finalTime,
		String finalTimeUnit,
		double deltaVelocity, 
		String deltaVelocityUnit,
		double acceleration, 
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) {
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
	public String time4(
		double initialTime, 
		double deltaVelocity, 
		double acceleration, 
		int stepOrResult) {
		return time4.time(
			initialTime,
			deltaVelocity,
			acceleration,
			stepOrResult);
	}

	@Override
	public String time4(
		double initialTime, 
		String initialTimeUnit,
		double deltaVelocity, 
		String deltaVelocityUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) {
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
	public Displacement1 displacement1(double initialDisplacement,
		double initialVelocity,
		double deltaTime,
		double acceleration) {
		return new Displacement1(initialDisplacement,
			initialVelocity,
			deltaTime,
			acceleration);
	}

	@Override
	public Displacement1 displacement1(double initialDisplacement,
		int initialDisplacementUnit,
		double initialVelocity,
		int initialVelocityUnit,
		double deltaTime,
		int deltaTimeUnit,
		double acceleration,
		int accelerationUnit,
		int unitOfResult) {
		return new Displacement1(initialDisplacement,
			initialDisplacementUnit,
			initialVelocity,
			initialVelocityUnit,
			deltaTime,
			deltaTimeUnit,
			acceleration,
			accelerationUnit,
			unitOfResult);
	}

	// Initial displacement: Si = S - [(vi * ∆t) + (a * ∆t²) / 2]
	@Override
	public String displacement2(
		double initialVelocity, 
		double deltaTime, 
		double acceleration, 
		double displacement, 
		int stepOrResult) {
		return displacement2.displacement(
			initialVelocity,
			deltaTime,
			acceleration,
			displacement,
			stepOrResult);
    }

	@Override
	public String displacement2(
		double initialVelocity, 
		String initialVelocityUnit,
		double deltaTime, 
		String deltaTimeUnit,
		double acceleration, 
		String accelerationUnit,
		double displacement, 
		String displacementUnit,
		String unitOfResult,
		int stepOrResult) {
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
    protected static MUV getInstance() {
		if (instance == null) {
			instance = new MUV();
		}
		return instance;
    }
}
