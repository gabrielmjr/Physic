package com.mjr.twaire.code.physic.kinematics.muv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Speed1Test {
    private MUV muv;

    public Speed1Test () {
        muv = MUV.getInstance();
    }

    @Test
    public void speed1Test () {
        Double deltaTime = 3.0;
        Double acceleration = 9.0;
        String result = "27.0";
        assertEquals(result, muv.speed1(deltaTime, acceleration));
    }
}
