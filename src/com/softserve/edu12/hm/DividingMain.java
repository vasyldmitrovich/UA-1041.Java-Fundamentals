package com.softserve.edu12.hm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividingMain {
    public static void main(String[] args) throws IllegalAccessException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println(Dividing.div(sc.nextDouble(), sc.nextDouble()));
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input, please enter valid numbers");
        }
    }
}
