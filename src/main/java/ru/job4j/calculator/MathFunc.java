package ru.job4j.calculator;

public class MathFunc {
    public static void main(String[] args) {
        int result3 = func1(100);
        System.out.println(result3);
    }

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }
}
