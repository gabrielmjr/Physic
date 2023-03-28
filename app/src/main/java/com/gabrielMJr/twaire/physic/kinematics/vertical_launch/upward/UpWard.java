package com.gabrielMJr.twaire.physic.kinematics.vertical_launch.upward;

public class UpWard implements UpWardIF {

    private static UpWard instance;

    public UpWard() {}

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
	
	protected static UpWard getInstance() {
		if (!(instance instanceof UpWard))
			instance = new UpWard();
		return instance;
	}
}
