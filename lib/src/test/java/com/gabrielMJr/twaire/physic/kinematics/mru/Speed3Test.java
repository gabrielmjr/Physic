package com.gabrielMJr.twaire.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> Speed3.class
*/
public class Speed3Test
{
    // MRU object
    private MRU mru;
    
    // Constructor
    public Speed3Test()
    {
        // Initialize the variable
        mru = MRU.getInstance();
    }
    
    
    /*
     This method tests Speed3 class
    */
    @Test
    public void speed3Test()
    {
        // The value to be tested:
        double initialDisplacement = 2.5;
        double finalDisplacement = 5.5;
        double deltaTime = 6.0;
        
        // The result need to be:
        String result = "0.5";
        
        // Testing
        assertEquals(result, mru.speed3(initialDisplacement, finalDisplacement, deltaTime, GET_RESULT));
    }
}