package com.softserve.edu12.hw.task1;

public class App {
    public static void main(String[] args) {
        while (true) {
            try {
                double firstNumber = Methods.getNumber("Input the first number: ");
                double secondNumber = Methods.getNumber("Input the second number: ");
                double result = Methods.div(firstNumber, secondNumber);
                System.out.println("The result of division is " + result);
                break;
            } catch (NumberFormatException e) {
                System.out.println("You must input a number!");
            }
        }
    }
}
