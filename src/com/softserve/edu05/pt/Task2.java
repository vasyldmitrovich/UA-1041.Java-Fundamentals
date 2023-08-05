package com.softserve.edu05.pt;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);//Write some method where will be scanner and message, and there call this method
        System.out.println("enter a number: ");
        int number=scaner.nextInt();
        int k=2;
        boolean n=true;
        for (int i = 2; i < number; i++) {
            if(number%i==0){
                System.out.println("is not prime number");
                n=false;
                break;
            }

        }
        if(n!=false){
            System.out.println("is a prime number");
        }
    }
}
