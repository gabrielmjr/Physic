package com.mjr.twaire.code.physic.kinematics.urm;

import com.mjr.twaire.code.physic.Calculation;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

public final class Displacement1 extends Calculation {
    @Deprecated
	private static Displacement1 instance; 

	private double initialDisplacement;
	private double finalDisplacement;

	private int initialDisplacementUnit;
	private int finalDisplacementUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;


	protected Displacement1() {}

    protected Displacement1(double initialDisplacement, double finalDisplacement) {
        this.initialDisplacement = initialDisplacement;
        this.finalDisplacement = finalDisplacement;
        hasCustomUnits = false;
        calculate();
    }

    protected Displacement1(double initialDisplacement,
                            int initialDisplacementUnit,
                            double finalDisplacement,
                            int finalDisplacementUnit,
                            int unitOfResult) {
        this.initialDisplacement = initialDisplacement;
        this.finalDisplacement = finalDisplacement;
        this.initialDisplacementUnit = initialDisplacementUnit;
        this.finalDisplacementUnit = finalDisplacementUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }

    @Override
    public Displacement1 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

    @Deprecated
	private Displacement1 setHasCustomUnits(boolean hasCustomUnits) {
		this.hasCustomUnits = hasCustomUnits;
		if (hasCustomUnits)
			calculateWithCustomUnits();
		else
			calculateWithoutCustomUnits();
		return this;
	}

	private void calculateWithCustomUnits() {
	}

	private void calculateWithoutCustomUnits() {
		step1 = finalDisplacement - initialDisplacement;
	}

    @Override
	public double getResult() {
		return step1;
	}

    @Override
	public String getSteps() {
		String initialDisplacement = putParenthesesIfNegative(this.initialDisplacement) + "m";
		boolean isInitialDisplacementNegative = this.initialDisplacement < 0;
		if (hasCustomUnits)
			return null;
		return "∆S = " + finalDisplacement + "m - " + initialDisplacement
            + "\n∆S = " + finalDisplacement + "m " + ((isInitialDisplacementNegative) ? "+ " + (- this.initialDisplacement) : "- " + this.initialDisplacement) + "m"
            + "\n∆S = " + step1 + "m";
	}

	private Displacement1 setInitiDisplacement(double initialDisplacement) {
		this.initialDisplacement = initialDisplacement;
		return this;
	}

	public double getInitialDisplacement() {
		return initialDisplacement;
	}

	private Displacement1 setFinalDisplacement(double finalDisplacement) {
		this.finalDisplacement = finalDisplacement;
		return this;
	}

	public double getFinalDisplacement() {
		return finalDisplacement;
	}

	private Displacement1 setInitialDisplacementUnit(int initialDisplacementUnit) {
		this.initialDisplacementUnit = initialDisplacementUnit;

		return this;
	}

	public int getInitialDisplacementUnit() {
		return initialDisplacementUnit;
	}

	private Displacement1 setFinalDisplacementUnit(int finalDisplacementUnit) {
		this.finalDisplacementUnit = finalDisplacementUnit;
		return this;
	}

	public int getFinalDisplacementUnit() {
		return finalDisplacementUnit;
	}

	private Displacement1 setUnitOfResult(int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult() {
		return unitOfResult;
	}

    @Override
    public String getFormula() {
        return "∆S = S - Si";
    }

    @Deprecated
    public static Displacement1 getInstance(double initialDisplacement, double finalDisplacement) {
		if (!(instance instanceof Displacement1))
			instance = new Displacement1();
		return instance.setInitiDisplacement(initialDisplacement)
		    .setFinalDisplacement(finalDisplacement)
		    .setHasCustomUnits(false)
            .calculate();
    }

    @Deprecated
	public static Displacement1 getInstance(double initialDisplacement, 
                                            int initialDisplacementUnit,
                                            double finalDisplacement,
                                            int finalDisplacementUnit,
                                            int unitOfResult) {
		if (!(instance instanceof Displacement1))
			instance = new Displacement1();
		return instance.setInitiDisplacement(initialDisplacement)
		    .setInitialDisplacementUnit(initialDisplacementUnit)
		    .setFinalDisplacement(finalDisplacement)
		    .setFinalDisplacementUnit(finalDisplacementUnit)
		    .setUnitOfResult(unitOfResult)
		    .setHasCustomUnits(true)
            .calculate();
    }
}
