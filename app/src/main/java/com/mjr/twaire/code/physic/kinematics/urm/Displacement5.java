package com.mjr.twaire.code.physic.kinematics.urm;

import com.mjr.twaire.code.physic.Calculation;
import java.math.BigDecimal;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

public final class Displacement5 extends Calculation {
	private static Displacement5 instance; 
	private double initialDisplacement;
	private double deltaDisplacement;

	private int initialDisplacementUnit;
	private int deltaDisplacementUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

	private Displacement5 () {}
    
    @Override
    public Displacement5 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits () {
	}

	private void calculateWithoutCustomUnits () {
		step1 = initialDisplacement + deltaDisplacement;
	}

    @Override
	public BigDecimal getResult () {
		return null; //step1;
	}

    @Override
	public String getSteps () {
		String deltaDisplacement = putParenthesesIfNegative(this.deltaDisplacement) + "m";
		if (hasCustomUnits)
			return null;
		if (this.deltaDisplacement < 0)
			return "Sf = " + initialDisplacement + "m + " + deltaDisplacement
			    + "\nSf = " + initialDisplacement + "m - " + this.deltaDisplacement
				+ "\nSf = " + step1 + "m";
		return "Sf = " + initialDisplacement + "m + " + deltaDisplacement
			+ "\nSf = " + step1 + "m";
	}

	private Displacement5 setInitialDisplacement (double initialDisplacement) {
		this.initialDisplacement = initialDisplacement;
		return this;
	}

	public double getInitialDisplacement () {
		return initialDisplacement;
	}

	private Displacement5 setDeltaDisplacement (double deltaDisplacement) {
		this.deltaDisplacement = deltaDisplacement;
		return this;
	}

	public double getDeltaDisplacement () {
		return deltaDisplacement;
	}

	private Displacement5 setInitialDisplacementUnit (int initialDisplacementUnit) {
		this.initialDisplacementUnit = initialDisplacementUnit;
		return this;
	}

	public int getInitialDisplacementUnit () {
		return initialDisplacementUnit;
	}

	private Displacement5 setDeltaDisplacementUnit (int deltaDisplacementUnit) {
		this.deltaDisplacementUnit = deltaDisplacementUnit;
		return this;
	}

	public int getDeltaDisplacementUnit () {
		return deltaDisplacementUnit;
	}

	private Displacement5 setUnitOfResult (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult () {
		return unitOfResult;
	}
    
    @Override
    public String getFormula() {
        return "S = Si + ∆S";
    }
    
    private Displacement5 setHasCustomUnits (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
	}

	public static Displacement5 getInstance (double initialDisplacement,
        double deltaDisplacement) {
		if (!(instance instanceof Displacement5))
			instance = new Displacement5();
		return instance.setInitialDisplacement(initialDisplacement)
		    .setDeltaDisplacement(deltaDisplacement)
	        .setHasCustomUnits(false)
            .calculate();
	}

	public static Displacement5 getInstance (double initialDisplacement,
											 int initialDisplacementUnit,
											 double deltaDisplacement,
											 int deltaDisplacementUnit,
											 int unitOfResult) {
		if (!(instance instanceof Displacement5)) 
            instance = new Displacement5();
        return instance.setInitialDisplacement(initialDisplacement)
            .setInitialDisplacementUnit(initialDisplacementUnit)
            .setDeltaDisplacement(deltaDisplacement)
            .setDeltaDisplacementUnit(deltaDisplacementUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true)
            .calculate();
	}
}
