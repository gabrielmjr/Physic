package com.gabrielMJr.twaire.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> Speed3.class
*/
public class Speed3Test
{
    // MRU object
    private MUV muv;
    
    // Constructor
    public Speed3Test()
    {
        // Initialize the variable
        muv = MUV.getInstance();
    }
    
    
    /*
     This method tests Speed3 class
    */
    @Test
    public void speed3Test()
    {
        // The value to be tested:
        Double finalVelocity = 36.0;
        Double deltaTime = 3.0;
        Double acceleration = 9.0;
        
        // The result need to ne:
        String result = "9.0";
        
        // Testing
        assertEquals(result, muv.speed3(finalVelocity, deltaTime, acceleration, GET_RESULT));
    }
}