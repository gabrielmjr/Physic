package com.mjr.code.physics.physics;

import java.util.Random;

public class NumberRandomizer {
    public static Random random = new Random();
    public static double getRandomDouble() {
        return random.nextDouble();
    }
    
    public static double getRandomDouble(int scale) {
        return random.nextDouble() * scale;
    }
}
