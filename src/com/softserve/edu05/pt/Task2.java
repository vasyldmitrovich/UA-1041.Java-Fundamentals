package com.softserve.edu05.pt;
import java.util.Scanner;

public class Task2 {
    private int number;
    Scanner scaner=new Scanner(System.in);
    private int input(){
        System.out.println("enter a number: ");
        number=scaner.nextInt();
        return number;
    }
    public static void main(String[] args) {
//Write some method where will be scanner and message, and there call this method
        int number=new Task2().input();
        boolean flag=true;
        for (int i = 2; i < number; i++) {
            if(number%i==0){
                System.out.println("is not prime number");
                flag=false;
                break;
            }

        }
        if(flag!=false){
            System.out.println("is a prime number");
        }
    }
}
