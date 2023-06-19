 package com.mjr.twaire.code.physic;

import java.math.BigDecimal;

public abstract class Calculation {
    public abstract Calculation calculate();
	public abstract BigDecimal getResult();
	public abstract String getSteps();
	public abstract String getFormula();
}
