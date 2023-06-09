package com.mjr.twaire.code.physic.kinematics.muv;

public class MUV implements MUVIF {
	private static MUV instance;

	private Time3 time3;
	private Time4 time4;

	public MUV() {
		time3 = Time3.getInstance();
		time4 = Time4.getInstance();
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
	public Speed1 speed1(double deltaTime, double acceleration) {
		return new Speed1(deltaTime, acceleration);
    }

	@Override
	public Speed1 speed1(double deltaTime,
                         int deltaTimeUnit,
                         double acceleration,
                         int accelerationUnit,
                         int unitOfResult) {
	    return new Speed1(deltaTime,
                          deltaTimeUnit,
                          acceleration,
                          accelerationUnit,
                          unitOfResult);
    }


    // Second speed's formula: ∆v = (tf - ti) * acceleration
	@Override
	public Speed2 speed2(double initialTime,
                         double finalTime, 
                         double acceleration) {
		return new Speed2(initialTime,
                          finalTime,
                          acceleration);
    }

	@Override
	public Speed2 speed2(double initialTime,
                         int initialTimeUnit,
                         double finalTime, 
                         int finalTimeUnit,
                         double acceleration,
                         int accelerationUnit,
                         int unitOfResult) {
        return new Speed2(initialTime,
                          initialTimeUnit,
                          finalTime,
                          finalTimeUnit,
                          acceleration,
                          accelerationUnit,
                          unitOfResult);
	}

	// Initial speed: vi = vf - ∆t * a
	@Override
	public Speed3 speed3(double finalVelocity,
                         double deltaTime,
                         double acceleration) {
		return new Speed3(finalVelocity,
                          deltaTime,
                          acceleration);
	}

	@Override
	public Speed3 speed3(double finalVelocity, 
                         int finalVelocityUnit,
                         double deltaTime, 
                         int deltaTimeUnit,
                         double acceleration,  
                         int accelerationUnit,
                         int unitOfResult) {
		return new Speed3(finalVelocity,
                          finalVelocityUnit,
                          deltaTime,
                          deltaTimeUnit,
                          acceleration,
                          accelerationUnit,
                          unitOfResult);
    }

	// Final speed: vf = ∆t * a + vi
	@Override
	public Speed4 speed4(double initialVelocity,
                         double deltaTime,
                         double acceleration) {
		return new Speed4(initialVelocity,
                          deltaTime,
                          acceleration);
    }

	// 
	@Override
	public Speed4 speed4(double initialVelocity, 
                         int initialVelocityUnit,
                         double deltaTime, 
                         int deltaTimeUnit,
                         double acceleration, 
                         int accelerationUnit,
                         int unitOfResult) {
		return new Speed4(initialVelocity,
                          initialVelocityUnit,
                          deltaTime,
                          deltaTimeUnit,
                          acceleration,
                          accelerationUnit,
                          unitOfResult);
    }

	// Time
	// First variation of time: ∆t = ∆v / acceleration
	@Override
	public Time1 time1(double deltaSpeed, double acceleration) {
		return new Time1(deltaSpeed, acceleration);
	}

	@Override  
	public Time1 time1(double deltaSpeed,
                       int deltaVelocityUnit, 
                       double acceleration,
                       int deltaSpeedUnit,
                       int unitOfResult) {
		return new Time1(deltaSpeed,
                         deltaVelocityUnit,
                         acceleration,
                         deltaSpeedUnit,
                         unitOfResult);
    }

	// Second variation of time: ∆t = (vf - vi) / acceleration 
	@Override
	public Time2 time2(double initialVelocity, 
                       double finalVelocity,
                       double acceleration) {
		return new Time2(initialVelocity,
                         finalVelocity,
                         acceleration);
    }

    @Override
    public Time2 time2(double initialVelocity, 
                       int initialVelocityUnit,
                       double finalVelocity, 
                       int finalVelocityUnit,
                       double acceleration,
                       int accelerationUnit,
                       int unitOfResult) {
		return new Time2(initialVelocity,
                         initialVelocityUnit,
                         finalVelocity,
                         finalVelocityUnit,
                         acceleration,
                         accelerationUnit,
                         unitOfResult);
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
	public Displacement2 displacement2(double initialVelocity, 
                                       double deltaTime, 
                                       double acceleration, 
                                       double displacement) {
		return new Displacement2(initialVelocity,
                                 deltaTime,
                                 acceleration,
                                 displacement);
    }

	@Override
	public Displacement2 displacement2(double initialVelocity, 
                                       int initialVelocityUnit,
                                       double deltaTime, 
                                       int deltaTimeUnit,
                                       double acceleration, 
                                       int accelerationUnit,
                                       double displacement, 
                                       int displacementUnit,
                                       int unitOfResult) {
		return new Displacement2(initialVelocity,
                                 initialVelocityUnit,
                                 deltaTime,
                                 deltaTimeUnit,
                                 acceleration,
                                 accelerationUnit,
                                 displacement,
                                 displacementUnit,
                                 unitOfResult);
    }

    // Get class instance object
    protected static MUV getInstance() {
		if (instance == null) {
			instance = new MUV();
		}
		return instance;
    }
}