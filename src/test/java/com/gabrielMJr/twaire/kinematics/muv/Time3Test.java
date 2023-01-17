package com.gabrielMJr.twaire.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> Time3.class
*/
public class Time3Test
{
    // MRU object
    private MUV muv;
    
    // Constructor
    public Time3Test()
    {
        // Initialize the variable
        muv = MUV.getInstance();
    }
    
    
    /*
     This method tests Time3 class
    */
    @Test
    public void time3Test()
    {
        // The value to be tested:
        Double finalTime = 9.0;
        Double deltaSpeed = 3.0;
        Double acceleration = 5.0;
        
        // The result need to ne:
        String result = "8.4";
        
        // Testing
        assertEquals(result, muv.time3(finalTime, deltaSpeed, acceleration, GET_RESULT));
    }
}