package com.gabrielMJr.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> Speed4.class
*/
public class Speed4Test
{
    // MRU object
    private MUV muv;
    
    // Constructor
    public Speed4Test()
    {
        // Initialize the variable
        muv = new MUV();
    }
    
    
    /*
     This method tests Speed4 class
    */
    @Test
    public void speed4Test()
    {
        // The value to be tested:
        Double deltaTime = 8.0;
        Double acceleration = 3.0;
        Double initialSpeed = 10.0;
        
        // The result need to ne:
        String result = "34.0";
        
        // Testing
        assertEquals(result, muv.speed4(initialSpeed, deltaTime, acceleration, GET_RESULT));
    }
}