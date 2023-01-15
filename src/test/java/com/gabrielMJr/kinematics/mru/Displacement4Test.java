package com.gabrielMJr.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests the mru >> displacement4.class
*/
public class Displacement4Test
{
    // MRU object
    private MRU mru;
    
    // Constructor
    public Displacement4Test()
    {
        // Initialize the variable
        mru = new MRU();
    }
    
    
    /*
     This method tests Displacement4 class
    */
    @Test
    public void displacement4Test()
    {
        // The value to be tested:
        Double deltaDisplacement = 3.5;
        Double finalDisplacement = 5.5;
        
        // The result need to ne:
        String result = "2.0";
        
        // Testing
        assertEquals(result, mru.displacement4(deltaDisplacement, finalDisplacement));
    }
}