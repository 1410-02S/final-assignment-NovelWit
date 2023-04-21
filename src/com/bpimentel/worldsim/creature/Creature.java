package com.bpimentel.worldsim.creature;

public class Creature {
    private String creatureType = "default";

    private String name = "defaultCreature";

    private int age = 0;

    // male would be true, female would be false
    private boolean genderMale = true;

    // Array is as follows:
    // { Strength, Intelligence, Tenacity, Charisma, 'Special'}
    // Stregnth, Intelligence, Tenacity, and Charisma are all from 1 to 10
    // 'Special' is on a range from -1 to 1, with -1 being not able to pass to child, 0
    // to be heterozygous, and 1 to be homozygous. 'Special' is recessive.
    private int[] geneticAttributes = {0, 0, 0, 0, -1};

    String[] memories;

    String[] thoughts;

    int happy = 100;

    int boredom = 25;

    int hostile = 0;

    int hungerPoints = 10;

    int maxHealth = 5;

    int currentHealth = 5;

    int defenseClass = 0;

    int toHit = 1;

    Creature[] friends;

    Creature[] enemies;

    int[] enneagram = {1, 4, 7};

    String home = "Default Place";

    String[] travels;

    String icon = "";

    // constructor
    public Creature(String test) {
        //TODO
    }


    public void interact() {
        //TODO
        // Reimplenet arrays as arraylists for easier modification
        // Implenent thoughts as a sort of queue where thoughts are moved up and replaced, with
            // the moving thought to have a chance to be stored in memories
    }


    public Creature creatureReproduce(Creature male, Creature female) {
        //TODO
        // Takes in two different creatures, ensures biological reproduction is possible,
        // then makes a new creature of the same creature type as the corresponding
        // male and female parents; no mixing of 'creature' types.

        Creature newborn = new Creature(creatureType);

        return newborn;
    }

    public void cleanUp() {
        //TODO
    }

}
