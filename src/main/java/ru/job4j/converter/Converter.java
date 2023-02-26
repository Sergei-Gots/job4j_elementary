package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70f;
    }

    public static float rubleToDollar(float value) {
        return value / 60f;
    }

    public static void main(String[] args) {
        float inEUR = 140;
        float inUSD = 180;
        float expectedEUR = 2;
        float expectedUSD = 3;
        float outEUR = Converter.rubleToEuro(inEUR);
        float outUSD = Converter.rubleToDollar(inUSD);
        boolean passedForEUR = expectedEUR == outEUR;
        boolean passedForUSD = expectedUSD == outUSD;

        System.out.println("140 RUB are 2 EUR. Test result : " + passedForEUR);
        System.out.println("180 RUB are 3 USD. Test result : " + passedForUSD);
    }
}