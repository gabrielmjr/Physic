package com.mjr.code.physics.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.NumberRandomizer.getRandomDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowRate1Test {
    private FluidFlow fluidFlow;

    public FlowRate1Test () {
        fluidFlow = new FluidFlow();
	}
    
    @Test
    public void flowRate1Test() {
        double volume = getRandomDouble();
        double time = getRandomDouble();
        double flowRate = volume / time;
        assertEquals(flowRate, fluidFlow.flowRate1(volume, time).getResult());
    }

    @Test
    public void flowRate1FixedResultTest () {
        double volume = 13.5;
        double time = 8.0;
        double result = 1.6875;
        assertEquals(result, fluidFlow.flowRate1(volume, time).getResult());
    }
}
