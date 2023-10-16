package com.mjr.code.physics.physics.hydrodynamics.fluidflow;

import com.mjr.code.physics.hydrodynamics.fluidflow.FluidFlow;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.physics.NumberRandomizer.getRandomDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed1Test {
    private FluidFlow fluidFlow;
    public Speed1Test () {
        fluidFlow = new FluidFlow();
    }
    
    @Test
    public void speed1Test() {
        double flowRate = getRandomDouble();
        double area = getRandomDouble();
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