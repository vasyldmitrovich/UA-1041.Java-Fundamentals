package com.softserve.edu01.hw;

import java.util.Scanner;
public class NewClass1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int S1,S2,S3,T1,T2,T3;
        System.out.println("first call: ");
        S1=scanner.nextInt();
        System.out.println("cost per minute of first call: ");
        T1=scanner.nextInt();
        System.out.println("second call: ");
        S2=scanner.nextInt();
        System.out.println("cost per minute of second call: ");
        T2=scanner.nextInt();
        System.out.println("third call: ");
        S3=scanner.nextInt();
        System.out.println("cost per minute of third call: ");
        T3=scanner.nextInt();
        System.out.println("cost of first call: "+(S1*T1));
        System.out.println("cost of second call: "+(S2*T2));
        System.out.println("cost of third call: "+(S3*T3));
    }
}
