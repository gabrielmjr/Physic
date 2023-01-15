package com.gabrielMJr.physic.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests fluidflow>>time methods
*/
public class TimeTest
{
    // Attributes
    private FluidFlow fluidFlow;
    
    // Constructor
    public TimeTest()
    {
        fluidFlow = FluidFlow.getInstance();
    }
    
    
    /*
     This method tests Time class
    */
    @Test
    public void timeTest()
    {
        // Values to be tested
        Double volume = 9.0;
        Double flowRate = 4.0;
        
        // Result need to be 
        String result = "2.25";
        
        // Testing
        assertEquals(result, fluidFlow.time(volume, flowRate));
    }
    
    
}