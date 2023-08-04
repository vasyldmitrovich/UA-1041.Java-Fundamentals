package com.softserve.edu04.Homework.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Input the error: ");
        int error = scanner.nextInt();

        Error error1 = getError(error);
        System.out.println("Your Error is :" + error1);

    }

    public static Error getError(int error1) {
        return switch (error1) {
            case 400 -> Error.Bad_Request;
            case 401 -> Error.Unauthorized;
            case 402 -> Error.Payment_Required;
            case 403 -> Error.Forbidden;
            default -> null;

        };

    }
}







