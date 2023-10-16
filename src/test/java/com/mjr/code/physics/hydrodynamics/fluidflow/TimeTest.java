package com.mjr.code.physics.physics.hydrodynamics.fluidflow;

import com.mjr.code.physics.hydrodynamics.fluidflow.FluidFlow;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.physics.NumberRandomizer.getRandomDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {
    private FluidFlow fluidFlow;

    public TimeTest () {
        fluidFlow = new FluidFlow();
    }
    
    @Test
    public void timeTest() {
        double volume = getRandomDouble();
        double flowRate = getRandomDouble();
        double time = volume / flowRate;
        assertEquals(time, fluidFlow.time(volume, flowRate).getResult());
    }
	
    @Test
    public void timeFixedResultTest () {
        double volume = 9.0;
        double flowRate = 4.0;
        double result = 2.25;
        assertEquals(result, fluidFlow.time(volume, flowRate).getResult());
    }
}
