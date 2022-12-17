package com.gabrielMJr.physic.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests the mru >> speed1.class
*/
public class Speed1Test
{
    // MRU object
    private MRU mru;
    
    // Constructor
    public Speed1Test()
    {
        // Initialize the variable
        mru = new MRU();
    }
    
    
    /*
     This method tests Speed1 class
    */
    @Test
    public void speed1Test()
    {
        // The value to be tested:
        Double deltaDisplacement = 8.0;
        Double deltaTime = 5.0;
        
        // The result need to ne:
        String result = "1.6";
        
        // Testing
        assertEquals(result, mru.speed1(deltaDisplacement, deltaTime));
    }
}