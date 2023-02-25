package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        return k * h * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1 (check: s = 1);  square = " + result1);
        System.out.println("SqArea.square(6,2) = " + SqArea.square(6, 2));
    }
}