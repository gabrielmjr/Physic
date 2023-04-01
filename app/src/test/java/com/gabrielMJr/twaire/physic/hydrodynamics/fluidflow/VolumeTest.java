package com.gabrielmjr.twaire.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeTest {
    private FluidFlow fluidFlow;

    public VolumeTest () {
        fluidFlow = FluidFlow.getInstance();
    }

    @Test
    public void volumeTest () {
        double time = 8.0;
        double flowRate = 3.2;
        double result = 25.6;
        assertEquals(result, fluidFlow.volume(time, flowRate).getResult());
    }
}
