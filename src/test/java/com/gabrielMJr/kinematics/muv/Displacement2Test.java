package com.gabrielMJr.physic.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> Displacement2.class
*/
public class Displacement2Test
{
    // MRU object
    private MUV muv;
    
    // Constructor
    public Displacement2Test()
    {
        // Initialize the variable
        muv = new MUV();
    }
    
    
    /*
     This method tests Displacement2 class
    */
    @Test
    public void displacement2Test()
    {
        // The value to be tested:
        Double initialSpeed = 6.0;
        Double deltaTime = 2.0;
        Double acceleration = 3.0;
        Double displacement = 21.0;
        
        // The result need to ne:
        String result = "3.0";
        
        // Testing
        assertEquals(result, muv.displacement2(initialSpeed, deltaTime, acceleration, displacement, GET_RESULT));
    }
}