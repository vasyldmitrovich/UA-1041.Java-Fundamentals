package com.softserve.edu04.hw.work3;

import java.util.Scanner;

public class Main {
    enum HTTPError {
        BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND
    }//This enum should be in another file HTTPError.java not there
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input a number representing an HTTP error (such as 400, 401, 402, etc.): ");
        int number = SCANNER.nextInt();

        HTTPError error = getError(number);

        System.out.println("The name of error #" + number + " is: " + error);
    }
    public static HTTPError getError(int number) {
        switch (number) {
            case 400:
                return HTTPError.BAD_REQUEST;
            case 401:
                return HTTPError.UNAUTHORIZED;
            case 402:
                return HTTPError.PAYMENT_REQUIRED;
            case 403:
                return HTTPError.FORBIDDEN;
            case 404:
                return HTTPError.NOT_FOUND;
        }
        return null;
    }
}