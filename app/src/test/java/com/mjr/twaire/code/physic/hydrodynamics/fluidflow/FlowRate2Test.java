package com.mjr.twaire.code.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;

import static com.mjr.twaire.code.physic.NumberRandomizer.getRandomDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowRate2Test {
    private FluidFlow fluidFlow;

    public FlowRate2Test () {
        fluidFlow = new FluidFlow();
    }

    @Test
    public void flowRate2Test() {
        double area = getRandomDouble();
        double velocity = getRandomDouble();
        double flowRate = velocity * area;
        assertEquals(flowRate, fluidFlow.flowRate2(area, velocity).getResult());
    }
    
    @Test
    public void flowRate2FixedResultTest () {
        double area = 13.5;
        double velocity = 3.0;
        double result = 40.5;
        assertEquals(result, fluidFlow.flowRate2(area, velocity).getResult());
    }
}
