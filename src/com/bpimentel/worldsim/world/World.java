package com.bpimentel.worldsim.world;

public class World {
    private int terrainDifficulty = 0;

    private String biome = "defaultBiome";

    private boolean waterSource = true;

    private int worldYear = 0;

    private int worldMonths = 0; // 10 months in a year

    private int worldDays = 0; // 100 months in a year

    private boolean isDaytime = true;

    public int getTerrainDC() {

        return terrainDifficulty;
    }


}
