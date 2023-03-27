package com.gabrielMJr.twaire.physic.kinematics.vertical_launch.downward;

public class DownWard implements DownWardIF {  
    private static DownWard instance;

    public DownWard() {}

	@Override
	public Height height(double initialHeight,
                         double initialSpeed,
                         double deltaTime,
                         double gravity) {
		return Height.getInstance(initialHeight,
								  initialSpeed,
								  deltaTime,
								  gravity);
	}

	@Override
	public Height height(double initialHeight,
                         int initialHeightUnit,
                         double initialSpeed, 
                         int initialSpeedUnit,
                         double deltaTime,
                         int deltaTimeUnit,
                         double gravity, 
                         int gravityUnit, 
                         int unitOfResult) {
		return Height.getInstance(initialHeight,
								  initialHeightUnit,
								  initialSpeed,
								  initialSpeedUnit,
								  deltaTime,
								  deltaTimeUnit,
								  gravity,
								  gravityUnit,
								  unitOfResult);
	}

	@Override
	public InitialHeight initialHeight(double height,
                                       double initialSpeed,
                                       double deltaTime,
                                       double gravity) {
		return InitialHeight.getInstance(height,
										 initialSpeed,
										 deltaTime,
										 gravity);
	}

	@Override
	public InitialHeight initialHeight(double height,
                                       int heightUnit,
                                       double initialSpeed,
                                       int initialSpeedUnit,
                                       double deltaTime,
                                       int deltaTimeUnit,
                                       double gravity, 
                                       int gravityUnit,
                                       int unitOfResult) {
		return InitialHeight.getInstance(height,
										 heightUnit,
										 initialSpeed,
										 initialSpeedUnit,
										 deltaTime,
										 deltaTimeUnit,
										 gravity,
										 gravityUnit,
										 unitOfResult);
	}

	@Override
	public Velocity velocity(double initialVelocity,
                             double gravity,
                             double deltaTime) {
		return Velocity.getInstance(initialVelocity,
									gravity,
									deltaTime);
	}

	@Override
	public Velocity velocity(double initialVelocity,
                             int initialVelocityUnit,
                             double deltaTime,
                             int deltaTimeUnit,
                             double gravity,
                             int gravityUnit,
                             int unitOfResult) {
		return Velocity.getInstance(initialVelocity,
									initialVelocityUnit,
									deltaTime,
									deltaTimeUnit,
									gravity,
									gravityUnit,
									unitOfResult);
	}

    @Override
    public InitialVelocity initialVelocity(double velocity,
                                           double gravity,
                                           double deltaTime) {
        return InitialVelocity.getInstance(velocity,
                                           gravity,
                                           deltaTime);
    }

    @Override
    public InitialVelocity initialVelocity(double velocity,
                                           int velocityUnit, 
                                           double gravity,
                                           int gravityUnit,
                                           double deltaTime, 
                                           int deltaTimeUnit,
                                           int unitOfResult) {
        return InitialVelocity.getInstance(velocity,
                                           velocityUnit,
                                           gravity,
                                           gravityUnit,
                                           deltaTime,
                                           deltaTimeUnit,
                                           unitOfResult);
    }

	protected static DownWard getInstance() {
		if (!(instance instanceof DownWard))
			instance = new DownWard();
		return instance;
	}
}
