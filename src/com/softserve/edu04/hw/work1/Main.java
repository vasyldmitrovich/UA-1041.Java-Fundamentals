package com.softserve.edu04.hw.work1;
import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Input first float number: ");
        float num1 = SCANNER.nextFloat();
        System.out.println("Input second float number: ");
        float num2 = SCANNER.nextFloat();
        System.out.println("Input third float number: ");
        float num3 = SCANNER.nextFloat();

        //Move this if to some method and call this method there
        if (num1 >= -5 && num1 <= 5 && num2 >= -5 && num2 <= 5 && num3 >= -5 && num3 <= 5) {
            System.out.println("All numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers are belong to the range");
        }
    }
}
