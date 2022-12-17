package com.gabrielMJr.physic.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests the mru >> time4.class
*/
public class Time4Test
{
    // MRU object
    private MRU mru;
    
    // Constructor
    public Time4Test()
    {
        // Initialize the variable
        mru = new MRU();
    }
    
    
    /*
     This method tests Time4 class
    */
    @Test
    public void time4Test()
    {
        // The value to be tested:
        Double deltaTime = 3.5;
        Double finalTime = 19.5;
        
        // The result need to ne:
        String result = "16.0";
        
        // Testing
        assertEquals(result, mru.time4(deltaTime, finalTime));
    }
}