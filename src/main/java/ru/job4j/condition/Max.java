package ru.job4j.condition;

/**
 *  4.2. Тернарное сравнение [#189]
 */
public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}