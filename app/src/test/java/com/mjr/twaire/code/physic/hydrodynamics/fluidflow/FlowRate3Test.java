package com.mjr.twaire.code.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowRate3Test {
    private FluidFlow fluidFlow;

    public FlowRate3Test () {
        fluidFlow = new FluidFlow();
    }

    @Test
    public void flowRate3Test () {
        double ray = 8.4;
        double velocity = 4.0;
        double result = 886.2336;
        assertEquals(result, fluidFlow.flowRate3(ray, velocity).getResult());
    }
}
