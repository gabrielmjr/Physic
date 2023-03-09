package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowRate2Test {
    private FluidFlow fluidFlow;

    public FlowRate2Test () {
        fluidFlow = FluidFlow.getInstance();
    }

    @Test
    public void flowRate2Test () {
        Double area = 13.5;
        Double velocity = 3.0;
        String result = "40.5";
        assertEquals(result, fluidFlow.flowRate2(area, velocity));
    }
}
