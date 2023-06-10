package com.mjr.twaire.code.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest {
    private FluidFlow fluidFlow;

    public AreaTest () {
        fluidFlow = new FluidFlow();
    }

    @Test
    public void areaTest () {
        double flowrate = 5.6;
        double velocity = 4.0;
        double result = 1.4;
        assertEquals(result, fluidFlow.area(flowrate, velocity).getResult());
    }
}
