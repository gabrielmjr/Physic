package com.mjr.code.physics.physics.hydrodynamics.fluidflow;

import com.mjr.code.physics.hydrodynamics.fluidflow.FluidFlow;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.physics.NumberRandomizer.getRandomDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest {
    private FluidFlow fluidFlow;

    public AreaTest () {
        fluidFlow = new FluidFlow();
    }
    
    @Test
    // A = Q / v
    public void areaTest() {
        double flowRate = getRandomDouble();
        double velocity = getRandomDouble();
        double area = flowRate / velocity;
        assertEquals(area, fluidFlow.area(flowRate, velocity).getResult());
    }

    @Test
    public void areaFixedResultTest () {
        double flowrate = 5.6;
        double velocity = 4.0;
        double area = 1.4;
        assertEquals(area, fluidFlow.area(flowrate, velocity).getResult());
    }
}
