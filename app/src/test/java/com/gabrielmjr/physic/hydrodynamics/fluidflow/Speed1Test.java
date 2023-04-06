package com.gabrielmjr.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed1Test {
    private FluidFlow fluidFlow;
    public Speed1Test () {
        fluidFlow = FluidFlow.getInstance();
    }

    @Test
    public void speed1Test () {
        double flowRate = 8.8;
        double area = 4.0;
        double result = 2.2;
        assertEquals(result, fluidFlow.speed1(flowRate, area).getResult());
    }
}
