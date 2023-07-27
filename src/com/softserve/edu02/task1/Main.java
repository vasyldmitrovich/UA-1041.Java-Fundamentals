package com.softserve.edu02.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Input site 1: ");
        double A = scanner.nextDouble();
        System.out.print("Input site 2: ");
        double B = scanner.nextDouble();
        System.out.print("Input site 3: ");
        double C = scanner.nextDouble();
        double P = ((A +B +C)/2);
        double Sqr = Math.sqrt(P* (P-A)*(P-B)*(P-C));
        System.out.printf("%.2f", Sqr);


    }


    
}
