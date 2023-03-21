package com.gabrielMJr.twaire.physic.kinematics.mru;

public class MRU implements MRUIF {
	private static MRU instance; 

	private Speed1 speed1;
	private Speed2 speed2;
	private Speed3 speed3;
	private Speed4 speed4;

	private Time1 time1;
	private Time2 time2;
	private Time3 time3;
	private Time4 time4;
	private Time5 time5;

	public MRU () {
		speed1 = Speed1.getInstance();
		speed2 = Speed2.getInstance();
		speed3 = Speed3.getInstance();
		speed4 = Speed4.getInstance();

		time1 = Time1.getInstance();
		time2 = Time2.getInstance();
		time3 = Time3.getInstance();
		time4 = Time4.getInstance();
		time5 = Time5.getInstance();
	} 

	// ∆S = Sf - Si
	@Override
	public Displacement1 displacement1 (double initialDisplacement, double finalDisplacement) {
		return Displacement1.getInstance(initialDisplacement, finalDisplacement);
	}

	@Override
	public Displacement1 displacement1 (double initialDisplacement,
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
	public Displacement2 displacement2 (double deltaTime, double deltaSpeed) {
		return Displacement2.getInstance(deltaTime, deltaSpeed);
	}

	@Override
	public Displacement2 displacement2 (double deltaTime,
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
	public Displacement3 displacement3 (double initialTime,
										double finalTime,
										double deltaSpeed) {
		return Displacement3.getInstance(initialTime,
										 finalTime,
										 deltaSpeed);
	}

	@Override
	public Displacement3 displacement3 (double initialTime,
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
	public Displacement4 displacement4 (double deltaDisplacement, double finalDisplacement) {
		return Displacement4.getInstance(deltaDisplacement, finalDisplacement);
	}

	@Override
	public Displacement4 displacement4 (double deltaDisplacement,
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
	public Displacement5 displacement5 (double initialDisplacement, double deltaDisplacement) {
		return Displacement5.getInstance(initialDisplacement, deltaDisplacement);
	}

	@Override
	public Displacement5 displacement5 (double initialDisplacement, 
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
	public Displacement6 displacement6 (double initialDisplacement,
										double velocity,
										double deltaTime) {
		return Displacement6.getInstance(initialDisplacement,
										 velocity,
										 deltaTime);
	}

	@Override
	public Displacement6 displacement6 (double initialDisplacement,
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
	public String speed1 (double deltaDisplacement, double deltaTime) {
		return speed1.speed1(deltaDisplacement, deltaTime);
	}

	@Override
	public String speed1 (
		double deltaDisplacement,
		String deltaDisplacementUnit,
		double deltaTime,
		String deltaTimeUnit,
		String unitOfResult) {
		return speed1.speed1(
			deltaDisplacement,
			deltaDisplacementUnit,
			deltaTime,
			deltaTimeUnit,
			unitOfResult);
	}

	// v = (finalDisplacement - initialDisplacement) / (finalTime - initialTime)
	@Override
	public String speed2 (
		double initialDisplacement,
		double finalDisplacement,
		double initialTime,
		double finalTime,
		int resultOrStep) {
		return  speed2.speed(
			initialDisplacement,
			finalDisplacement,
			initialTime,
			finalTime,
			resultOrStep);
	}

    @Override
	public String speed2 (
		double initialDisplacement,
		String initialDisplacementUnit,
		double finalDisplacement,
		String finalDisplacementUnit,
		double initialTime,
		String initialTimeUnit,
		double finalTime,
		String finalTimeUnit,
		String unitOfResult,
		int resultOrStep) {
		return speed2.speed(
			initialDisplacement,
			initialDisplacementUnit,
			finalDisplacement,
			finalDisplacementUnit,
			initialTime,
			initialTimeUnit,
			finalTime,
			finalTimeUnit,
			unitOfResult,
			resultOrStep);
	}

	// v = (finalDisplacement - initialDisplacement) / deltaTime 
	@Override
	public String speed3 (
		double initialDisplacement,
		double finalDisplacement,
		double deltaTime,
		int resultOrStep) {
		return speed3.speed(
			initialDisplacement,
			finalDisplacement,
			deltaTime,
			resultOrStep);
	} 

	@Override
	public String speed3 (
		double initialDisplacement,
		String initialDisplacementUnit,
		double finalDisplacement,
		String finalDisplacementUnit,
		double deltaTime,
		String deltaTimeUnit,
		String unitOfResult,
		int resultOrStep) {
		return speed3.speed(
			initialDisplacement,
			initialDisplacementUnit,
			finalDisplacement,
			finalDisplacementUnit,
			deltaTime,
			deltaTimeUnit,
			unitOfResult,
			resultOrStep);
	}

	// v = (delta_displacement / (finalTime - initialTime)
	@Override
	public String speed4 (
		double delta_displacement,
		double initialTime,
		double finalTime,
		int resultOrStep) {
		return speed4.speed(
			delta_displacement,
			initialTime,
			finalTime,
			resultOrStep);
	} 

	@Override
	public String speed4 (
		double delta_displacement,
		String delta_displacement_unit,
		double initialTime,
		String initialTimeUnit,
		double finalTime,
		String finalTimeUnit,
		String unitOfResult,
		int resultOrStep) {
		return speed4.speed(
			delta_displacement,
			delta_displacement_unit,
			initialTime,
			initialTimeUnit,
			finalTime,
			finalTimeUnit,
			unitOfResult,
			resultOrStep);
	}

	// ∆t = finalTime - initialTime
	@Override
	public String time1 (double initialTime, double finalTime) {
		return time1.time(initialTime, finalTime);
	}

	@Override
	public String time1 (
		double initialTime,
		String initialTimeUnit,
		double finalTime,
		String finalTimeUnit,
		String unitOfResult) {
		return time1.time(
			initialTime,
			initialTimeUnit,
			finalTime,
			finalTimeUnit,
			unitOfResult);
	}

	// ∆t = ∆S / speed_média
	@Override
	public String time2 (double deltaDisplacement, double speed) {
		return time2.time(deltaDisplacement, speed);
	}

	public String time2 (
		double deltaDisplacement, 
		String deltaDisplacementUnit,
		double velocity,
		String velocityUnit,
		String unitOfResult) {
		return time2.time(
			deltaDisplacement,
			deltaDisplacementUnit,
			velocity,
			velocityUnit,
			unitOfResult);
	}

	// ∆t = (finalDisplacement - initialDisplacement) / speed
	@Override
	public String time3 (
		double initialDisplacement,
		double finalDisplacement,
		double velocity,
		int resultOrStep) {
		return time3.time(
			initialDisplacement,
			finalDisplacement,
			velocity,
			resultOrStep);
	}

	@Override
	public String time3 (
		double initialDisplacement,
		String initialDisplacementUnit,
		double finalDisplacement,
		String finalDisplacementUnit,
		double velocity,
		String velocityUnit,
		String unitOfResult,
		int resultOrStep) {
		return time3.time(
			initialDisplacement,
			initialDisplacementUnit,
			finalDisplacement,
			finalDisplacementUnit,
			velocity,
			velocityUnit,
			unitOfResult,
			resultOrStep);
	}

	// initialTime = finalTime - ∆t
	@Override
	public String time4 (double deltaTime, double finalTime) {
		return time4.time(deltaTime, finalTime);
	}

	@Override
	public String time4 (
		double deltaTime, 
		String deltaTimeUnit,
		double finalTime,
		String finalTimeUnit,
		String unitOfResult) {
		return time4.time(
			deltaTime,
			deltaTimeUnit,
			finalTime,
			finalTimeUnit,
			unitOfResult);
	}

	// finalTime = tempo_inicia + ∆t
	@Override
	public String time5 (double initialTime, double deltaTime) {
		return time5.time(initialTime, deltaTime);
	}

	@Override
	public String time5 (
		double initialTime,
		String initialTimeUnit, 
		double deltaTime,
		String deltaTimeUnit,
		String unitOfResult) {
		return time5.time(
			initialTime,
			initialTimeUnit,
			deltaTime,
			deltaTimeUnit,
			unitOfResult);
	}

    protected static MRU getInstance () {
		if (!(instance instanceof MRU))
			instance = new MRU();
		return instance;
    }
}
