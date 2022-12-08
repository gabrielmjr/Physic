package com.gabrielMJr.twaire.physic.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests fluidflow>>flowrate1 methods
*/
public class FlowRate1Test
{
    // FluidFlow object
    private FluidFlow fluidFlow;
    
    // Constructor
    public FlowRate1Test()
    {
        fluidFlow = new FluidFlow();
    }
    
    
    /*
     This method tests FlowRate1 class
    */
    @Test
    public void flowRate1Test()
    {
        // Values to be tested
        Double volume = 13.5;
        Double time = 8.0; // seconds
        
        // Result need to be 
        String result = "1.6875";
        
        // Testing
        assertEquals(result, fluidFlow.flowRate1(volume, time));
    }
    
    
}