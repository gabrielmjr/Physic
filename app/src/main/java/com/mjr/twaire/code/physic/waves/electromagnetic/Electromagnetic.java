package com.mjr.twaire.code.physic.waves.electromagnetic;

public class Electromagnetic implements ElectromagneticIF {
    private static Electromagnetic instance;

    @Override
    public Velocity1 velocity(double length, double frequency) {
        return Velocity1.getInstance(length, frequency);
    }

    @Override
    public Velocity1 velocity(double length,
                              int lengthUnit,
                              double frequency, 
                              int frequencyUnit) {
        return Velocity1.getInstance(length,
                                     lengthUnit,
                                     frequency,
                                     frequencyUnit);
    }

    protected static Electromagnetic getInstance() {
        if (!(instance instanceof Electromagnetic))
            instance = new Electromagnetic();
        return instance;
    }
}
   
