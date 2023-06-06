package com.mjr.twaire.code.physic.kinematics.muv; 

public interface MUVIF {
    public abstract Acceleration1 acceleration1(
        double deltaSpeed, 
        double deltaTime);

    public abstract Acceleration1 acceleration1(
        double deltaSpeed, 
        int deltaSpeedUnit, 
        double deltaTime, 
        int deltaTimeUnit, 
        int unitOfResult);

    public abstract Acceleration2 acceleration2(
        double deltaSpeed, 
        double initialTime, 
        double finalTime);

    public abstract Acceleration2 acceleration2(
        double deltaSpeed, 
        int deltaSpeedUnit, 
        double initialTime, 
        int initialTimeUnit, 
        double finalTime, 
        int finalTimeUnit, 
        int unitOfResult);

    public abstract Acceleration3 acceleration3(
        double initialSpeed, 
        double finalSpeed, 
        double variationTime);

    public abstract Acceleration3 acceleration3(
        double initialSpeed, 
        int initialSpeedUnit, 
        double finalSpeed, 
        int finalSpeedUnit, 
        double variationTime, 
        int variationTimeUnit, 
        int unitOfResult);

    public abstract Acceleration4 acceleration4(
        double initialSpeed, 
        double finalSpeed, 
        double initialTime, 
        double finalTime);

    public abstract Acceleration4 acceleration4(
        double initialSpeed, 
        int initialSpeedUnit, 
        double finalSpeed, 
        int finalSpeedUnit, 
        double initialTime, 
        int initialTimeUnit, 
        double finalTime, 
        int finalTimeUnit, 
        int unitOfResult);

    public abstract Speed1 speed1(double deltaTime, double acceleration);

    public abstract Speed1 speed1(
        double deltaTime, 
        int deltaSpeedUnit, 
        double acceleration, 
        int accelerationUnit, 
        int unitOfResult);

    public abstract Speed2 speed2(
        double initialTime, 
        double finalTime, 
        double acceleration);

    public abstract Speed2 speed2(
        double initialTime,
        int initialTimeUnit,
        double finalTime, 
        int finalTimeUnit,
        double acceleration,
        int accelerationUnit,
        int unitOfResult);

    public abstract String speed3(
        double finalSpeed, 
        double deltaTime, 
        double acceleration, 
        int stepOrResult);

    public abstract String speed3(
        double finalSpeed, 
        String finalSpeedUnit,
        double deltaTime, 
        String deltaTimeUnit,
        double acceleration, 
        String accelerationUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract String speed4(
        double initialSpeed, 
        double deltaTime, 
        double acceleration, 
        int stepOrResult);

    public abstract String speed4(
        double initialSpeed, 
        String initialSpeedUnit,
        double deltaTime, 
        String deltaTimeUnit,
        double acceleration, 
        String accelerationUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract String time1(double deltaSpeed, double acceleration);

    public abstract String time1(
        double deltaSpeed,
        String deltaSpeedUnit, 
        double acceleration,
        String accelerationUnit,
        String unitOfResult);

    public abstract String time2(
        double initialSpeed, 
        double finalSpeed, 
        double acceleration, 
        int stepOrResult);

    public abstract String time2(
        double initialSpeed, 
        String initialSpeedUnit,
        double finalSpeed, 
        String finalSpeedUnit,
        double acceleration,
        String accelerationUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract String time3(
        double finalTime, 
        double deltaSpeed, 
        double acceleration, 
        int stepOrResult);

    public abstract String time3(
        double finalTime, 
        String finalTimeUnit,
        double deltaSpeed, 
        String deltaSpeedUnit,
        double acceleration, 
        String accelerationUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract String time4(
        double initialTime, 
        double deltaSpeed, 
        double acceleration, 
        int stepOrResult);

    public abstract String time4(
        double initialTime, 
        String initialTimeUnit,
        double deltaSpeed, 
        String deltaSpeedUnit,
        double acceleration,
        String accelerationUnit,
        String unitOfResult,
        int stepOrResult);

    public abstract Displacement1 displacement1(
        double initialDisplacement, 
        double initialSpeed, 
        double deltaTime, 
        double acceleration);

    public abstract Displacement1 displacement1(
        double initialDisplacement, 
        int initialDisplacementUnit,
        double initialSpeed, 
        int initialSpeedUnit,
        double deltaTime, 
        int deltaTimeUnit,
        double acceleration, 
        int accelerationUnit,
        int unitOfResult);

    public abstract Displacement2 displacement2(
        double initialSpeed, 
        double deltaTime, 
        double acceleration, 
        double displacement);

    public abstract Displacement2 displacement2(
        double initialSpeed, 
        int initialSpeedUnit,
        double deltaTime, 
        int deltaTimeUnit,
        double acceleration, 
        int accelerationUnit,
        double displacement,
        int displacementUnit,
        int unitOfResult);
}
