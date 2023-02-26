package ru.job4j.workout;

public class PrimitiveTypes {
    public static void main(String[] args) {

        double bacteriasCFUPerGram = 3;
        double spaceDistanceKm = 10_000_000_000_000L;

        System.out.println("bacteriasCFUPerGram = " + bacteriasCFUPerGram);
        System.out.println("spaceDistanceKm = " + spaceDistanceKm);

        bacteriasCFUPerGram = 1E+7;
        spaceDistanceKm = 9.46E12;

        System.out.println("bacteriasCFUPerGram = " + bacteriasCFUPerGram);
        System.out.println("spaceDistanceKm = " + spaceDistanceKm);
    }
}
