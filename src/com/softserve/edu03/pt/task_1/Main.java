package com.softserve.edu03.pt.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int a=getNumber("input first  number:");
        int b=getNumber("input second  number:");
        int total=getTotal(a,b);
        double average=getAverage(a,b);
        System.out.format("The sum of %d and %d is %d\n",a,b,total);
        System.out.format("The average of %d and %d is %.1f",a,b,average);
    }

    public static int getTotal(int a, int b) {
        return a + b;
    }

    public static double getAverage(int a, int b) {
        return (a + b) * 0.5;
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
}
