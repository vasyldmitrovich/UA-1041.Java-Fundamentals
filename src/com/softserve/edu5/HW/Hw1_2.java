package com.softserve.edu5.HW;

import java.util.Scanner;

public class Hw1_2 {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int[] intNum = new int[5];
        int count = 0;
        int minimalNumber = 0;
        int current = 0;
        int product = 1;

        for (int i = 0; i < intNum.length; i++) {
            System.out.println("Please enter number");
            intNum[i] = SCANNER.nextInt();
        }
        for (int i = 0; i < intNum.length; i++) {

            if(intNum[i] > 0) {
                count++;
            }
            if (count == 2) {
                System.out.println("Position of second positive number with index " + i + " in array." );
                break;
            }

        }
        for(int i = 0; i < intNum.length; i++){
            if (minimalNumber > intNum[i]){
                minimalNumber = intNum[i];
                count = i;
            }

        }
        System.out.println("Minimal number in array " + minimalNumber + " with index " + count + " in array");
        for (int i = 0; i < intNum.length; i++) {
            if (intNum[i] % 2 == 0 && intNum[i] != 0 ) {
                current = intNum[i];
                product = product * current;
            }
        }
        System.out.println("Product of all even numbers = " + product);
    }
}
