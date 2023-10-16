package com.mjr.code.physics.kinematics.vertical_launch.downward;

public interface IDownWard {
	Height height(double initialHeight, double initialVelocity, double deltaTime, double gravity);

	Height height(double initialHeight, int initialHeightUnit, double initialVelocity, int initialVelocityUnit, double deltaTime, int deltTimeUnit, double gravity, int gravityUnit, int unitOfResult);

	InitialHeight initialHeight(double height, double initialVelocity, double deltaTime, double gravity);

	InitialHeight initialHeight(double height, int heightUnit, double initialVelocity, int initialVelocityUnit, double deltaTime, int deltaTimeUnit, double gravity, int gravityUnit, int unitOfResult);

    Velocity velocity(double initialVelocity, double gravity, double deltaTime);

    Velocity velocity(double initialVelocity, int initialVelocityUnit, double deltaTime, int deltaTimeUnit, double gravity, int gravityUnit, int unitOfResult);

    InitialVelocity initialVelocity(double velocity, double gravity, double time);

    InitialVelocity initialVelocity(double velocity, int velocityUnit, double gravity, int gravityUnit, double time, int timeUnit, int unitOfResult);

    DeltaTime1 deltaTime(double velocity, double gravity);

    DeltaTime1 deltaTime(double deltaVelocity, int velocityUnit, double gravity, int gravityUnit, int unitOfResult);

    DeltaTime2 deltaTime(double initialVelocity, double finalVelocity, double gravity);

    DeltaTime2 deltaTime(double initialVelocity, int initialVelocityUnit, double finalVelocity, int finalVelocityUnit, double gravity, int gravityUnit, int unitOfResult);
}
