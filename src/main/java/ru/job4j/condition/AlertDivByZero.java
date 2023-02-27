package ru.job4j.condition;

/**
 *  4.1. Операторы ветвлений [#3611 #395668]
 */
public class AlertDivByZero {
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("Note this is a negative number.");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(4);
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(-3);
    }
}