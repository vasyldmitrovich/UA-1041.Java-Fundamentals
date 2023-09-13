package edu04.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter 1 number");
        int a = scanner.nextInt();
        System.out.println("Enter 2 number");
        int b = scanner.nextInt();
        System.out.println("Enter 3 number");
        int c = scanner.nextInt();
        int smallest;
        int biggest;

        //find the smallest
        if(a<b) {
            if(c<a) {
                smallest = c;
            } else {
                smallest = a;
            }
        } else {
            if(b<c) {
                smallest = b;
            } else {
                smallest = c;
            }
        }
        //find the biggest
        if(a>b) {
            if(c>a) {
                biggest = c;
            } else {
                biggest = a;
            }
        } else {
            if(b>c) {
                biggest = b;
            } else {
                biggest = c;
            }
        }
        System.out.println("Biggest number:" + biggest);
        System.out.println("Smallest number:" + smallest);
    }
}
