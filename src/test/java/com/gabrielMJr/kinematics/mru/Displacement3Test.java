package com.gabrielMJr.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> displacement3.class
*/
public class Displacement3Test
{
    // MRU object
    private MRU mru;
    
    // Constructor
    public Displacement3Test()
    {
        // Initialize the variable
        mru = new MRU();
    }
    
    
    /*
     This method tests Displacement3 class
    */
    @Test
    public void displacement3Test()
    {
        // The value to be tested:
        Double initialTime = 3.5;
        Double finalTime = 5.5;
        Double mediaSpeed = 9.0;
        
        // The result need to ne:
        String result = "18.0";
        
        // Testing
        assertEquals(result, mru.displacement3(initialTime, finalTime, mediaSpeed, GET_RESULT));
    }
}