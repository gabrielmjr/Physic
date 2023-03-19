package com.gabrielMJr.twaire.physic.kinematics.vertical_launch.downward;

import static com.gabrielMJr.twaire.physic.Physic.GET_STEP;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;


final class Height {
    private static Height instance;

    private double initialHeight;
    private double initialVelocity;
    private double time;
    private double gravity;

    private double step1;
    private double step2;
    private double step3;
    private double step4;
    private double step5;
    private double step6;

    private Height () {}

    // y = yo + vo*t + (g * t²) / 2
    protected String calculateHeight (
        double initialHeight,
        double initialVelocity,
        double time,
        double gravity, 
        int resultOrStep) {
        this.initialHeight = initialHeight;
        this.initialVelocity = initialVelocity;
        this.time = time;
        this.gravity = gravity;
		
        step1 = initialVelocity * time;
        step2 = Math.pow(time, 2);
        step3 = step2 * gravity;
        step4 = step3 / 2;
        step5 = initialHeight + step1;
        step6 = step5 + step4;

        switch (resultOrStep) {
            case GET_RESULT:
                return String.valueOf(step6);
            case GET_STEP:
                return getStep();
            default:
				return null;
        }
    }

    private String getStep () {
        String signal1 = (initialVelocity >= 0) ? "+ " : " ";
        return ("y = "
            + initialHeight + "m "
            + signal1
            + initialVelocity + "m/s × "+ time + "s "
            + "(" + gravity + "m/s² × "
            + time + "²) ÷ 2"
            + "\ny = "
            + initialHeight + "m "
            + step1 + "m "
            + "(" + gravity + "m/s² × " 
            + step2 + "s² ÷ 2"
            + "\ny = "
            + initialHeight + "m " 
            + step1 + "m "
            + step3 + "m ÷ ²"
            + "\ny = "
            + initialHeight + "m "
            + step1 + "m ");
    }

    protected String calculateHeight (
        double initialHeight,
		String initialHeightUnit,
        double initialVelocity,
		String initialVelocityUnit,
        double time,
		String timeUnit,
        double gravity,
		String gravityUnit,
        String unitOfResult,
        int resultOrStep) {
        return null;
    }

    protected static Height getInstance () {
        if (!(instance instanceof Height))
            instance = new Height();
        return instance;
    }
}
