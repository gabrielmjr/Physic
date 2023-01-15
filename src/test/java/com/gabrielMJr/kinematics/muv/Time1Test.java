package com.gabrielMJr.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests the mru >> Time1.class
*/
public class Time1Test
{
    // MRU object
    private MUV muv;
    
    // Constructor
    public Time1Test()
    {
        // Initialize the variable
        muv = MUV.getInstance();
    }
    
    
    /*
     This method tests Time1 class
    */
    @Test
    public void time1Test()
    {
        // The value to be tested:
        Double deltaSpeed = 3.0;
        Double acceleration = 8.0;
        
        // The result need to ne:
        String result = "0.375";
        
        // Testing
        assertEquals(result, muv.time1(deltaSpeed, acceleration));
    }
}