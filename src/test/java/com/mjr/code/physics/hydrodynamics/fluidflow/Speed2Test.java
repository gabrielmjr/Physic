package com.mjr.code.physics.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.NumberRandomizer.getRandomDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed2Test {
    private FluidFlow fluidFlow;

    public Speed2Test () {
        fluidFlow = new FluidFlow();
    }
    
    @Test
    public void speed2Test() {
        double flowRate = getRandomDouble();
        double ray = getRandomDouble();
        double speed2 = flowRate / (3.14 * Math.pow(ray, 2));
        assertEquals(speed2, fluidFlow.speed2(flowRate, ray).getResult());
    }

    @Test
    public void speed2FixedTestTest () {
        double flowRate = 8.4;
        double ray = 4.6;
        double result = 0.1264252946913417;
        assertEquals(result, fluidFlow.speed2(flowRate, ray).getResult());
    }
}
