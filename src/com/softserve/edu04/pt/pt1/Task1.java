package com.softserve.edu04.pt.pt1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me three numbers: ");
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();
        int number_3 = scanner.nextInt();

        int oddCount = countOddNumbers(number_1, number_2, number_3);
        System.out.println("Number of odd numbers: " + oddCount);

        scanner.close();
    }

    public static int countOddNumbers(int... numbers) {
        int oddNumber = 0;
        for(int num : numbers ){
           if (num % 2 == 0) {
               oddNumber++;
           }
        }
        return oddNumber;
    }
}
