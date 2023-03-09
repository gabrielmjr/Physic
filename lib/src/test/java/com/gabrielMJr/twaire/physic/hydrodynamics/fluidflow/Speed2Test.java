package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

public class Speed2Test {
    private FluidFlow fluidFlow;

    public Speed2Test () {
        fluidFlow = FluidFlow.getInstance();
    }

    @Test
    public void speed2Test () {
        Double flowRate = 8.4;
        Double ray = 4.6;
        String result = "0.1264252946913417";
        assertEquals(result, fluidFlow.speed2(flowRate, ray, GET_RESULT));
    }
}
