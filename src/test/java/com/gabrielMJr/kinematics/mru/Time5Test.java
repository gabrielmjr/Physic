package com.gabrielMJr.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests the mru >> time5.class
*/
public class Time5Test
{
    // MRU object
    private MRU mru;
    
    // Constructor
    public Time5Test()
    {
        // Initialize the variable
        mru = new MRU();
    }
    
    
    /*
     This method tests Time5 class
    */
    @Test
    public void time5Test()
    {
        // The value to be tested:
        Double initialTime = 3.5;
        Double deltaTime = 5.5;
        
        // The result need to ne:
        String result = "9.0";
        
        // Testing
        assertEquals(result, mru.time5(initialTime, deltaTime));
    }
}