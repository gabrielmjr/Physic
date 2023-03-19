package com.gabrielMJr.twaire.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Displacement4Test
{
    private MRU mru;
    
    public Displacement4Test()
    {
        mru = MRU.getInstance();
    }
    
    @Test
    public void displacement4Test()
    {
        Double deltaDisplacement = 3.5;
        Double finalDisplacement = 5.5;
        String result = "2.0";
        assertEquals(result, mru.displacement4(deltaDisplacement, finalDisplacement));
    }
}
