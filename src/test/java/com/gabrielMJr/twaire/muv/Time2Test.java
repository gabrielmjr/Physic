package com.gabrielMJr.twaire.physic.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> Time2.class
*/
public class Time2Test
{
    // MRU object
    private MUV muv;
    
    // Constructor
    public Time2Test()
    {
        // Initialize the variable
        muv = new MUV();
    }
    
    
    /*
     This method tests Time2 class
    */
    @Test
    public void time2Test()
    {
        // The value to be tested:
        Double initialSpeed = 3.0;
        Double finalSpeed = 9.0;
        Double acceleration = 8.0;
        
        // The result need to ne:
        String result = "0.75";
        
        // Testing
        assertEquals(result, muv.time2(initialSpeed, finalSpeed, acceleration, GET_RESULT));
    }
}