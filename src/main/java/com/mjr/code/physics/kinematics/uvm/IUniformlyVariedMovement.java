package com.mjr.code.physics.kinematics.uvm;

public interface IUniformlyVariedMovement {
    Acceleration1 acceleration1(double deltaSpeed, double deltaTime);

    Acceleration1 acceleration1(double deltaSpeed, int deltaSpeedUnit, double deltaTime, int deltaTimeUnit, int unitOfResult);

    Acceleration2 acceleration2(double deltaSpeed, double initialTime, double finalTime);

    Acceleration2 acceleration2(double deltaSpeed, int deltaSpeedUnit, double initialTime, int initialTimeUnit, double finalTime, int finalTimeUnit, int unitOfResult);

    Acceleration3 acceleration3(double initialSpeed, double finalSpeed, double variationTime);

    Acceleration3 acceleration3(double initialSpeed, int initialSpeedUnit, double finalSpeed, int finalSpeedUnit, double variationTime, int variationTimeUnit, int unitOfResult);

    Acceleration4 acceleration4(double initialSpeed, double finalSpeed, double initialTime, double finalTime);

    Acceleration4 acceleration4(double initialSpeed, int initialSpeedUnit, double finalSpeed, int finalSpeedUnit, double initialTime, int initialTimeUnit, double finalTime, int finalTimeUnit, int unitOfResult);

    Speed1 speed1(double deltaTime, double acceleration);

    Speed1 speed1(double deltaTime, int deltaSpeedUnit, double acceleration, int accelerationUnit, int unitOfResult);

    Speed2 speed2(double initialTime, double finalTime, double acceleration);

    Speed2 speed2(double initialTime, int initialTimeUnit, double finalTime, int finalTimeUnit, double acceleration, int accelerationUnit, int unitOfResult);

    Speed3 speed3(double finalSpeed, double deltaTime, double acceleration);

    Speed3 speed3(double finalSpeed, int finalSpeedUnit, double deltaTime, int deltaTimeUnit, double acceleration, int accelerationUnit, int unitOfResult);

    Speed4 speed4(double initialSpeed, double deltaTime, double acceleration);

    Speed4 speed4(double initialSpeed, int initialSpeedUnit, double deltaTime, int deltaTimeUnit, double acceleration, int accelerationUnit, int unitOfResult);

    Time1 time1(double deltaSpeed, double acceleration);

    Time1 time1(double deltaSpeed, int deltaSpeedUnit, double acceleration, int accelerationUnit, int unitOfResult);

    Time2 time2(double initialSpeed, double finalSpeed, double acceleration);

    Time2 time2(double initialSpeed, int initialSpeedUnit, double finalSpeed, int finalSpeedUnit, double acceleration, int accelerationUnit, int unitOfResult);

    Time3 time3(double finalTime, double deltaSpeed, double acceleration);

    Time3 time3(double finalTime, int finalTimeUnit, double deltaSpeed, int deltaSpeedUnit, double acceleration, int accelerationUnit, int unitOfResult);

    Time4 time4(double initialTime, double deltaSpeed, double acceleration);

    Time4 time4(double initialTime, int initialTimeUnit, double deltaSpeed, int deltaSpeedUnit, double acceleration, int accelerationUnit, int unitOfResult);

    Displacement1 displacement1(double initialDisplacement, double initialSpeed, double deltaTime, double acceleration);

    Displacement1 displacement1(double initialDisplacement, int initialDisplacementUnit, double initialSpeed, int initialSpeedUnit, double deltaTime, int deltaTimeUnit, double acceleration, int accelerationUnit, int unitOfResult);

    Displacement2 displacement2(double initialSpeed, double deltaTime, double acceleration, double displacement);

    Displacement2 displacement2(double initialSpeed, int initialSpeedUnit, double deltaTime, int deltaTimeUnit, double acceleration, int accelerationUnit, double displacement, int displacementUnit, int unitOfResult);
}
