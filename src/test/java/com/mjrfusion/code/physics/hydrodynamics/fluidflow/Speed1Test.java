package com.mjrfusion.code.physics.hydrodynamics.fluidflow;

import com.mjrfusion.code.physics.NumberRandomizer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed1Test {
    private FluidFlow fluidFlow;
    public Speed1Test () {
        fluidFlow = new FluidFlow();
    }
    
    @Test
    public void speed1Test() {
        double flowRate = NumberRandomizer.getRandomDouble();
        double area = NumberRandomizer.getRandomDouble();
        double velocity = flowRate / area;
        assertEquals(velocity, fluidFlow.speed1(flowRate, area).getResult());
    }

    @Test
    public void speed1FixedResultTest () {
        double flowRate = 8.8;
        double area = 4.0;
        double result = 2.2;
        assertEquals(result, fluidFlow.speed1(flowRate, area).getResult());
    }
}
