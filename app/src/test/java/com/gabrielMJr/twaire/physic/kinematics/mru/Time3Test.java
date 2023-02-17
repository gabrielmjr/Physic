package com.gabrielMJr.twaire.physic.kinematics.mru;

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
        mru = MRU.getInstance();
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
        Double velocity = 8.0;
        
        // The result need to ne:
        String result = "0.25";
        
        // Testing
        assertEquals(result, mru.time3(initialDisplacement, finalDisplacement, velocity, GET_RESULT));
    }
}