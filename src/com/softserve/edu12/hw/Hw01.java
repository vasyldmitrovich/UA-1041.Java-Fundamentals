package com.softserve.edu12.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hw01 {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner SC = new Scanner(System.in);
                System.out.println("Enter 'a': ");
                double a = SC.nextInt();

                System.out.println("Enter 'b': ");
                double b = SC.nextInt();
                System.out.println(" a / b = " + div(a, b));
                break;
            } catch (InputMismatchException e) {
                System.out.println("'a' and 'b' should be a numbers");
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor should be not zero");
        }
        return a / b;
    }
}
