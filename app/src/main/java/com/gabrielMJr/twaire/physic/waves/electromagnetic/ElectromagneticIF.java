package com.gabrielmjr.twaire.physic.waves.electromagnetic;

public interface ElectromagneticIF {
    public abstract Velocity1 velocity(
        double length,
        double frequency);
        
    public abstract Velocity1 velocity(
        double length,
        int lengthUnit,
        double frequency,
        int frequencyUnit);
}
