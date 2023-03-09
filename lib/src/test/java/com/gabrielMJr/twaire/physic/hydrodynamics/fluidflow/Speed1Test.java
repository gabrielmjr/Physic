package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed1Test {
    private FluidFlow fluidFlow;
    public Speed1Test () {
        fluidFlow = FluidFlow.getInstance();
    }

    @Test
    public void speed1Test () {
        Double flowRate = 8.8;
        Double area = 4.0;
        String result = "2.2";
        assertEquals(result, fluidFlow.speed1(flowRate, area));
    }
}
