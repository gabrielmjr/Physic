package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest {
    private FluidFlow fluidFlow;

    public AreaTest () {
        fluidFlow = FluidFlow.getInstance();
    }

    @Test
    public void areaTest () {
        Double flowrate = 5.6;
        Double velocity = 4.0;
        String result = "1.4";
        assertEquals(result, fluidFlow.area(flowrate, velocity));
    }
}
