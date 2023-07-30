package com.softserve.edu01.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.print("Enter r = ");
        int r = Scanner.nextInt();
        Double pi = Math.PI;
        System.out.println("pi * (r*r) = " + pi * (r*r));
        System.out.println("2 * pi * r = " + 2 * pi * r);
    }
}