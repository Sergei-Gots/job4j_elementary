package ru.job4j.condition;

/**
 * 4.3.5. Множественное логическое выражение И [#9461]
 */
public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc
                && ab + bc > ac
                && ac + bc > ab;
    }
}