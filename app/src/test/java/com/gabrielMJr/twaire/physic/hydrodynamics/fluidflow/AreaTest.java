package com.gabrielmjr.twaire.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest {
    private FluidFlow fluidFlow;

    public AreaTest () {
        fluidFlow = FluidFlow.getInstance();
    }

    @Test
    public void areaTest () {
        double flowrate = 5.6;
        double velocity = 4.0;
        double result = 1.4;
        assertEquals(result, fluidFlow.area(flowrate, velocity).getResult());
    }
}
