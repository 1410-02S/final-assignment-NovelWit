package com.bpimentel.worldsim.world;

import java.util.ArrayList;

import com.bpimentel.worldsim.DiceRNG;
import com.bpimentel.worldsim.creature.BeastCreature;
import com.bpimentel.worldsim.creature.Creature;
import com.bpimentel.worldsim.creature.NPCCreature;
import com.bpimentel.worldsim.utility.DataStore;

public class Tribe {
    private int estDate = 0;

    private String name = "default";

    private int wealthValue = 0;

    int startingNumber = 0;

    // (some datatype) residentType = "NPC"; // this is for deciding what kinds of inital creatures are to be made
    String creatureType = "NPC"; // temp fix

    ArrayList<Creature> residents;

    //String[] services;

    String[] neighbors;

    Creature[] popularCreatures;

    Creature[] unpopularCreatures;

    DiceRNG dice = new DiceRNG();

    DataStore dataStore = new DataStore();

    // constructor
    public Tribe(String inputTribeName, String residentCreatures, int iStartingNum) {
        name = inputTribeName;
        startingNumber = iStartingNum;
        creatureType = residentCreatures;
        //getServices();

        addRandomCreature(startingNumber, creatureType);
    }

    public Tribe(String inputTribeName) {
        name = inputTribeName;
        startingNumber = dice.generator.nextInt(100);

        creatureType = (dice.generator.nextFloat() < .5) ? "npc" : "beast";

        addRandomCreature(startingNumber, creatureType);
    }

    public Tribe() {
        // one line conditional. ? makes previous statement a conditional
        // (statement) ? (what happens if true) : (what happens if false)
        name = (dice.generator.nextFloat() < .5) ? dice.pickRandom(dataStore.namesTribes) + "'s" + dice.pickRandom(dataStore.namesTribes) : dice.pickRandom(dataStore.namesTribes) + "ton";
        startingNumber = dice.generator.nextInt(100);

        creatureType = (dice.generator.nextFloat() < .5) ? "npc" : "beast";

        addRandomCreature(startingNumber, creatureType);

    }


    /**
     * Increments age..?
     * @return
     */
    public int increaseAge() {

        return ++estDate;
    }


    public ArrayList<Creature> addRandomCreature(int iStartingNum, String creature) {

        ArrayList<Creature> temp = new ArrayList<Creature>();


        for (int index = 0; index < iStartingNum; index++) {

            switch (creature) {

                case "beast":

                    temp.add(new BeastCreature());

                case "npc":

                    temp.add(new NPCCreature());
            }
        }

        return temp;
    }


    /**
    public void getServices() {

    }*/

}
