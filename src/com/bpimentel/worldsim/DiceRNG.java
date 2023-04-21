package com.bpimentel.worldsim;

import java.util.Random;

public class DiceRNG {
    public Random generator = new Random();


    // generic. input is a generic type and return is of that generic type.
    /**
     * Gives back a random element of a given array
     * @param <T>
     * @param array
     * @return
     */
    public <T> T pickRandom(T[] array) {
        int rnd = generator.nextInt(array.length);

        return array[rnd];
    }
}
