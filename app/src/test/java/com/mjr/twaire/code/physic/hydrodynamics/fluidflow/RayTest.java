package com.mjr.twaire.code.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RayTest {
    private FluidFlow fluidFlow;

    public RayTest () {
        fluidFlow = new FluidFlow();
    }

    @Test
    public void rayTest () {
        double flowRate = 8.4;
        double velocity = 7.0;
        double result = 0.6181954424739327;
        assertEquals(result, fluidFlow.ray(flowRate, velocity).getResult());
    }
}
