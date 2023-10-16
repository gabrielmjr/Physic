package com.mjr.code.physics.waves.electromagnetic;

public interface IElectromagnetic {
    public abstract Velocity1 velocity(
        double length,
        double frequency);
        
    public abstract Velocity1 velocity(
        double length,
        int lengthUnit,
        double frequency,
        int frequencyUnit);
}
