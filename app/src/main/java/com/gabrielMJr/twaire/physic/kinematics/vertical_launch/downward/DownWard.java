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
	
	protected static DownWard getInstance () {
		if (!(instance instanceof DownWard))
			instance = new DownWard();
		return instance;
	}
}
