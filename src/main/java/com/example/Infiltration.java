package com.example;

public class Infiltration {

    // Task 1
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    // Task 2
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    // Task 3
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    // Task 4
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean dogIsPresent) {
        return (dogIsPresent && !archerIsAwake) || (!dogIsPresent && !archerIsAwake && !knightIsAwake && prisonerIsAwake);
    }

    // Task 5
    public static boolean canRiskyAttack(boolean knightIsAwake, boolean archerIsAwake) {
        return !knightIsAwake && !archerIsAwake;
    }
}
