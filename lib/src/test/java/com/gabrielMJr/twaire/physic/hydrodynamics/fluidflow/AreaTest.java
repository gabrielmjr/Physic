package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests the fluid flow >> area.class
*/
public class AreaTest
{
    // FluidFlow object
    private FluidFlow fluidFlow;
    
    // Constructor
    public AreaTest()
    {
        // Initialize the variable
        fluidFlow = FluidFlow.getInstance();
    }
    
    @Test
    public void areaTest()
    {
        // The value to be tested:
        Double flowrate = 5.6;
        Double velocity = 4.0;
        
        // The result need to ne:
        String result = "1.4";
        
        // Testing
        assertEquals(result, fluidFlow.area(flowrate, velocity));
    }
}