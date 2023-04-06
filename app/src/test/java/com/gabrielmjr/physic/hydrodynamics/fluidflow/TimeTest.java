package com.gabrielmjr.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {
    private FluidFlow fluidFlow;

    public TimeTest () {
        fluidFlow = FluidFlow.getInstance();
    }
	
    @Test
    public void timeTest () {
        Double volume = 9.0;
        Double flowRate = 4.0;
        double result = 2.25;
        assertEquals(result, fluidFlow.time(volume, flowRate).getResult());
    }
}
