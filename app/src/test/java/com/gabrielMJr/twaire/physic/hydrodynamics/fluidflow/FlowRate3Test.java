package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;
 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

/*
 This class tests fluidflow>>flowrate3 methods
*/
public class FlowRate3Test
{
    // Attributes
    private FluidFlow fluidFlow;
    
    // Constructor
    public FlowRate3Test()
    {
        fluidFlow = FluidFlow.getInstance();
    }
    
    
    /*
     This method tests FlowRate3 class
    */
    @Test
    public void flowRate3Test()
    {
        // Values to be tested
        Double ray = 8.4;
        Double velocity = 4.0;
        
        // Result need to be 
        String result = "886.2336";
        
        // Testing
        assertEquals(result, fluidFlow.flowRate3(ray, velocity, GET_RESULT));
    }
    
    
}