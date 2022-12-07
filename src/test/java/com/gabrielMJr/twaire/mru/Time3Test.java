package com.gabrielMJr.twaire.physic.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> time3.class
*/
public class Time3Test
{
    // MRU object
    private MRU mru;
    
    // Constructor
    public Time3Test()
    {
        // Initialize the variable
        mru = new MRU();
    }
    
    
    /*
     This method tests Time3 class
    */
    @Test
    public void time3Test()
    {
        // The value to be tested:
        Double initialDisplacement = 3.5;
        Double finalDisplacement = 5.5;
        Double speed = 8.0;
        
        // The result need to ne:
        String result = "0.25";
        
        // Testing
        assertEquals(result, mru.time3(initialDisplacement, finalDisplacement, speed, GET_RESULT));
    }
}