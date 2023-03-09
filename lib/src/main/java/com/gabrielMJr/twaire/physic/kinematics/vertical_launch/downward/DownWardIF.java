package com.gabrielMJr.twaire.physic.kinematics.vertical_launch.downward;

public interface DownWardIF {
    // y = yi + vi * t + (g * t²) / 2
    public abstract String height (
        double initialHeight,
        double initialVelocity,
        double time,
        double gravity, 
        int resultOrStep);

    public abstract String height (
        double initialHeight, String initialHeightUnit,
        double initialVelocity, String initialVelocityUnit,
        double time, String timeUnit,
        double gravity, String gravityUnit,
        String unitOfResult,
        int resultOrStep);
}
