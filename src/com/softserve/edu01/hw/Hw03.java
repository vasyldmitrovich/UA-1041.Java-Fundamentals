package com.softserve.edu01.hw;

import java.util.Scanner;

public class Hw03 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter cost per minute ");
        System.out.print("first call = ");
        int c1 = scanner.nextInt();
        System.out.print("second call = ");
        int c2 = scanner.nextInt();
        System.out.print("third call = ");
        int c3 = scanner.nextInt();
        System.out.println("Enter call duration ");
        System.out.print("first call = ");
        int t1 = scanner.nextInt();
        System.out.print("second call = ");
        int t2 = scanner.nextInt();
        System.out.print("third call = ");
        int t3 = scanner.nextInt();
        System.out.println("Cost first call = " + (c1*t1));
        System.out.println("Cost second call = " + (c2*t2));
        System.out.println("Cost third call = " + (c3*t3));
        System.out.println("Total coast phone calls = " + ((c1*t1) + (c2*t2) + (c3*t3)));
    }
}
