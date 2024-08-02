package com.mjrfusion.code.physics.hydrodynamics.fluidflow;

import com.mjrfusion.code.physics.NumberRandomizer;
import org.junit.jupiter.api.Test;

import static com.mjrfusion.code.physics.NumberRandomizer.getRandomDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest {
    private FluidFlow fluidFlow;

    public AreaTest () {
        fluidFlow = new FluidFlow();
    }
    
    @Test
    // A = Q / v
    public void areaTest() {
        double flowRate = NumberRandomizer.getRandomDouble();
        double velocity = NumberRandomizer.getRandomDouble();
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
