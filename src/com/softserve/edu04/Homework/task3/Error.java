package com.softserve.edu04.Homework.task3;

import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Input error: ");
        int a = scanner.nextInt();

        if (a == 400) {
            System.out.println("The error is: Bad Request");

        } else if (a == 401) {
            System.out.println("The error is: Unauthorized");

        } else if (a == 402) {
            System.out.println("The error is: Payment Required");
        }
        if (a == 403) {
            System.out.println("The error is: Forbidden");
        }
       // System.out.println("Error" + a);
    }

    }

