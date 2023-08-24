package com.softserve.edu03.hw;

import java.util.Scanner;
import java.lang.Math;

public class Task1 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Input side a:");
        double a = scanner.nextDouble();

        System.out.println("Input side b:");
        double b = scanner.nextDouble();

        System.out.println("Input side c:");
        double c = scanner.nextDouble();

        double SemiPerimetr = (a+b+c)/2;
        System.out.println("Semiperimetr:"+SemiPerimetr);

        double A = (SemiPerimetr*(SemiPerimetr-a)*(SemiPerimetr-b)*(SemiPerimetr-c));
        System.out.println("Area:" + Math.sqrt(A));
    }

}

