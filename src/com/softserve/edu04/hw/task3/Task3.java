package com.softserve.edu04.hw.task3;

import java.util.Scanner;

public class Task3 {
    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//Good
        System.out.print("Enter http error code(400, 401, 402, 403, 404, 405): ");
        int code = SCANNER.nextInt();

        HttpError error = switch (code) {
            case 400 -> HttpError.BAD_REQUEST;
            case 401 -> HttpError.UNAUTHORIZED;
            case 402 -> HttpError.PAYMENT_REQUIRED;
            case 403 -> HttpError.FORBIDDEN;
            case 404 -> HttpError.NOT_FOUND;
            case 405 -> HttpError.METHOD_NOT_ALLOWED;
            default -> throw new IllegalStateException("Unexpected value: " + code);
        };

        System.out.println("Your error has message: " + error.getMessage());
    }
}
