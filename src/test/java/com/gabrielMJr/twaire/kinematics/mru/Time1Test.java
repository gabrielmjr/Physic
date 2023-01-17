package com.gabrielMJr.twaire.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests the mru >> time1.class
*/
public class Time1Test
{
    // MRU object
    private MRU mru;
    
    // Constructor
    public Time1Test()
    {
        // Initialize the variable
        mru = MRU.getInstance();
    }
    
    
    /*
     This method tests Time1 class
    */
    @Test
    public void time1Test()
    {
        // The value to be tested:
        Double initialTime = 3.5;
        Double finalTime = 8.5;
       
        // The result need to ne:
        String result = "5.0";
        
        // Testing
        assertEquals(result, mru.time1(initialTime, finalTime));
    }
}