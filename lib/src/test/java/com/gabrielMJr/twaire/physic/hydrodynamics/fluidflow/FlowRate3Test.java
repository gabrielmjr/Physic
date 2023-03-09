package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

public class FlowRate3Test {
    private FluidFlow fluidFlow;

    public FlowRate3Test () {
        fluidFlow = FluidFlow.getInstance();
    }

    @Test
    public void flowRate3Test () {
        Double ray = 8.4;
        Double velocity = 4.0;
        String result = "886.2336";
        assertEquals(result, fluidFlow.flowRate3(ray, velocity, GET_RESULT));
    }
}
