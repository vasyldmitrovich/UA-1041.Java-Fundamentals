package com.softserve.edu03.hw;

import java.util.Scanner;

public class SmallestNum {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 =getNum("Input the first number: ");
        int num2 =getNum("Input the second number: ");
        int num3 =getNum("Input the third number: ");
        int smallest = findSmallest(num1,num2,num3);
        System.out.println("The smallset number is: "+smallest);
    }
    static int getNum(String prompt){

        int num = 0 ;

        //please delete not needed lines

        do {
            System.out.println(prompt);
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next();
            }

            num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        }while (num<=0);

        return num;
    }
    static int findSmallest(int...nums){
        int smallsest=nums[0];
        for (int num:nums
             ) {
            if(num<smallsest){
                smallsest=num;
            }
        }
        return smallsest;
    }
}
