package com.gabrielMJr.twaire.physic.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> Acceleration2.class
*/
public class Acceleration2Test
{
    // MRU object
    private MUV muv;
    
    // Constructor
    public Acceleration2Test()
    {
        // Initialize the variable
        muv = new MUV();
    }
    
    
    /*
     This method tests Acceleration2 class
    */
    @Test
    public void acceleration2Test()
    {
        // The value to be tested:
        Double deltaSpeed = 9.0;
        Double initialTime = 3.0;
        Double finalTime = 6.0;
        
        // The result need to ne:
        String result = "3.0";
        
        // Testing
        assertEquals(result, muv.acceleration2(deltaSpeed, initialTime, finalTime, GET_RESULT));
    }
}