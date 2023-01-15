package com.gabrielMJr.physic.hydrodynamics.fluidflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.physic.Physic.GET_RESULT;

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
        Double speed = 7.0;
        
        // Result need to be 
        String result = "0.6181954424739327";
        
        // Testing
        assertEquals(result, fluidFlow.ray(flowRate, speed, GET_RESULT));
    }
    
    
}