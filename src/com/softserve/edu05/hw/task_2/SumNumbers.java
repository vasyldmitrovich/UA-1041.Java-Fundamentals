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
            reaped = doReaped();
        }
        while (reaped);

    }

    private static boolean doReaped() {
        Scanner sc = new Scanner(System.in);

        System.out.println("do you want to perform the operation again?(yes/no)");
        String answer = sc.nextLine();
        return answer.equalsIgnoreCase("yes");
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

}
