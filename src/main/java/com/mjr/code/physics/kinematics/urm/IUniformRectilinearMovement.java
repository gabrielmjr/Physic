package com.mjr.code.physics.kinematics.urm;

import com.mjr.code.physics.units.Length;
import com.mjr.code.physics.units.Speed;
import com.mjr.code.physics.units.Time;

public interface IUniformRectilinearMovement {
    Displacement1 displacement1 (Length initialDisplacement, Length finalDisplacement);

    Displacement1 displacement1 (Length initialDisplacement, Length finalDisplacement, int unitOfResult);

    Displacement1 displacement1();

    Displacement2 displacement2 (Time deltaTime, Speed deltaSpeed);

    Displacement2 displacement2 (Time deltaTime, Speed deltaSpeed, int unitOfResult);

    Displacement2 displacement2();

    Displacement3 displacement3 (double intial_time, double finalTime, double deltaSpeed);

    Displacement3 displacement3 (double initialTime, int initialTimeUnit, double finalTime, int finalTimeUnit, double deltaSpeed, int deltaSpeedUnit, int unitOfResult);

    Displacement3 displacement3();

    Displacement4 displacement4 (double deltaDisplacement, double finalDisplacement);

    Displacement4 displacement4 (double deltaDisplacement, int deltaDisplacementUnit, double finalDisplacement, int finalDisplacementUnit, int unitOfResult);

    Displacement5 displacement5 (double initialDisplacement, double deltaDisplacement);

    Displacement5 displacement5 (double initialDisplacement, int initialDisplacementUnit, double deltaDisplacement, int deltaDisplacementUnit, int unitOfResult);

    Displacement6 displacement6 (double initialDisplacement, double velocity, double deltaTime);

    Displacement6 displacement6 (double initialDisplacement, int initialDisplacementUnit, double velocity, int velocityUnit, double deltaTime, int deltaTimeUnit, int unitOfResult);

    Speed1 speed1 (double variaion_displacement, double deltaTime);

    Speed1 speed1 (double variaion_displacement, int deltaDisplacementUnit, double deltaTime, int deltaTimeUnit, int unitOfResult);

    Speed2 speed2 (double initialDisplacement, double finalDisplacement, double initialTime, double finalTime);

    Speed2 speed2 (double initialDisplacement, int initialDisplacementUnit, double finalDisplacement, int finalDisplacementUnit, double initialTime, int initialTimeUnit, double finalTime, int finalTimeUnit, int unitOfResult);

    Speed3 speed3 (double initialDisplacement, double finalDisplacement, double deltaTime);

    Speed3 speed3 (double initialDisplacement, int initialDisplacementUnit, double finalDisplacement, int finalDisplacementUnit, double deltaTime, int deltaTimeUnit, int unitOfResult);

    Speed4 speed4 (double deltaDisplacement, double initialTime, double finalTime);

    Speed4 speed4 (double deltaDisplacement, int deltaDisplacementUnit, double initialTime, int initialTimeUnit, double finalTime, int finalTimeUnit, int unitOfResult);

    Time1 time1 (double initialTime, double finalTime);

    Time1 time1 (double initialTime, int initialTimeUnit, double finalTime, int finalTimeUnit, int unitOfResult);

    Time2 time2 (double deltaDisplacement, double velocity);

    Time2 time2 (double deltaDisplacement, int deltaDisplacementUnit, double velocity, int velocityUnit, int unitOfResult);

    Time3 time3 (double initialDisplacement, double finalDisplacement, double velocity);

    Time3 time3 (double initialDisplacement, int initialDisplacementUnit, double finalDisplacement, int finalDisplacementUnit, double velocity, int velocityUnit, int unitOfResult);

    Time4 time4 (double deltaTime, double initialTime);

    Time4 time4 (double deltaTime, int deltaTimeUnit, double initialTime, int initialTimeUnit, int unitOfResult);

    Time5 time5 (double initialTime, double deltaTime);

    Time5 time5 (double initialTime, int initialTimeUnit, double deltaTime, int deltaTimeUnit, int unitOfResult);
}
