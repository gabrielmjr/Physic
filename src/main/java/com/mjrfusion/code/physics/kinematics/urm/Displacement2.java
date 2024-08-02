package com.mjrfusion.code.physics.kinematics.urm;

import com.mjrfusion.code.physics.Calculation;
import com.mjrfusion.code.physics.units.Speed;
import com.mjrfusion.code.physics.units.Time;
import com.mjrfusion.code.physics.units.Unit;

public final class Displacement2 extends Calculation {
    @Deprecated
	private static Displacement2 instance; 

	private Time deltaTime;
	private Speed deltaSpeed;

	private int unitOfResult;

	private Speed step1;
	private boolean hasCustomUnits;

    protected Displacement2() {}

    protected Displacement2(Time deltaTime, Speed deltaSpeed) {
        this.deltaTime = deltaTime;
        this.deltaSpeed = deltaSpeed;
        hasCustomUnits = false;
        calculate();
    }

    protected Displacement2(Time deltaTime, 
                            Speed deltaSpeed,
                            int unitOfResult) {
        this.deltaTime = deltaTime;
        this.deltaSpeed = deltaSpeed;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }

    @Override
    public Displacement2 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
		return this;
    }

	private void calculateWithCustomUnits() {
	}

	private void calculateWithoutCustomUnits() {
		//Speed = new Speed(deltaTime.getValue() deltaSpeed);
	}

    @Override
	public Unit getResult() {
		return null; //step1;
	}

    @Override
	public String getSteps() {
		if (hasCustomUnits)
			return null;
		return "∆S = " + deltaTime + "s × " + deltaSpeed + "m/s"
			+ "\nS = " + step1 + "m";
	}

	private Displacement2 setDeltaTime(Time deltaTime) {
		this.deltaTime = deltaTime;
		return this;
	}

	public Time getDeltaTime() {
		return deltaTime;
	}

	private Displacement2 setDeltaSpeed(Speed deltaSpeed) {
		this.deltaSpeed = deltaSpeed;
		return this;
	}

	public Speed getdeltaSpeed() {
		return deltaSpeed;
	}
    
	private Displacement2 setUnitOfResult(int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult() {
		return unitOfResult;
	}

    @Override
    public String getFormula() {
        return "∆S = ∆t × ∆v";
    }
}
