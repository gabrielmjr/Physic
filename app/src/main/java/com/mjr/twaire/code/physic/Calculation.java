 package com.mjr.twaire.code.physic;

import com.mjr.twaire.code.physic.units.Unit;

public abstract class Calculation {
    public abstract Calculation calculate();
	public abstract Unit getResult();
	public abstract String getSteps();
	public abstract String getFormula();
}
