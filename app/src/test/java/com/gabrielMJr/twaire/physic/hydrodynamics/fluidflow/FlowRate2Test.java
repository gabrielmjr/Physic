package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests fluidflow>>flowrate2 methods
*/
public class FlowRate2Test
{
    // FlowRate object
    private FluidFlow fluidFlow;
    
    // Constructor
    public FlowRate2Test()
    {
        fluidFlow = FluidFlow.getInstance();
    }
    
    
    /*
     This method tests FlowRate2 class
    */
    @Test
    public void flowRate2Test()
    {
        // Values to be tested
        Double area = 13.5;
        Double velocity = 3.0; // seconds
        
        // Result need to be 
        String result = "40.5";
        
        // Testing
        assertEquals(result, fluidFlow.flowRate2(area, velocity));
    }
    
    
}