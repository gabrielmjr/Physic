package com.gabrielMJr.twaire.physic.kinematics.mru;

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

    public abstract Displacement2 displacement2 (
        double deltaTime,
        double deltaSpeed);

    public abstract Displacement2 displacement2 (
        double deltaTime,
        int deltaTimeUnit,
        double deltaSpeed,
        int deltaSpeedUnit,
        int unitOfResult);

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

    public abstract String speed1 (
        double variaion_displacement,
        double deltaTime);

	public abstract String speed1 (
        double variaion_displacement,
        String deltaDisplacementUnit,
        double deltaTime,
        String deltaTimeUnit,
        String unitOfResult);

    public abstract String speed2 (
        double initialDisplacement,
        double finalDisplacement,
        double initialTime,
        double finalTime,
        int stepOrResult);

    public abstract String speed2 (
        double initialDisplacement,
        String initialDisplacementUnit,
        double finalDisplacement,
        String finalDisplacementUnit,
        double initialTime,
        String initialTimeUnit,
        double finalTime,
        String finalTimeUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract String speed3 (
        double initialDisplacement,
        double finalDisplacement,
        double deltaTime,
        int stepOrResult);

    public abstract String speed3 (
        double initialDisplacement,
        String initialDisplacementUnit,
        double finalDisplacement,
        String finalDisplacementUnit,
        double deltaTime,
        String deltaTimeUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract String speed4 (
        double deltaDisplacement,
        double initialTime,
        double finalTime,
        int stepOrResult);

    public abstract String speed4 (
        double deltaDisplacement,
        String deltaDisplacementUnit,
        double initialTime,
        String initialTimeUnit,
        double finalTime,
        String finalTimeUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract String time1 (
        double initialTime, 
        double finalTime);

    public abstract String time1 (
        double initialTime, 
        String initialTimeUnit,
        double finalTime,
        String finalTimeUnit,
        String unitOfResult);

    public abstract String time2 (
        double deltaDisplacement, 
        double velocity);

    public abstract String time2 (
        double deltaDisplacement,
        String deltaDisplacementUnit, 
        double velocity,
        String velocityUnit,
        String unitOfResult);

    public abstract String time3 (
        double initialDisplacement, 
        double finalDisplacement, 
        double velocity, 
        int stepOrResult);

    public abstract String time3 (
        double initialDisplacement, 
        String initialDisplacementUnit,
        double finalDisplacement,
        String finalDisplacementUnit, 
        double velocity,
        String velocityUnit,
        String unitOfResult, 
        int stepOrResult);

    public abstract String time4 (
        double deltaTime, 
        double initialTime);

    public abstract String time4 (
        double deltaTime, 
        String deltaTimeUnit,
        double initialTime,
        String initialTimeUnit,
        String unitOfResult);

    public abstract String time5 (
        double initialTime, 
        double deltaTime);

    public abstract String time5 (
        double initialTime, 
        String initialTimeUnit,
        double deltaTime,
        String deltaTimeUnit,
        String unitOfResult);
}
