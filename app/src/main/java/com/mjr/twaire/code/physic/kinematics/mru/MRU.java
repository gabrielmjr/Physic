package com.mjr.twaire.code.physic.kinematics.mru;

public class MRU implements MRUIF {
	private static MRU instance; 

	public MRU() {} 

	// ∆S = Sf - Si
	@Override
	public Displacement1 displacement1(double initialDisplacement, double finalDisplacement) {
		return Displacement1.getInstance(initialDisplacement, finalDisplacement);
	}

	@Override
	public Displacement1 displacement1(double initialDisplacement,
                                       int initialDisplacementUnit, 
                                       double finalDisplacement,
                                       int finalDisplacementUnit,
                                       int unitOfResult) {
		return Displacement1.getInstance(initialDisplacement,
										 initialDisplacementUnit,
										 finalDisplacement,
										 finalDisplacementUnit,
										 unitOfResult);
	}

	// ∆S = ∆t x speed_média
	@Override
	public Displacement2 displacement2(double deltaTime, double deltaSpeed) {
		return Displacement2.getInstance(deltaTime, deltaSpeed);
	}

	@Override
	public Displacement2 displacement2(double deltaTime,
                                       int deltaTimeUnit, 
                                       double deltaSpeed,
                                       int deltaSpeedUnit,
                                       int unitOfResult) {
		return Displacement2.getInstance(deltaTime,
										 deltaSpeedUnit,
										 deltaSpeed,
										 deltaSpeedUnit,
										 unitOfResult);
	}

	// ∆S = (finalTime - initialTime) x media_speed
	@Override
	public Displacement3 displacement3(double initialTime,
                                       double finalTime,
                                       double deltaSpeed) {
		return Displacement3.getInstance(initialTime,
										 finalTime,
										 deltaSpeed);
	}

	@Override
	public Displacement3 displacement3(double initialTime,
                                       int initialTimeUnit,
                                       double finalTime,
                                       int finalTimeUnit,
                                       double deltaSpeed,
                                       int deltaSpeedUnit,
                                       int unitOfResult) {
		return Displacement3.getInstance(initialTime,
										 initialTimeUnit,
										 finalTime,
										 finalTimeUnit,
										 deltaSpeed,
										 deltaSpeedUnit,
										 unitOfResult);
	}

	// S_inicial = S_final - ∆S
	@Override
	public Displacement4 displacement4(double deltaDisplacement, double finalDisplacement) {
		return Displacement4.getInstance(deltaDisplacement, finalDisplacement);
	}

	@Override
	public Displacement4 displacement4(double deltaDisplacement,
                                       int deltaDisplacementUnit,
                                       double finalDisplacement,
                                       int finalDisplacementUnit,
                                       int unitOfResult) {
		return Displacement4.getInstance(deltaDisplacement,
										 deltaDisplacementUnit,
										 finalDisplacement,
										 finalDisplacementUnit,
										 unitOfResult);
	}

	// S_final = S_inicial + ∆S
	@Override
	public Displacement5 displacement5(double initialDisplacement, double deltaDisplacement) {
		return Displacement5.getInstance(initialDisplacement, deltaDisplacement);
	}

	@Override
	public Displacement5 displacement5(double initialDisplacement, 
                                       int initialDisplacementUnit,
                                       double deltaDisplacement,
                                       int deltaDisplacementUnit,
                                       int unitOfResult) {
		return Displacement5.getInstance(initialDisplacement,
										 initialDisplacementUnit,
										 deltaDisplacement,
										 deltaDisplacementUnit,
										 unitOfResult);
	}

	// S = S_inicial + velocity * ∆t
	@Override
	public Displacement6 displacement6(double initialDisplacement,
                                       double velocity,
                                       double deltaTime) {
		return Displacement6.getInstance(initialDisplacement,
										 velocity,
										 deltaTime);
	}

	@Override
	public Displacement6 displacement6(double initialDisplacement,
                                       int initialDisplacementUnit,
                                       double velocity,
                                       int velocityUnit,
                                       double deltaTime,
                                       int deltaTimeUnit,
                                       int unitOfResult) {
		return Displacement6.getInstance(initialDisplacement,
										 initialDisplacementUnit,
										 velocity,
										 velocityUnit,
										 deltaTime,
										 deltaTimeUnit,
										 unitOfResult);
	}

	// v = ∆S / ∆t
	@Override
	public Speed1 speed1(double deltaDisplacement, double deltaTime) {
		return Speed1.getInstance(deltaDisplacement, deltaTime);
	}

	@Override
	public Speed1 speed1(double deltaDisplacement,
                         int deltaDisplacementUnit,
                         double deltaTime,
                         int deltaTimeUnit,
                         int unitOfResult) {
		return Speed1.getInstance(deltaDisplacement,
                                  deltaDisplacementUnit,
                                  deltaTime,
                                  deltaTimeUnit,
                                  unitOfResult);
	}

	// v = (finalDisplacement - initialDisplacement) / (finalTime - initialTime)
	@Override
	public Speed2 speed2(double initialDisplacement,
                         double finalDisplacement,
                         double initialTime,
                         double finalTime) {
		return Speed2.getInstance(initialDisplacement,
                                  finalDisplacement,
                                  initialTime,
                                  finalTime);
	}

    @Override
	public Speed2 speed2(double initialDisplacement,
                         int initialDisplacementUnit,
                         double finalDisplacement,
                         int finalDisplacementUnit,
                         double initialTime,
                         int initialTimeUnit,
                         double finalTime,
                         int finalTimeUnit,
                         int unitOfResult) {
		return Speed2.getInstance(initialDisplacement,
                                  initialDisplacementUnit,
                                  finalDisplacement,
                                  finalDisplacementUnit,
                                  initialTime,
                                  initialTimeUnit,
                                  finalTime,
                                  finalTimeUnit,
                                  unitOfResult);
	}

	// v = (finalDisplacement - initialDisplacement) / deltaTime 
	@Override
	public Speed3 speed3(double initialDisplacement,
                         double finalDisplacement,
                         double deltaTime) {
		return Speed3.getInstance(initialDisplacement,
                                  finalDisplacement,
                                  deltaTime);
	} 

	@Override
	public Speed3 speed3(double initialDisplacement,
                         int initialDisplacementUnit,
                         double finalDisplacement,
                         int finalDisplacementUnit,
                         double deltaTime,
                         int deltaTimeUnit,
                         int unitOfResult) {
		return Speed3.getInstance(initialDisplacement, initialDisplacementUnit,
                                  finalDisplacement,
                                  finalDisplacementUnit,
                                  deltaTime,
                                  deltaTimeUnit,
                                  unitOfResult);
	}

	// v = (delta_displacement / (finalTime - initialTime)
	@Override
	public Speed4 speed4(double delta_displacement,
                         double initialTime,
                         double finalTime) {
		return Speed4.getInstance(delta_displacement,
                                  initialTime,
                                  finalTime);
	}

	@Override
	public Speed4 speed4(double delta_displacement,
                         int delta_displacement_unit,
                         double initialTime,
                         int initialTimeUnit,
                         double finalTime,
                         int finalTimeUnit,
                         int unitOfResult) {
		return Speed4.getInstance(delta_displacement,
                                  delta_displacement_unit,
                                  initialTime,
                                  initialTimeUnit,
                                  finalTime,
                                  finalTimeUnit,
                                  unitOfResult);
	}

	// ∆t = finalTime - initialTime
	@Override
	public Time1 time1(double initialTime, double finalTime) {
		return Time1.getInstance(initialTime, finalTime);
	}

	@Override
	public Time1 time1(double initialTime,
                       int initialTimeUnit,
                       double finalTime,
                       int finalTimeUnit,
                       int unitOfResult) {
		return Time1.getInstance(initialTime,
                                 initialTimeUnit,
                                 finalTime,
                                 finalTimeUnit,
                                 unitOfResult);
	}

	// ∆t = ∆S / speed_média
	@Override
	public Time2 time2(double deltaDisplacement, double speed) {
		return Time2.getInstance(deltaDisplacement, speed);
	}

    @Override
	public Time2 time2(double deltaDisplacement, 
                       int deltaDisplacementUnit,
                       double velocity,
                       int velocityUnit,
                       int unitOfResult) {
		return Time2.getInstance(deltaDisplacement,
                                 deltaDisplacementUnit,
                                 velocity,
                                 velocityUnit,
                                 unitOfResult);
	}

	// ∆t = (finalDisplacement - initialDisplacement) / speed
	@Override
	public Time3 time3(double initialDisplacement,
                       double finalDisplacement,
                       double velocity) {
		return Time3.getInstance(initialDisplacement,
                                 finalDisplacement,
                                 velocity);
	}

	@Override
	public Time3 time3(double initialDisplacement,
                       int initialDisplacementUnit,
                       double finalDisplacement,
                       int finalDisplacementUnit,
                       double velocity,
                       int velocityUnit,
                       int unitOfResult) {
		return Time3.getInstance(initialDisplacement,
                                 initialDisplacementUnit,
                                 finalDisplacement,
                                 finalDisplacementUnit,
                                 velocity,
                                 velocityUnit,
                                 unitOfResult);
	}

	// initialTime = finalTime - ∆t
	@Override
	public Time4 time4(double deltaTime, double finalTime) {
		return Time4.getInstance(deltaTime, finalTime);
	}

	@Override
	public Time4 time4(double deltaTime, 
                       int deltaTimeUnit,
                       double finalTime,
                       int finalTimeUnit,
                       int unitOfResult) {
		return Time4.getInstance(deltaTime,
                                 deltaTimeUnit,
                                 finalTime,
                                 finalTimeUnit,
                                 unitOfResult);
	}

	// finalTime = tempo_inicia + ∆t
	@Override
	public Time5 time5(double initialTime, double deltaTime) {
		return Time5.getInstance(initialTime, deltaTime);
	}

	@Override
	public Time5 time5(double initialTime,
                       int initialTimeUnit, 
                       double deltaTime,
                       int deltaTimeUnit,
                       int unitOfResult) {
		return Time5.getInstance(initialTime,
                                 initialTimeUnit,
                                 deltaTime,
                                 deltaTimeUnit,
                                 unitOfResult);
	}

    protected static MRU getInstance() {
		if (!(instance instanceof MRU))
			instance = new MRU();
		return instance;
    }
}
