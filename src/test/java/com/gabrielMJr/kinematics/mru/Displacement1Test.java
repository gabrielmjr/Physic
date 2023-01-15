package com.gabrielMJr.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests the mru >> displacement1.class
*/
public class Displacement1Test
{
    // MRU object
    private MRU mru;
    
    // Constructor
    public Displacement1Test()
    {
        // Initialize the variable
        mru = MRU.getInstance();
    }
    
    
    /*
     This method tests Displaceent1 class
    */
    @Test
    public void displacement1Test()
    {
        // The value to be tested:
        Double initialDisplacement = 3.2;
        Double finalDisplacement = 6.2;
        
        // The result need to ne:
        String result = "3.0";
        
        // Testing
        assertEquals(result, mru.displacement1(initialDisplacement, finalDisplacement));
    }
}