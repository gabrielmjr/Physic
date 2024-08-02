 package com.mjrfusion.code.physics;

 import com.mjrfusion.code.physics.units.Unit;

 public abstract class Calculation {
    public abstract Calculation calculate();
	public abstract Unit getResult();
	public abstract String getSteps();
	public abstract String getFormula();
}
