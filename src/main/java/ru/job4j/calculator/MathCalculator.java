package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double allTheOperations(double first, double second) {
        return sumAndMultiply(first, second)
                + subtractAndDivide(first, second);
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        System.out.println("Результат расчета \"sumAndMulitply\" равен: " + sumAndMultiply(a, b));
        System.out.println("Результат расчета \"subtractAndDivide\" равен: " + subtractAndDivide(a, b));
        System.out.println("Результат расчета \"allTheOperations\" равен: " + allTheOperations(a, b));
    }
}