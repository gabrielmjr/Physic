package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import com.gabrielMJr.twaire.physic.Physic;

final class FlowRate3 {
    private static FlowRate3 instance;

    private FlowRate3 () {}

    protected String flowRate (
		double ray, 
		double velocity,
		int resultOrStep) {
        double step1 = Math.pow(ray, 2);
        double step2 = 3.14 * step1;
        double step3 = step2 * velocity;

        if (resultOrStep == Physic.GET_RESULT) { 
            return String.valueOf(step3);
        } else if (resultOrStep == Physic.GET_STEP) {
            String result = "Q = 3.14 × ("
				+ ray
				+ "m)² × " 
				+ velocity
				+ "m/s";

            result += "\nQ = " 
				+ "3.14 × " 
				+ step1
				+ "m² × " 
				+ velocity 
				+ "m/s";

            result += "\nQ = " 
				+ step2
				+ "m² × " 
				+ velocity 
				+ "m/s";

            result += "\nQ = " 
				+ step3
				+ "m³/s";  
            return result;    
        } else {
            return "Erro 404: third parameter not found";
        }
    }

    protected String flowRate (
		double ray,
		String rayUnit,
		double velocity,
		String velocityUnit,
		String unitOfResult,
		int resultOrStep) {
        return null;
    }

    public static FlowRate3 getInstance () {
        if (!(instance instanceof FlowRate3))
            instance = new FlowRate3();
        return instance;
    }
}
