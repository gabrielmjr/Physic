package com.gabrielMJr.twaire.physic.kinematics.vertical_launch.downward;

public interface DownWardIF {
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

	public abstract InitialHeight initialHeight(
		double height,
		double initialVelocity,
		double deltaTime,
		double gravity);

	public abstract InitialHeight initialHeight(
		double height,
		int heightUnit,
		double initialVelocity,
		int initialVelocityUnit,
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

    public abstract InitialVelocity initialVelocity(
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
        int unitOfResult);

    public abstract DeltaTime1 deltaTime(
        double velocity,
        double gravity);

    public abstract DeltaTime1 deltaTime(
        double deltaVelocity,
        int velocityUnit,
        double gravity,
        int gravityUnit,
        int unitOfResult);

    public abstract DeltaTime2 deltaTime(
        double initialVelocity,
        double finalVelocity,
        double gravity);

    public abstract DeltaTime2 deltaTime(
        double initialVelocity,
        int initialVelocityUnit,
        double finalVelocity,
        int finalVelocityUnit,
        double gravity,
        int gravityUnit,
        int unitOfResult);
}
