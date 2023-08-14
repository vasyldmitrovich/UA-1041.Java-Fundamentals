package com.softserve.edu05.hw.task_2;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        boolean reaped;
        do {

            int first = getNumber("enter first number:");
            int second = getNumber("enter second number:");
            System.out.println("The sum of numbers:" + (first + second));
            System.out.println("----------------------------");
            String answer = getAnswer("do you want to perform the operation again?(yes/no)");
            reaped = doReaped(answer);
        }
        while (reaped);

    }

    static boolean doReaped(String text) {
        return text.equalsIgnoreCase("yes");
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static String getAnswer(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextLine();
    }//Good

}
