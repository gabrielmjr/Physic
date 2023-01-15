package com.gabrielMJr.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests the mru >> displacement2.class
*/
public class Displacement2Test
{
    // MRU object
    private MRU mru;
    
    // Constructor
    public Displacement2Test()
    {
        // Initialize the variable
        mru = MRU.getInstance();
    }
    
    
    /*
     This method tests Displaceent2 class
    */
    @Test
    public void displacement2Test()
    {
        // The value to be tested:
        Double deltaTime = 3.0;
        Double deltaSpeed = 4.0;
        
        // The result need to ne:
        String result = "12.0";
        
        // Testing
        assertEquals(result, mru.displacement2(deltaTime, deltaSpeed));
    }
}