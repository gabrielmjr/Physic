package com.gabrielMJr.twaire.physic.kinematics.vertical_launch.upward;

public interface UpWardIF {
	public abstract Height height(
        double initialHeight,
        double initialVelocity,
        double deltaTime,
        double gravity);

    public abstract Height height(
        double initialHeight,
        int initialHeightUnit,
        double initialVelocity,
        int initialVelocityUnit,
        double deltaTime,
        int deltTimeUnit,
        double gravity,
        int gravityUnit,
		int unitOfResult);
}
