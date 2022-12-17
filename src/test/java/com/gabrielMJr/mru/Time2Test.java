package com.gabrielMJr.physic.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests the mru >> time2.class
*/
public class Time2Test
{
    // MRU object
    private MRU mru;
    
    // Constructor
    public Time2Test()
    {
        // Initialize the variable
        mru = new MRU();
    }
    
    
    /*
     This method tests time2 class
    */
    @Test
    public void time2Test()
    {
        // The value to be tested:
        Double deltaDisplacement = 9.6;
        Double speed = 5.0;
        
        // The result need to ne:
        String result = "1.92";
        
        // Testing
        assertEquals(result, mru.time2(deltaDisplacement, speed));
    }
}