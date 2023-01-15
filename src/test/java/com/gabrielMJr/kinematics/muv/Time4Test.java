package com.gabrielMJr.physic.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> Time4.class
*/
public class Time4Test
{
    // MRU object
    private MUV muv;
    
    // Constructor
    public Time4Test()
    {
        // Initialize the variable
        muv = new MUV();
    }
    
    
    /*
     This method tests Time4 class
    */
    @Test
    public void time4Test()
    {
        // The value to be tested:
        Double initialTime = 8.4;
        Double deltaSpeed = 3.0;
        Double acceleration = 5.0;
        
        // The result need to ne:
        String result = "9.0";
        
        // Testing
        assertEquals(result, muv.time4(initialTime, deltaSpeed, acceleration, GET_RESULT));
    }
}