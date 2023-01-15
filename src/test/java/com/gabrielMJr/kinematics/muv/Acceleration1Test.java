package com.gabrielMJr.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests the mru >> Acceleration1.class
*/
public class Acceleration1Test
{
    // MRU object
    private MUV muv;
    
    // Constructor
    public Acceleration1Test()
    {
        // Initialize the variable
        muv = MUV.getInstance();
    }
    
    
    /*
     This method tests Acceleration1 class
    */
    @Test
    public void acceleration1Test()
    {
        // The value to be tested:
        Double deltaSpeed = 9.0;
        Double deltaTime = 3.2;
        
        // The result need to ne:
        String result = "2.8125";
        
        // Testing
        assertEquals(result, muv.acceleration1(deltaSpeed, deltaTime));
    }
}