package com.gabrielMJr.physic.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.physic.Physic.GET_RESULT;

/*
 This class tests fluidflow>>speed2 methods
*/
public class Speed2Test
{
    // Attributes
    private FluidFlow fluidFlow;
    
    // Constructor
    public Speed2Test()
    {
        fluidFlow = new FluidFlow();
    }
    
    
    /*
     This method tests Speed2 class
    */
    @Test
    public void speed2Test()
    {
        // Values to be tested
        Double flowRate = 8.4;
        Double ray = 4.6;
        
        // Result need to be 
        String result = "0.1264252946913417";
        
        // Testing
        assertEquals(result, fluidFlow.speed2(flowRate, ray, GET_RESULT));
    }
    
    
}