package com.softserve.edu03.pt.Task1;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("US"));
    int num1 = getNumber("Enter the first number: ");
    int num2 = getNumber("Enter the second number: ");
    int sum = getTotal(num1,num2);
    double average = getAverage(num1,num2);
        System.out.format("The sum of %d and %d is %d \n",num1,num2,sum);
        System.out.format("The average of %d and %d is %.3f\n",num1,num2,average);
    }
    static int getTotal(int num1,int num2){
        return num1+num2;
    }
    static double getAverage(int... nums){

        int sum = 0;
        for (int num:nums
             ) {
            sum+=num;
        }
        double average = sum/(double)nums.length;

        return average;

    }
    static int getNumber(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
}
