package com.gabrielMJr.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.gabrielMJr.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> Acceleration4.class
*/
public class Acceleration4Test
{
    // MRU object
    private MUV muv;
    
    // Constructor
    public Acceleration4Test()
    {
        // Initialize the variable
        muv = MUV.getInstance();
    }
    
    
    /*
     This method tests Acceleration4 class
    */
    @Test
    public void acceleration4Test()
    {
        // The value to be tested:
        Double initialSpeed = 3.0;
        Double finalSpeed = 9.0;
        Double initialTime = 8.0;
        Double finalTime = 18.0;
        
        // The result need to ne:
        String result = "0.6";
        
        // Testing
        assertEquals(result, muv.acceleration4(initialSpeed, finalSpeed, initialTime, finalTime, GET_RESULT));
    }
}