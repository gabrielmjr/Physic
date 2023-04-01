package com.gabrielmjr.twaire.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed2Test {
    private FluidFlow fluidFlow;

    public Speed2Test () {
        fluidFlow = FluidFlow.getInstance();
    }

    @Test
    public void speed2Test () {
        double flowRate = 8.4;
        double ray = 4.6;
        double result = 0.1264252946913417;
        assertEquals(result, fluidFlow.speed2(flowRate, ray).getResult());
    }
}
