package ru.job4j.condition;

/**
 *         К теме 4.1.1. Операторы сравнения в String. [#237406]
 */
public class Game {
    public static void menu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - super mario");
        }
        if ("tanks".equals(name)) {
            System.out.println("Start - tanks");
        }
        if ("tetris".equals(name)) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
        Game.menu("tetris");
        Game.menu("tanks");
    }
}
