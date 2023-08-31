package com.softserve.edu05.pt;

import static com.softserve.edu05.pt.App.SCANNER;

public class Task_2 {
    private static int count;

    public static void getArrayInt() {
        System.out.print("Input the number: ");
        int number = SCANNER.nextInt();
        SCANNER.nextLine();
        for (int i = number; i > 1; i--) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("Is a prime number");
        } else {
            System.out.println("Is not a prime number");
        }

    }
}