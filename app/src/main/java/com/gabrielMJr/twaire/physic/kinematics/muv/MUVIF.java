package com.gabrielMJr.twaire.physic.kinematics.muv; 

public interface MUVIF
{
    public abstract String acceleration1 (
        double deltaSpeed, 
        double deltaTime);

    public abstract String acceleration1 (
        double deltaSpeed, 
        String deltaSpeedUnit, 
        double deltaTime, 
        String deltaTimeUnit, 
        String unitOfResult);

    public abstract String acceleration2 (
        double deltaSpeed, 
        double initialTime, 
        double finalTime, 
        int stepOrResult);

    public abstract String acceleration2 (
        double deltaSpeed, 
        String deltaSpeedUnit, 
        double initialTime, 
        String initialTimeUnit, 
        double finalTime, 
        String finalTimeUnit, 
        String unitOfResult, 
        int stepOrResult);

    public abstract String acceleration3 (
        double initialSpeed, 
        double finalSpeed, 
        double variationTime, 
        int stepOrResult);

    public abstract String acceleration3 (
        double initialSpeed, 
        String initialSpeedUnit, 
        double finalSpeed, 
        String finalSpeedUnit, 
        double variationTime, 
        String variationTimeUnit, 
        String unitOfResult, 
        int stepOrResult);

    public abstract String acceleration4 (
        double initialSpeed, 
        double finalSpeed, 
        double initialTime, 
        double finalTime, 
        int steoOrResult);

    public abstract String acceleration4 (
        double initialSpeed, 
        String initialSpeedUnit, 
        double finalSpeed, 
        String finalSpeedUnit, 
        double initialTime, 
        String initialTimeUnit, 
        double finalTime, 
        String finalTimeUnit, 
        String unitOfResult, 
        int stepOrResult);

    public abstract String speed1 (double deltaTime, double acceleration);

    public abstract String speed1 (
        double deltaTime, 
        String deltaSpeedUnit, 
        double acceleration, 
        String accelerationUnit, 
        String unitOfResult);

    public abstract String speed2 (
        double initialTime, 
        double finalTime, 
        double acceleration, 
        int stepOrResult);

    public abstract String speed2 (
        double initialTime,
        String initialTimeUnit,
        double finalTime, 
        String finalTimeUnit,
        double acceleration,
        String accelerationUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract String speed3 (
        double finalSpeed, 
        double deltaTime, 
        double acceleration, 
        int stepOrResult);

    public abstract String speed3 (
        double finalSpeed, 
        String finalSpeedUnit,
        double deltaTime, 
        String deltaTimeUnit,
        double acceleration, 
        String accelerationUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract String speed4 (
        double initialSpeed, 
        double deltaTime, 
        double acceleration, 
        int stepOrResult);

    public abstract String speed4 (
        double initialSpeed, 
        String initialSpeedUnit,
        double deltaTime, 
        String deltaTimeUnit,
        double acceleration, 
        String accelerationUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract String time1 (double deltaSpeed, double acceleration);

    public abstract String time1 (
        double deltaSpeed,
        String deltaSpeedUnit, 
        double acceleration,
        String accelerationUnit,
        String unitOfResult);

    public abstract String time2 (
        double initialSpeed, 
        double finalSpeed, 
        double acceleration, 
        int stepOrResult);

    public abstract String time2 (
        double initialSpeed, 
        String initialSpeedUnit,
        double finalSpeed, 
        String finalSpeedUnit,
        double acceleration,
        String accelerationUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract String time3 (
        double finalTime, 
        double deltaSpeed, 
        double acceleration, 
        int stepOrResult);

    public abstract String time3 (
        double finalTime, 
        String finalTimeUnit,
        double deltaSpeed, 
        String deltaSpeedUnit,
        double acceleration, 
        String accelerationUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract String time4 (
        double initialTime, 
        double deltaSpeed, 
        double acceleration, 
        int stepOrResult);

    public abstract String time4 (
        double initialTime, 
        String initialTimeUnit,
        double deltaSpeed, 
        String deltaSpeedUnit,
        double acceleration,
        String accelerationUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract String displacement1 (
        double initialDisplacement, 
        double initialSpeed, 
        double deltaTime, 
        double acceleration, 
        int stepOrResult);

    public abstract String displacement1 (
        double initialDisplacement, 
        String initialDisplacementUnit,
        double initialSpeed, 
        String initialSpeedUnit,
        double deltaTime, 
        String deltaTimeUnit,
        double acceleration, 
        String accelerationUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract String displacement2 (
        double initialSpeed, 
        double deltaTime, 
        double acceleration, 
        double displacement,
        int stepOrResult);

    public abstract String displacement2 (
        double initialSpeed, 
        String initialSpeedUnit,
        double deltaTime, 
        String deltaTimeUnit,
        double acceleration, 
        String accelerationUnit,
        double displacement,
        String displacementUnit,
        String unitOfResult,
        int stepOrResult);
}
