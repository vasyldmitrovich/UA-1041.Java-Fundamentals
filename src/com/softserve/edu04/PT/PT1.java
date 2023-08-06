package com.softserve.edu04.PT;

import java.util.Scanner;

public class PT1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of digits you want to check: ");
        int oddCount = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.printf("Please enter %d numbers %n", n);
        for (int i = 0; i < n; i++) {

            int current = sc.nextInt();
            if (current % 2 != 0) {
                oddCount += 1;
            }

        }
        System.out.println("The number of odd digits: " + oddCount);
    }
}
