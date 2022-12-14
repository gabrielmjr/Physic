package com.gabrielMJr.physic.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> Displacement1.class
*/
public class Displacement1Test
{
    // MRU object
    private MUV muv;
    
    // Constructor
    public Displacement1Test()
    {
        // Initialize the variable
        muv = new MUV();
    }
    
    
    /*
     This method tests Displacement1 class
    */
    @Test
    public void displacement1Test()
    {
        // The value to be tested:
        Double initialDisplacement = 3.0;
        Double initialSpeed = 6.0;
        Double deltaTime = 2.0;
        Double acceleration= 3.0;
        
        // The result need to ne:
        String result = "21.0";
        
        // Testing
        assertEquals(result, muv.displacement1(initialDisplacement, initialSpeed, deltaTime, acceleration, GET_RESULT));
    }
}