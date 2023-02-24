package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = SqArea.height(p, k);
        double s = k * h * h;
        return s;
    }

    public static double height(double p, double k) {
        double height = p / (2 * (k + 1));
        System.out.println("height = " + height);
        return height;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println();
        System.out.println("SqArea.square(6,2) = " + SqArea.square(6, 2));
    }
}