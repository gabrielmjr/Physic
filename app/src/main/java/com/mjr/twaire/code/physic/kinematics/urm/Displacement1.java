package com.mjr.twaire.code.physic.kinematics.urm;

import com.mjr.twaire.code.physic.Calculation;
import com.mjr.twaire.code.physic.units.Length;
import com.mjr.twaire.code.physic.units.Unit;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

public final class Displacement1 extends Calculation {
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
		step1 = new Length(finalDisplacement.getValue().subtract(initialDisplacement.getValue()), Length.METER);
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
