package com.gabrielMJr.twaire.physic.kinematics.vertical_launch.downward;

public interface DownWardIF {
	public abstract Height height (
	    double initialHeight,
		double initialSpeed,
		double deltaTime,
		double gravity);
		
	public abstract Height height (
	    double initialHeight,
		int initialHeightUnit,
		double initialSpeed,
		int initialSpeedUnit,
		double deltaTime,
		int deltTimeUnit,
		double gravity,
		int gravityUnit,
		int unitOfResult);
}
