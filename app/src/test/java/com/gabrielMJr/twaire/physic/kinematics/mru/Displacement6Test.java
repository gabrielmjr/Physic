package com.gabrielMJr.twaire.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> displacement6.class
*/
public class Displacement6Test
{
    // MRU object
    private MRU mru;
    
    // Constructor
    public Displacement6Test()
    {
        // Initialize the variable
        mru = MRU.getInstance();
    }
    
    
    /*
     This method tests Displacement6 class
    */
    @Test
    public void displacement6Test()
    {
        // The value to be tested:
        Double initialDisplacement = 3.5;
        Double speed = 5.5;
        Double deltaTime = 9.0;
        
        // The result need to ne:
        String result = "53.0";
        
        // Testing
        assertEquals(result, mru.displacement6(initialDisplacement, speed, deltaTime, GET_RESULT));
    }
}