package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

/*
 This class tests fluidflow>>ray methods
*/
public class RayTest
{
    // Attributes
    private FluidFlow fluidFlow;
    
    // Constructor
    public RayTest()
    {
        fluidFlow = FluidFlow.getInstance();
    }
    
    
    /*
     This method tests Ray class
    */
    @Test
    public void rayTest()
    {
        // Values to be tested
        Double flowRate = 8.4;
        Double velocity = 7.0;
        
        // Result need to be 
        String result = "0.6181954424739327";
        
        // Testing
        assertEquals(result, fluidFlow.ray(flowRate, velocity, GET_RESULT));
    }
    
    
}