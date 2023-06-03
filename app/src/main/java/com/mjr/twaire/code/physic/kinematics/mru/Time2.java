package com.mjr.twaire.code.physic.kinematics.mru;

// ∆t = ∆S / ∆v
final class Time2 {
	private static Time2 instance; 
    private double deltaDisplacement;
    private double deltaSpeed;
    
    private int deltaDisplacementUnit;
    private int deltaSpeedUnit;
    private int unitOfResult;
    
    private double step1;
    private boolean hasCustomUnits;

	private Time2() {}
    
    private Time2 setHasCustomUnits (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculeWithoutCustomUnits();
        return this;
    }

    private void calculateWithCustomUnits () {
    }

    private void calculeWithoutCustomUnits () {
        step1 = deltaDisplacement / deltaSpeed;
    }

    public double getResult () {
        return step1;
	}
    
    private Time2 setDeltaDisplacement(double deltaDisplacement) {
        this.deltaDisplacement = deltaDisplacement;
        return this;
    }

    public double getDeltaDisplacement() {
        return deltaDisplacement;
    }

    private Time2 setDeltaSpeed(double deltaSpeed) {
        this.deltaSpeed = deltaSpeed;
        return this;
    }

    public double getDeltaSpeed() {
        return deltaSpeed;
    }

    private Time2 setDeltaDisplacementUnit(int deltaDisplacementUnit) {
        this.deltaDisplacementUnit = deltaDisplacementUnit;
        return this;
    }

    public int getDeltaDisplacementUnit() {
        return deltaDisplacementUnit;
    }

    private Time2 setDeltaSpeedUnit(int deltaSpeedUnit) {
        this.deltaSpeedUnit = deltaSpeedUnit;
        return this;
    }

    public int getDeltaSpeedUnit() {
        return deltaSpeedUnit;
    }

    private Time2 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }

    public static Time2 getInstance(double deltaDisplacement, double deltaSpeed) {
		if(!(instance instanceof Time2))
			instance = new Time2();
		return instance.setDeltaDisplacement(deltaDisplacement)
            .setDeltaSpeed(deltaSpeed)
            .setHasCustomUnits(false);
    }
    
    public static Time2 getInstance(double deltaDisplacement, 
                                    int deltaDisplacementUnit,
                                    double deltaSpeed,
                                    int deltaSpeedUnit,
                                    int unitOfResult) {
        if(!(instance instanceof Time2))
            instance = new Time2();
        return instance.setDeltaDisplacement(deltaDisplacement)
            .setDeltaDisplacementUnit(deltaDisplacementUnit)
            .setDeltaSpeed(deltaSpeed)
            .setDeltaSpeedUnit(deltaSpeedUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true);
    }
}
