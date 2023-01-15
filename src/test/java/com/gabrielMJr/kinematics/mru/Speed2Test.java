package com.gabrielMJr.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> Speed2.class
*/
public class Speed2Test
{
    // MRU object
    private MRU mru;
    
    // Constructor
    public Speed2Test()
    {
        // Initialize the variable
        mru = MRU.getInstance();
    }
    
    
    /*
     This method tests Speed2 class
    */
    @Test
    public void speed2Test()
    {
        // The value to be tested:
        Double initialDisplacement = 2.5;
        Double finalDisplacement = 5.5;
        Double initialTime = 3.0;
        Double finalTime = 9.0;
        
        // The result need to ne:
        String result = "0.5";
        
        // Testing
        assertEquals(result, mru.speed2(initialDisplacement, finalDisplacement, initialTime, finalTime, GET_RESULT));
    }
}