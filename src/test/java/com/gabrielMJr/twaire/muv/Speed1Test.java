package com.gabrielMJr.twaire.physic.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests the mru >> Speed1.class
*/
public class Speed1Test
{
    // MRU object
    private MUV muv;
    
    // Constructor
    public Speed1Test()
    {
        // Initialize the variable
        muv = new MUV();
    }
    
    
    /*
     This method tests Speed1 class
    */
    @Test
    public void speed1Test()
    {
        // The value to be tested:
        Double deltaTime = 3.0;
        Double acceleration = 9.0;
        
        // The result need to ne:
        String result = "27.0";
        
        // Testing
        assertEquals(result, muv.speed1(deltaTime, acceleration));
    }
}