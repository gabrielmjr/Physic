package com.mjrfusion.code.physics.kinematics.urm;

import com.mjrfusion.code.physics.Calculation;
import com.mjrfusion.code.physics.units.Length;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

public class Displacement1 extends Calculation {
	private Length initialDisplacement;
	private Length finalDisplacement;

	private int unitOfResult;

	private Length step1;
	private boolean hasCustomUnits;


	protected Displacement1() {}

    protected Displacement1(Length initialDisplacement, Length finalDisplacement) {
        this.initialDisplacement = initialDisplacement;
        this.finalDisplacement = finalDisplacement;
        hasCustomUnits = false;
        calculate();
    }

    protected Displacement1(Length initialDisplacement,
                            Length finalDisplacement,
                            int unitOfResult) {
        this.initialDisplacement = initialDisplacement;
        this.finalDisplacement = finalDisplacement;
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

	private void calculateWithCustomUnits() {
	}

	private void calculateWithoutCustomUnits() {
        if (!initialDisplacement.equalUnit(finalDisplacement))
            throw new IllegalArgumentException("The initiaDisplacement and finalDisplacement are in diferrent unit, put them in the same unit or set the unit of the result");
		step1 = new Length(finalDisplacement.getValue().subtract(initialDisplacement.getValue()), Length.LengthUnit.METER);
	}

    @Override
	public Length getResult() {
		return step1;
	}

    @Override
	public String getSteps() {
		String initialDisplacement = putParenthesesIfNegative(this.initialDisplacement.getValue(), this.initialDisplacement.getUnitSymbol());
        String finalDisplacement = putParenthesesIfNegative(this.finalDisplacement.getValue(), this.finalDisplacement.getUnitSymbol());
		if (hasCustomUnits)
			return null;
		StringBuilder resolution = new StringBuilder();
        resolution.append("∆S = " + finalDisplacement + " - " + initialDisplacement);
        resolution.append("\n∆S = " + step1.toString());
        return resolution.toString();
	}

	private Displacement1 setInitiDisplacement(Length initialDisplacement) {
		this.initialDisplacement = initialDisplacement;
		return this;
	}

	public Length getInitialDisplacement() {
		return initialDisplacement;
	}

	private Displacement1 setFinalDisplacement(Length finalDisplacement) {
		this.finalDisplacement = finalDisplacement;
		return this;
	}

	public Length getFinalDisplacement() {
		return finalDisplacement;
	}

	public Displacement1 setUnitOfResult(int unitOfResult) {
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
}
