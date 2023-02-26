package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
       return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightOfMan = 187;
        double man = Fit.manWeight(heightOfMan);

        short heightOfWoman = 167;
        double woman = Fit.womanWeight(heightOfWoman);

        System.out.println("Man " + heightOfMan + " is " + man);
        System.out.println("Woman " + heightOfWoman + " is " + woman);
    }

}