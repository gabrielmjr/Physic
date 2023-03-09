package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeTest {
    private FluidFlow fluidFlow;

    public VolumeTest () {
        fluidFlow = FluidFlow.getInstance();
    }

    @Test
    public void volumeTest () {
        Double time = 8.0;
        Double flowRate = 3.2;
        String result = "25.6";
        assertEquals(result, fluidFlow.volume(time, flowRate));
    }
}
