package com.gabrielmjr.physic.waves.electromagnetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Velocity1Test {
    private Electromagnetic electromagnetic;
    
    public Velocity1Test() {
        electromagnetic = Electromagnetic.getInstance();
    }
   
    @Test
    public void velocity1Test() {
        double length = 75E6;
        double frequency = 4;
        assertEquals(3E8, electromagnetic.velocity(length, frequency).getResult());
    }
}
