package com.gabrielmjr.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowRate1Test {
    private FluidFlow fluidFlow;

    public FlowRate1Test () {
        fluidFlow = FluidFlow.getInstance();
	}

    @Test
    public void flowRate1Test () {
        double volume = 13.5;
        double time = 8.0;
        double result = 1.6875;
        assertEquals(result, fluidFlow.flowRate1(volume, time).getResult());
    }
}
