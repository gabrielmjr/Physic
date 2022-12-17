package com.gabrielMJr.physic.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> Speed2.class
*/
public class Speed2Test
{
    // MRU object
    private MUV muv;
    
    // Constructor
    public Speed2Test()
    {
        // Initialize the variable
        muv = new MUV();
    }
    
    
    /*
     This method tests Acceleration3 class
    */
    @Test
    public void speed2Test()
    {
        // The value to be tested:
        Double initialTime = 4.0;
        Double finalTime = 8.0;
        Double acceleration = 9.0;
        
        // The result need to ne:
        String result = "36.0";
        
        // Testing
        assertEquals(result, muv.speed2(initialTime, finalTime, acceleration, GET_RESULT));
    }
}