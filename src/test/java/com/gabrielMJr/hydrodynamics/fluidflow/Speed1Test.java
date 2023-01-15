package com.gabrielMJr.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests fluidflow>>speed1 methods
*/
public class Speed1Test
{
    // Attributes
    private FluidFlow fluidFlow;
    
    // Constructor
    public Speed1Test()
    {
        fluidFlow = FluidFlow.getInstance();
    }
    
    
    /*
     This method tests Speed1 class
    */
    @Test
    public void speed1Test()
    {
        // Values to be tested
        Double flowRate = 8.8;
        Double area = 4.0;
        
        // Result need to be 
        String result = "2.2";
        
        // Testing
        assertEquals(result, fluidFlow.speed1(flowRate, area));
    }
    
    
}