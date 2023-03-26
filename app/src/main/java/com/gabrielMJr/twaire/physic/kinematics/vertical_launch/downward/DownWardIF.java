package com.gabrielMJr.twaire.physic.kinematics.vertical_launch.downward;

public interface DownWardIF {
	public abstract Height height(
	    double initialHeight,
		double initialSpeed,
		double deltaTime,
		double gravity);

	public abstract Height height(
	    double initialHeight,
		int initialHeightUnit,
		double initialSpeed,
		int initialSpeedUnit,
		double deltaTime,
		int deltTimeUnit,
		double gravity,
		int gravityUnit,
		int unitOfResult);

	public abstract InitialHeight initialHeight(
		double height,
		double initialSpeed,
		double deltaTime,
		double gravity);

	public abstract InitialHeight initialHeight(
		double height,
		int heightUnit,
		double initialSpeed,
		int initialSpeedUnit,
		double deltaTime,
		int deltaTimeUnit,
		double gravity,
		int gravityUnit,
		int unitOfResult);

    public abstract Velocity velocity(
        double initialVelocity,
        double gravity,
        double deltaTime);

    public abstract Velocity velocity(
        double initialVelocity,
        int initialVelocityUnit,
        double deltaTime,
        int deltaTimeUnit,
        double gravity,
        int gravityUnit,
        int unitOfResult);

   /* public abstract InitialVelocity initialVelocity(
        double velocity,
        double gravity,
        double time);

    public abstract InitialVelocity initialVelocity(
        double velocity,
        int velocityUnit,
        double gravity,
        int gravityUnit,
        double time,
        int timeUnit,
        int unitOfResult);*/
}
