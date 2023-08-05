package com.softserve.edu01.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.print("Enter c1 = ");
        int c1 = Scanner.nextInt();

        System.out.print("Enter c2 = ");
        int c2 = Scanner.nextInt();

        System.out.print("Enter c3 = ");
        int c3 = Scanner.nextInt();

        System.out.print("Enter t1 = ");
        int t1 = Scanner.nextInt();

        System.out.print("Enter t2 = ");
        int t2 = Scanner.nextInt();

        System.out.print("Enter t3 = ");
        int t3 = Scanner.nextInt();

        System.out.println("c1 * t1 = " + (c1 * t1));
        System.out.println("c2 * t2 = " + (c2 * t2));
        System.out.println("c3 * t3 = " + (c3 * t3));

    }
}