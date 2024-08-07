package com.mjrfusion.code.physics.hydrodynamics.fluidflow;

import com.mjrfusion.code.physics.NumberRandomizer;
import org.junit.jupiter.api.Test;

import static com.mjrfusion.code.physics.NumberRandomizer.getRandomDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowRate3Test {
    private FluidFlow fluidFlow;

    public FlowRate3Test () {
        fluidFlow = new FluidFlow();
    }
    
    @Test
    public void flowRate3Test() {
        double ray = NumberRandomizer.getRandomDouble();
        double velocity = NumberRandomizer.getRandomDouble();
        double flowRate = 3.14 * (Math.pow(ray,2)) * velocity;
        assertEquals(flowRate, fluidFlow.flowRate3(ray, velocity).getResult());
    }

    @Test
    public void flowRate3FixedResultTest () {
        double ray = 8.4;
        double velocity = 4.0;
        double result = 886.2336;
        assertEquals(result, fluidFlow.flowRate3(ray, velocity).getResult());
    }
}
