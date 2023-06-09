package com.mjr.twaire.code.physic.kinematics.mru;

import com.mjr.twaire.code.physic.Calculation;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

public final class Displacement4 extends Calculation {
	private static Displacement4 instance; 
    private double deltaDisplacement;
	private double finalDisplacement;

	private int deltaDisplacementUnit;
	private int finalDispacementUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

	private Displacement4 () {}
    
    @Override
    public Displacement4 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits () {
	}

	private void calculateWithoutCustomUnits () {
		step1 = finalDisplacement - deltaDisplacement;
	}

    @Override
	public double getResult () {
		return step1;
	}

    @Override
	public String getSteps () {
		String deltaDisplacement = putParenthesesIfNegative(this.deltaDisplacement) + "m";
		if (hasCustomUnits)
			return null;
		if (this.deltaDisplacement < 0)
			return "Si = " + finalDisplacement + "m - " + deltaDisplacement
				+ "\nSi = " + finalDisplacement + "m + " + (- this.deltaDisplacement) + "m"
				+ "\nSi = " + step1 + "m";
		return "Si = " + finalDisplacement + "m - " + deltaDisplacement
			+ "\nSi = " + step1 + "m";
	}

	private Displacement4 setDeltaDisplacement (double deltaDisplacement) {
		this.deltaDisplacement = deltaDisplacement;
		return this;
	}

	public double getDeltaDisplacement () {
		return deltaDisplacement;
	}

	private Displacement4 setFinalDisplacement (double finalDisplacement) {
		this.finalDisplacement = finalDisplacement;
		return this;
	}

	public double getFinalDisplacement () {
		return finalDisplacement;
	}

	private Displacement4 setDeltaDisplacementUnit (int deltaDisplacementUnit) {
		this.deltaDisplacementUnit = deltaDisplacementUnit;
		return this;
	}

	public int getDeltaDisplacementUnit () {
		return deltaDisplacementUnit;
	}

	private Displacement4 setFinalDispacementUnit (int finalDispacementUnit) {
		this.finalDispacementUnit = finalDispacementUnit;
		return this;
	}

	public int getFinalDispacementUnit () {
		return finalDispacementUnit;
	}

	private Displacement4 setUnitOfResult (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult () {
		return unitOfResult;
	}
	
    @Override
    public String getFormula() {
        return "Si = S - ∆S";
    }
    
    private Displacement4 setHasCustomUnits (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
	}
    
	public static Displacement4 getInstance (double deltaDisplacement, double finalDisplacement) {
		if (!(instance instanceof Displacement4))
			instance = new Displacement4();
		return instance.setDeltaDisplacement(deltaDisplacement)
		    .setFinalDisplacement(finalDisplacement)
			.setHasCustomUnits(false)
            .calculate();
    }
	
	public static Displacement4 getInstance (double deltaDisplacement, 
											 int deltaDisplacementUnit,
											 double finalDisplacement,
											 int finalDisplacementUnit,
											 int unitOfResult) {
		if (!(instance instanceof Displacement4))
			instance = new Displacement4();
		return instance.setDeltaDisplacement(deltaDisplacement)
		    .setDeltaDisplacementUnit(deltaDisplacementUnit)
		    .setFinalDisplacement(finalDisplacement)
		    .setFinalDispacementUnit(finalDisplacementUnit)
		    .setUnitOfResult(unitOfResult)
		    .setHasCustomUnits(true)
            .calculate();
    }
}
