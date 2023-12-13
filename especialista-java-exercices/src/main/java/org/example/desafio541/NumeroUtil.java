package org.example.desafio541;

public class NumeroUtil {

    public static int whoIsBigger(int number1, int number2) {
        return Math.max(number1, number2);
    }

    public static int whoIsBigger(int number1, int number2, int number3) {
        var biggerNumber = Math.max(number1, number2);
        return Math.max(biggerNumber, number3);
    }

    public static double whoIsBigger(double number1, double number2) {
        return Math.max(number1, number2);
    }

    public static double whoIsBigger(double number1, double number2, double number3) {
        var biggerNumber = Math.max(number1, number2);
        return Math.max(biggerNumber, number3);
    }
}
