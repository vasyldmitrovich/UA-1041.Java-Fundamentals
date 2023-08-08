package com.softserve.edu04.HW;

import java.util.Scanner;



public class HW1 {
    static final Scanner SCANNER = new Scanner(System.in);

    static public void main(String[] args) {

        System.out.println("Enter the number of digits to compare: ");

        int n = SCANNER.nextInt();


        System.out.printf("Please enter %d numbers %n", n);
        for (int i = 1; i < n + 1; i++) {

            float current = SCANNER.nextFloat();
            if (current > -5 && current < 5) {
                System.out.println( i + " number in range -5, 5");
            }else {
                System.out.println(i + " number not in range -5, 5");
            }
        }
    }


}


