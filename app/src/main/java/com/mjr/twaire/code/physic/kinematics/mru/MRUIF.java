package com.mjr.twaire.code.physic.kinematics.mru;

public interface MRUIF {
    public abstract Displacement1 displacement1 (
        double initialDisplacement, 
        double finalDisplacement);

    public abstract Displacement1 displacement1 (
        double initialDisplacement,
        int initialDisplacementUnit, 
        double finalDisplacement,
        int finalDisplacementUnit,
        int unitOfResult);
        
    public abstract Displacement1 displacement1();

    public abstract Displacement2 displacement2 (
        double deltaTime,
        double deltaSpeed);

    public abstract Displacement2 displacement2 (
        double deltaTime,
        int deltaTimeUnit,
        double deltaSpeed,
        int deltaSpeedUnit,
        int unitOfResult);
        
    public abstract Displacement2 displacement2();

    public abstract Displacement3 displacement3 (
        double intial_time, 
        double finalTime, 
        double deltaSpeed);

    public abstract Displacement3 displacement3 (
        double initialTime, 
        int initialTimeUnit,
        double finalTime, 
        int finalTimeUnit,
        double deltaSpeed,
        int deltaSpeedUnit, 
        int unitOfResult);
        
    public abstract Displacement3 displacement3();

    public abstract Displacement4 displacement4 (
        double deltaDisplacement, 
        double finalDisplacement);

    public abstract Displacement4 displacement4 (
        double deltaDisplacement, 
        int deltaDisplacementUnit,
        double finalDisplacement,
        int finalDisplacementUnit,
        int unitOfResult);

    public abstract Displacement5 displacement5 (
        double initialDisplacement, 
        double deltaDisplacement);

    public abstract Displacement5 displacement5 (
        double initialDisplacement, 
        int initialDisplacementUnit,
        double deltaDisplacement,
        int deltaDisplacementUnit,
        int unitOfResult);

    public abstract Displacement6 displacement6 (
        double initialDisplacement, 
        double velocity, 
        double deltaTime);

    public abstract Displacement6 displacement6 (
        double initialDisplacement, 
        int initialDisplacementUnit,
        double velocity, 
        int velocityUnit,
        double deltaTime, 
        int deltaTimeUnit,
        int unitOfResult);

    public abstract Speed1 speed1 (
        double variaion_displacement,
        double deltaTime);

	public abstract Speed1 speed1 (
        double variaion_displacement,
        int deltaDisplacementUnit,
        double deltaTime,
        int deltaTimeUnit,
        int unitOfResult);

    public abstract Speed2 speed2 (
        double initialDisplacement,
        double finalDisplacement,
        double initialTime,
        double finalTime);

    public abstract Speed2 speed2 (
        double initialDisplacement,
        int initialDisplacementUnit,
        double finalDisplacement,
        int finalDisplacementUnit,
        double initialTime,
        int initialTimeUnit,
        double finalTime,
        int finalTimeUnit,
        int unitOfResult);

    public abstract Speed3 speed3 (
        double initialDisplacement,
        double finalDisplacement,
        double deltaTime);

    public abstract Speed3 speed3 (
        double initialDisplacement,
        int initialDisplacementUnit,
        double finalDisplacement,
        int finalDisplacementUnit,
        double deltaTime,
        int deltaTimeUnit,
        int unitOfResult);

    public abstract Speed4 speed4 (
        double deltaDisplacement,
        double initialTime,
        double finalTime);

    public abstract Speed4 speed4 (
        double deltaDisplacement,
        int deltaDisplacementUnit,
        double initialTime,
        int initialTimeUnit,
        double finalTime,
        int finalTimeUnit,
        int unitOfResult);

    public abstract Time1 time1 (
        double initialTime, 
        double finalTime);

    public abstract Time1 time1 (
        double initialTime, 
        int initialTimeUnit,
        double finalTime,
        int finalTimeUnit,
        int unitOfResult);

    public abstract Time2 time2 (
        double deltaDisplacement, 
        double velocity);

    public abstract Time2 time2 (
        double deltaDisplacement,
        int deltaDisplacementUnit, 
        double velocity,
        int velocityUnit,
        int unitOfResult);

    public abstract Time3 time3 (
        double initialDisplacement, 
        double finalDisplacement, 
        double velocity);

    public abstract Time3 time3 (
        double initialDisplacement, 
        int initialDisplacementUnit,
        double finalDisplacement,
        int finalDisplacementUnit, 
        double velocity,
        int velocityUnit,
        int unitOfResult);

    public abstract Time4 time4 (
        double deltaTime, 
        double initialTime);

    public abstract Time4 time4 (
        double deltaTime, 
        int deltaTimeUnit,
        double initialTime,
        int initialTimeUnit,
        int unitOfResult);

    public abstract Time5 time5 (
        double initialTime, 
        double deltaTime);

    public abstract Time5 time5 (
        double initialTime, 
        int initialTimeUnit,
        double deltaTime,
        int deltaTimeUnit,
        int unitOfResult);
}
