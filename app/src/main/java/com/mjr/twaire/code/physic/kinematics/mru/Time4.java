package com.mjr.twaire.code.physic.kinematics.mru;

// ti = tf - ∆t
final class Time4 {
	private static Time4 instance;
    private double deltaTime;
    private double finalTime;
    
    private int deltaTimeUnit;
    private int finalTimeUnit;
    private int unitOfResult;
    
    private double step1;
    private boolean hasCustomUnits;

	private Time4() {}
    
    private Time4 setHasCustomUnits (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

    private void calculateWithCustomUnits () {
    }

    private void calculateWithoutCustomUnits () {
        step1 = finalTime - deltaTime;
    }

    public double getResult () {
        return step1;
	}

    private Time4 setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    private Time4 setFinalTime(double finalTime) {
        this.finalTime = finalTime;
        return this;
    }

    public double getFinalTime() {
        return finalTime;
    }

    private Time4 setDeltaTimeUnit(int deltaTimeUnit) {
        this.deltaTimeUnit = deltaTimeUnit;
        return this;
    }

    public int getDeltaTimeUnit() {
        return deltaTimeUnit;
    }

    private Time4 setFinalTimeUnit(int finalTimeUnit) {
        this.finalTimeUnit = finalTimeUnit;
        return this;
    }

    public int getFinalTimeUnit() {
        return finalTimeUnit;
    }

    private Time4 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }

    public static Time4 getInstance (double deltaTime, double finalTime) {
		if(!(instance instanceof Time4))
			instance = new Time4();
		return instance.setDeltaTime(deltaTime)
            .setFinalTime(finalTime)
            .setHasCustomUnits(false);
    }
    
    public static Time4 getInstance (double deltaTime, 
                                     int deltaTimeUnit,
                                     double finalTime,
                                     int finalTimeUnit,
                                     int unitOfResult) {
        if(!(instance instanceof Time4))
            instance = new Time4();
        return instance.setDeltaTime(deltaTime)
            .setDeltaTimeUnit(deltaTimeUnit)
            .setFinalTime(finalTime)
            .setFinalTimeUnit(finalTimeUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true);
    }
}
