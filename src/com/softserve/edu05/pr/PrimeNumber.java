package com.softserve.edu05.pr;

import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the positive number:");
        double num = sc.nextInt();
        while (num <= 0) {
            System.out.println("enter the positive number:");
            num = sc.nextInt();
        }
        boolean track = true;

        if (num <= 1) {
            track = false;
        }
        else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    track = false;
                    break;
                }
            }
        }
        if (track){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
            }
        }
    }

