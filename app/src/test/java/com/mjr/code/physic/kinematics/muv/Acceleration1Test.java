package com.mjr.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Acceleration1Test {
    private MUV muv;

    public Acceleration1Test () {
        muv = MUV.getInstance();
	}

    @Test
    public void acceleration1Test () {
        Double deltaSpeed = 9.0;
        Double deltaTime = 3.2;
        String result = "2.8125";
        assertEquals(result, muv.acceleration1(deltaSpeed, deltaTime));
    }
}