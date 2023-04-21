package com.bpimentel.worldsim.utility;

public class DataStore {
    public String[] namesNPC = {};

    public String[] namesBeasts = {};

    public String[] namesTribes = {};

    String[] tribeServices = {
                "food", 
                "water", 
                "hay", 
                "crafts"
    };

    int[][] enneagramCombos = {
        {1, 4, 7},
        {1, 7, 4},
        {2, 4, 8},
        {1, 4, 7},
        {1, 4, 7},
        {1, 4, 7},
        {1, 4, 7},
        {1, 4, 7},
        {1, 4, 7},
        {1, 4, 7},
        {1, 4, 7},
        {1, 4, 7},
        {1, 4, 7},
        {1, 4, 7},
        {1, 4, 7},
        {1, 4, 7},
    };

    int[][] ennegramCompat = {

    };

    int[][] ennegramNonCompat = {
        {7},
        {},
        {},
        {8},
        {9},
        {},
        {},
        {4},
        {5}
    };

    public DataStore() {

    }
}
