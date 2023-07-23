package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first num");
        int num1 = sc.nextInt();
        System.out.println("Input second num");
        int num2 = sc.nextInt();
        System.out.println("Input third num");
        int num3 = sc.nextInt();

        double average = calcAverage(num1,num2,num3);
        System.out.println("Average = "+average);

    }
    public static double calcAverage(int... nums){
        double average;
        int sum=0;
        for (int num:nums
             ) {
            sum+= num;
        }
        average = sum/(double)nums.length;
        return average;
    }
}
