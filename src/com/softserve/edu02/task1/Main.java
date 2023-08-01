package com.softserve.edu02.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Input site 1: ");
        double a = scanner.nextDouble();

        System.out.print("Input site 2: ");
        double b = scanner.nextDouble();

        System.out.print("Input site 3: ");
        double c = scanner.nextDouble();

        double P = ((a +b +c)/2);
        double Sqr = Math.sqrt(P* (P-a)*(P-b)*(P-c));
        System.out.printf("%.2f", Sqr);


    }


    
}
