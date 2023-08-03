package com.softserve.edu04.pt.task1;

import java.util.Scanner;

public class Task1 {


    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int countOdd = 0;

        int num1 = getNum("Enter your first number: ");


        if (isOdd(num1)) countOdd++;

        int num2 = getNum("Enter your second number: ");

        if (isOdd(num2)) countOdd++;

        int num3 = getNum("Enter your third number: ");

        if (isOdd(num3)) countOdd++;


        System.out.println(countOdd + " numbers are odds");
    }

    private static int getNum(String message) {
        System.out.print(message);
        int num = SCANNER.nextInt();
        SCANNER.nextLine();

        return num;
    }

    private static boolean isOdd(int num) {
        return (num % 2) == 1;
    }
}
