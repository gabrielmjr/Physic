package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

public class RayTest {
    private FluidFlow fluidFlow;

    public RayTest () {
        fluidFlow = FluidFlow.getInstance();
    }

    @Test
    public void rayTest () {
        Double flowRate = 8.4;
        Double velocity = 7.0;
        String result = "0.6181954424739327";
        assertEquals(result, fluidFlow.ray(flowRate, velocity, GET_RESULT));
    }
}
