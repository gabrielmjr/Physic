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

    public abstract String displacement2 (
        double deltaTime,
        double deltaSpeed);

    public abstract String displacement2 (
        double deltaTime,
        String deltaTimeUnit,
        double deltaSpeed,
        String deltaSpeedUnit,
        String unitOfResult);

    public abstract String displacement3 (
        double intial_time, 
        double finalTime, 
        double deltaSpeed, 
        int resultOrStep);

    public abstract String displacement3 (
        double initialTime, 
        String initialTimeUnit,
        double finalTime, 
        String finalTimeUnit,
        double deltaSpeed,
        String deltaSpeedUnit, 
        String unit_pf_result,
        int resultOrStep);

    public abstract String displacement4 (
        double deltaDisplacement, 
        double finalDisplacement);

    public abstract String displacement4 (
        double deltaDisplacement, 
        String deltaDisplacementUnit,
        double finalDisplacement,
        String finalDisplacementUnit,
        String unitOfResult);

    public abstract String displacement5 (
        double initialDisplacement, 
        double deltaDisplacement);

    public abstract String displacement5 (
        double initialDisplacement, 
        String initialDisplacementUnit,
        double deltaDisplacement,
        String deltaDisplacementUnit,
        String unitOfResult);

    public abstract String displacement6 (
        double initialDisplacement, 
        double velocity, 
        double deltaTime, 
        int resultOrStep);

    public abstract String displacement6 (
        double initialDisplacement, 
        String initialDisplacementUnit,
        double velocity, 
        String velocityUnit,
        double deltaTime, 
        String deltaTimeUnit,
        String unitOfResult,
        int resultOrStep);

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
