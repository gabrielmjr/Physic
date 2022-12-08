package com.gabrielMJr.twaire.physic.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> Acceleration3.class
*/
public class Acceleration3Test
{
    // MRU object
    private MUV muv;
    
    // Constructor
    public Acceleration3Test()
    {
        // Initialize the variable
        muv = new MUV();
    }
    
    
    /*
     This method tests Acceleration3 class
    */
    @Test
    public void acceleration3Test()
    {
        // The value to be tested:
        Double initialSpeed = 3.0;
        Double finalSpeed = 9.0;
        Double deltaTime = 8.0;
        
        // The result need to ne:
        String result = "0.75";
        
        // Testing
        assertEquals(result, muv.acceleration3(initialSpeed, finalSpeed, deltaTime, GET_RESULT));
    }
}