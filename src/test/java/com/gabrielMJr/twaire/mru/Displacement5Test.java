package com.gabrielMJr.twaire.physic.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 This class tests the mru >> displacement5.class
*/
public class Displacement5Test
{
    // MRU object
    private MRU mru;
    
    // Constructor
    public Displacement5Test()
    {
        // Initialize the variable
        mru = new MRU();
    }
    
    
    /*
     This method tests Displacement5 class
    */
    @Test
    public void displacement5Test()
    {
        // The value to be tested:
        Double initialDisplacement = 3.5;
        Double deltaDisplacement = 5.5;
        
        // The result need to ne:
        String result = "9.0";
        
        // Testing
        assertEquals(result, mru.displacement5(initialDisplacement, deltaDisplacement));
    }
}