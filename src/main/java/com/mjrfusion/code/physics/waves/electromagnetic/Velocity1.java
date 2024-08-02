package com.mjrfusion.code.physics.waves.electromagnetic;

public class Velocity1 {
    private static Velocity1 instance;
    private double length;
    private double frequency;

    private int lengthUnit;
    private int frequencyUnit;
    private int unitOfResult;

    private double step1;
    private boolean hasCustomUnits;

    private Velocity1() {}

    private Velocity1 setHasCustomUnits(boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnit();
        return this;
    }

    public double getResult() {
        return step1;
    }

    public String getSteps() {
        if (hasCustomUnits)
            return null;
        return "c = " + length + "m ÷ " + frequency + "hz"
            + "\nc = " + step1 + "m/s";
    }

    private void calculateWithCustomUnits() {
    }

    private void calculateWithoutCustomUnit() {
        step1 = length * frequency;
    }

    private Velocity1 setLength(double length) {
        this.length = length;
        return this;
    }

    public double getLength() {
        return length;
    }

    private Velocity1 setFrequency(double frequency) {
        this.frequency = frequency;
        return this;
    }

    public double getFrequency() {
        return frequency;
    }

    private Velocity1 setLengthUnit(int lengthUnit) {
        this.lengthUnit = lengthUnit;
        return this;
    }

    public int getLengthUnit() {
        return lengthUnit;
    }

    private Velocity1 setFrequencyUnit(int frequencyUnit) {
        this.frequencyUnit = frequencyUnit;
        return this;
    }

    public int getFrequencyUnit() {
        return frequencyUnit;
    }

    private Velocity1 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }

    public static Velocity1 getInstance(double length, double frequency) {
        if (!(instance instanceof Velocity1))
            instance = new Velocity1();
        return instance.setLength(length)
                .setFrequency(frequency)
                .setHasCustomUnits(false);
    }

    public static Velocity1 getInstance(double length, int lengthUnit, double frequency, int frequencyUnit) {
        if (!(instance instanceof Velocity1))
            instance = new Velocity1();
        return instance.setLength(length)
            .setLengthUnit(lengthUnit)
            .setFrequency(frequency)
            .setFrequencyUnit(frequencyUnit)
            .setHasCustomUnits(true);
    }
}
