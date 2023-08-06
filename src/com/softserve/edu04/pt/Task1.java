package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNumber = getNumber("Input first number: ");
        int secondNumber = getNumber("Input second number: ");
        int thirdNumber = getNumber("Input third number: ");

        System.out.format("The count of odd numbers is: %d", countOddNumbers(firstNumber,
                secondNumber, thirdNumber));

    }

    public static int countOddNumbers(int... numbers){
        int result = 0;
        for(int n : numbers){
            if(n % 2 == 1) result++;
        }
        return result;
    }


    public static int getNumber(String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }
}
