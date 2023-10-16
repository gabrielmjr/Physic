 package com.mjr.code.physics;

import com.mjr.code.physics.units.Unit;

public abstract class Calculation {
    public abstract Calculation calculate();
	public abstract Unit getResult();
	public abstract String getSteps();
	public abstract String getFormula();
}
