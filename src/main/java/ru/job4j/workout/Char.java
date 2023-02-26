package ru.job4j.workout;

public class Char {
    public static void main(String[] args) {

        char c1 = '\u0035';
        char c2 = '\u004D';
        char c3 = '\u006E';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println();

        System.out.println("\u0031\u0032\u0033");

        System.out.println();

        char a = 'A';
        char b = 'B';
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + a + b);
        System.out.println("(a + b) = " + (a + b));

        System.out.println();

        a = 'A';
        System.out.println("++a = " + ++a);
        char d = 'D';
        System.out.println("--d = " + --d);

        System.out.println();
    }
}
