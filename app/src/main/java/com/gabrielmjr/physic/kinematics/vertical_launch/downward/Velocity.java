package com.gabrielmjr.physic.kinematics.vertical_launch.downward;

// v = vi + g * ∆t
final class Velocity {
    private static Velocity instance;
    private double initialVelocity;
    private double gravity;
    private double deltaTime;
    
    private int initialVelocityUnit;
    private int gravityUnit;
    private int deltaTimeUnit;
    private int unitOfResult;
    
    private double step1;
    private double step2;
    private boolean hasCustomUnits;
    
    private Velocity() {}
    
    private Velocity setHasCustomUnits (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        if (hasCustomUnits) 
            calculateWithCustomUnits();
        else
        	calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits() {
	}
    
    private void calculateWithoutCustomUnits () {
    	step1 = gravity * deltaTime;
    	step2 = initialVelocity + step1;
    }
    
    public double getResult () {
    	return step2;
    }
    
    public String getSteps () {
    	if (hasCustomUnits)
    		return null;
    	else
    		return "v = " + initialVelocity + "m/s + " + gravity + "m/s² × " + deltaTime + "s"
    			+ "\nv = " + initialVelocity + "m/s + " + step1 + "m/s"
                + "\nv = " + step2 + "m/s";
    }
    
    private Velocity setInitialVelocity(double initialVelocity) {
        this.initialVelocity = initialVelocity;
        return this;
    }

    public double getInitialVelocity() {
        return initialVelocity;
    }

    private Velocity setGravity(double gravity) {
        this.gravity = gravity;
        return this;
    }

    public double getGravity() {
        return gravity;
    }

    private Velocity setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    private Velocity setInitialVelocityUnit(int initialVelocityUnit) {
        this.initialVelocityUnit = initialVelocityUnit;
        return this;
    }

    public int getInitialVelocityUnit() {
        return initialVelocityUnit;
    }

    private Velocity setGravityUnit(int gravityUnit) {
        this.gravityUnit = gravityUnit;
        return this;
    }

    public int getGravityUnit() {
        return gravityUnit;
    }

    private Velocity setDeltaTimeUnit(int deltaTimeUnit) {
        this.deltaTimeUnit = deltaTimeUnit;
        return this;
    }

    public int getDeltaTimeUnit() {
        return deltaTimeUnit;
    }
    
    private Velocity setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
    
	protected static Velocity getInstance (double initialVelocity,
							  double gravity,
							  double deltaTime) {
		if (!(instance instanceof Velocity))
            instance = new Velocity();
		return instance.setInitialVelocity(initialVelocity)
		    .setGravity(gravity)
		    .setDeltaTime(deltaTime)
		    .setHasCustomUnits(false);
	}
	
	protected static Velocity getInstance (double initialVelocity,
							  int initialVelocityUnit,
							  double deltaTime,
							  int deltaTimeUnit,
							  double gravity,
							  int gravityUnit,
							  int unitOfResult) {
        if (!(instance instanceof Velocity))
            instance = new Velocity();
        return instance.setInitialVelocity(initialVelocity)
        .setInitialVelocityUnit(initialVelocityUnit)
        .setDeltaTime(deltaTime)
        .setDeltaTimeUnit(deltaTimeUnit)
        .setGravity(gravity)
        .setGravityUnit(gravityUnit)
        .setUnitOfResult(unitOfResult)
        .setHasCustomUnits(true);
	}
}
