package com.gabrielMJr.twaire.physic.kinematics.vertical_launch.downward;

public class DownWard implements DownWardIF {

    private static DownWard instance;

    public DownWard() {}

	@Override
	public Height height(double initialHeight,
                         double initialVelocity,
                         double deltaTime,
                         double gravity) {
		return Height.getInstance(initialHeight,
								  initialVelocity,
								  deltaTime,
								  gravity);
	}

	@Override
	public Height height(double initialHeight,
                         int initialHeightUnit,
                         double initialVelocity, 
                         int initialVelocityUnit,
                         double deltaTime,
                         int deltaTimeUnit,
                         double gravity, 
                         int gravityUnit, 
                         int unitOfResult) {
		return Height.getInstance(initialHeight,
								  initialHeightUnit,
								  initialVelocity,
								  initialVelocityUnit,
								  deltaTime,
								  deltaTimeUnit,
								  gravity,
								  gravityUnit,
								  unitOfResult);
	}

	@Override
	public InitialHeight initialHeight(double height,
                                       double initialVelocity,
                                       double deltaTime,
                                       double gravity) {
		return InitialHeight.getInstance(height,
										 initialVelocity,
										 deltaTime,
										 gravity);
	}

	@Override
	public InitialHeight initialHeight(double height,
                                       int heightUnit,
                                       double initialVelocity,
                                       int initialVelocityUnit,
                                       double deltaTime,
                                       int deltaTimeUnit,
                                       double gravity, 
                                       int gravityUnit,
                                       int unitOfResult) {
		return InitialHeight.getInstance(height,
										 heightUnit,
										 initialVelocity,
										 initialVelocityUnit,
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

    @Override
    public DeltaTime1 deltaTime(double deltaSpeed, double gravity) {
        return DeltaTime1.getInstance(deltaSpeed, gravity);
    }

    @Override
    public DeltaTime1 deltaTime(double deltaSpeed,
                                int deltaSpeedUnit, 
                                double gravity,
                                int gravityUnit,
                                int unitOfResult) {
        return DeltaTime1.getInstance(deltaSpeed,
                                      deltaSpeedUnit,
                                      gravity,
                                      gravityUnit,
                                      unitOfResult);
    }

    @Override
    public DeltaTime2 deltaTime(double initialVelocity, 
                                double finalVelocity,
                                double gravity) {
        return DeltaTime2.getInstance(initialVelocity,
                                      finalVelocity,
                                      gravity);
    }

    @Override
    public DeltaTime2 deltaTime(double initialVelocity, 
                                int initialVelocityUnit, 
                                double finalVelocity,
                                int finalVelocityUnit,
                                double gravity, 
                                int gravityUnit,
                                int unitOfResult) {
        return DeltaTime2.getInstance(initialVelocity,
                                      initialVelocityUnit,
                                      finalVelocity,
                                      finalVelocityUnit,
                                      gravity,
                                      gravityUnit,
                                      unitOfResult);
    }

	protected static DownWard getInstance() {
		if (!(instance instanceof DownWard))
			instance = new DownWard();
		return instance;
	}
}
