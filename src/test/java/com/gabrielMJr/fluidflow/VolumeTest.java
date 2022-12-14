package com.gabrielMJr.physic.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests fluidflow>>volume methods
*/
public class VolumeTest
{
    // Attributes
    private FluidFlow fluidFlow;
    
    // Constructor
    public VolumeTest()
    {
        fluidFlow = new FluidFlow();
    }
    
    
    /*
     This method tests Volume class
    */
    @Test
    public void volumeTest()
    {
        // Values to be tested
        Double time = 8.0;
        Double flowRate = 3.2;
        
        // Result need to be 
        String result = "25.6";
        
        // Testing
        assertEquals(result, fluidFlow.volume(time, flowRate));
    }
    
    
}