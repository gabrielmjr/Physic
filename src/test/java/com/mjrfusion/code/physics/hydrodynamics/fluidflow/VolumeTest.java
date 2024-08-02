package com.mjrfusion.code.physics.hydrodynamics.fluidflow;

import com.mjrfusion.code.physics.NumberRandomizer;
import org.junit.jupiter.api.Test;

import static com.mjrfusion.code.physics.NumberRandomizer.getRandomDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeTest {
    private FluidFlow fluidFlow;

    public VolumeTest () {
        fluidFlow = new FluidFlow();
    }
    
    @Test
    public void volumeTest() {
        double time = NumberRandomizer.getRandomDouble();
        double flowRate = NumberRandomizer.getRandomDouble();
        double volume = flowRate * time;
        assertEquals(volume, fluidFlow.volume(time, flowRate).getResult());
    }

    @Test
    public void volumeFixedResultTest () {
        double time = 8.0;
        double flowRate = 3.2;
        double result = 25.6;
        assertEquals(result, fluidFlow.volume(time, flowRate).getResult());
    }
}
