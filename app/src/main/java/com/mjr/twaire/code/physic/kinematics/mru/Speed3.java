package com.mjr.twaire.code.physic.kinematics.mru;

import com.mjr.twaire.code.physic.Physic;

final class Speed3 {
	private static Speed3 instance; 
    private double initialDisplacement;
    private double finalDisplacement;
    private double deltaTime;
    
    private int initialDisplacementUnit;
    private int finalDisplacementUnit;
    private int deltaTimeUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private boolean hasCustomUnits;
    
	private Speed3() {}

	protected  String speed (
		double initialDisplacement,
		double finalDisplacement,
		double deltaTime,
		int resultOrStep) {
		double step1 = finalDisplacement - initialDisplacement;
		double step2 = step1 / deltaTime;
		String res = "";
		String signal1;
		String signal2;
		if (resultOrStep == Physic.GET_RESULT) {
			return String.valueOf(step2);
		} else if (resultOrStep == Physic.GET_STEP) {
			if (initialDisplacement < 0) {
				signal1 = " ";
			} else {
				signal1 = " - ";
			}
			if (deltaTime < 0) {
				signal2 = " ";
			} else {
				signal2 = " - ";
			}
			res = "v = ("
				+ finalDisplacement
				+ "m"
				+ signal1
				+ initialDisplacement
				+ "m) ÷ "
				+ deltaTime
				+ "s"
				+ "\n"
				+ "v = "
				+ step1 
				+ "m ÷ " 
				+ deltaTime
				+ "s"
				+ "\n"
				+ "v = " 
				+ step2
				+ "m/s";
			return res;
		} else {
			return "Erro 404: fourth parameter not found";
		}
	}

	protected  String speed (
		double initialDisplacement,
		String initialDisplacementUnit,
		double finalDisplacement,
		String finalDisplacementUnit,
		double deltaTime,
		String deltaTimeUnit,
		String unitOfResult,
		int resultOrStep) {
		return null;
	}
    
    private Speed3 setInitialDisplacement(double initialDisplacement) {
        this.initialDisplacement = initialDisplacement;
        return this;
    }

    public double getInitialDisplacement() {
        return initialDisplacement;
    }

    private Speed3 setFinalDisplacement(double finalDisplacement) {
        this.finalDisplacement = finalDisplacement;
        return this;
    }

    public double getFinalDisplacement() {
        return finalDisplacement;
    }

    private Speed3 setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    private Speed3 setInitialDisplacementUnit(int initialDisplacementUnit) {
        this.initialDisplacementUnit = initialDisplacementUnit;
        return this;
    }

    public int getInitialDisplacementUnit() {
        return initialDisplacementUnit;
    }

    private Speed3 setFinalDisplacementUnit(int finalDisplacementUnit) {
        this.finalDisplacementUnit = finalDisplacementUnit;
        return this;
    }

    public int getFinalDisplacementUnit() {
        return finalDisplacementUnit;
    }

    private Speed3 setDeltaTimeUnit(int deltaTimeUnit) {
        this.deltaTimeUnit = deltaTimeUnit;
        return this;
    }

    public int getDeltaTimeUnit() {
        return deltaTimeUnit;
    }

    private Speed3 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }

    public static Speed3 getInstance () {
		if(!(instance instanceof Speed3))
			instance = new Speed3();
		return instance;
    }
}
