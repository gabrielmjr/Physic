package com.mjr.code.physics.physics.hydrodynamics.fluidflow;

import com.mjr.code.physics.hydrodynamics.fluidflow.FluidFlow;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.physics.NumberRandomizer.getRandomDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RayTest {
    private FluidFlow fluidFlow;

    public RayTest () {
        fluidFlow = new FluidFlow();
    }

    @Test
    public void rayTest() {
        double flowRate = getRandomDouble();
        double velocity = getRandomDouble();
        double ray = Math.sqrt(flowRate / (3.14 * velocity));
        assertEquals(ray, fluidFlow.ray(flowRate, velocity).getResult());
    }
    
    @Test
    public void rayFixedResultTest () {
        double flowRate = 8.4;
        double velocity = 7.0;
        double result = 0.6181954424739327;
        assertEquals(result, fluidFlow.ray(flowRate, velocity).getResult());
    }
}
