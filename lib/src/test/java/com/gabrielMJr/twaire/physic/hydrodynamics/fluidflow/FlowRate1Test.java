package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowRate1Test {
    private FluidFlow fluidFlow;

    public FlowRate1Test () {
        fluidFlow = FluidFlow.getInstance();
	}

    @Test
    public void flowRate1Test () {
        Double volume = 13.5;
        Double time = 8.0;
        String result = "1.6875";
        assertEquals(result, fluidFlow.flowRate1(volume, time));
    }
}
