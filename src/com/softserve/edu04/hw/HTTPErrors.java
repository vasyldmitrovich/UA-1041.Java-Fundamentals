package com.softserve.edu04.hw;

import static com.softserve.edu04.hw.App.SCANNER;

public class HTTPErrors {

    private static int getNumberOfError() {
        System.out.println("Input the number of error from tne list: 100, 201, 302, 401, 502 ");
        int numberOfError = SCANNER.nextInt();
        SCANNER.nextLine();
        return numberOfError;
    }

    private static void getNameOfError(String numberOfError) {
        HTTPError error = null;
        if (error == null) {
            error = switch (numberOfError) {
                case "100" -> HTTPError.CONTINUE;
                case "201" -> HTTPError.CREATED;
                case "302" -> HTTPError.FOUND;
                case "401" -> HTTPError.UNAUTHORIZED;
                case "502" -> HTTPError.BAD_GATEWAY;
                default -> null;
            };
            System.out.println("The name of the error " + numberOfError + " named " + error);
        } else {
            System.out.println("Please input value of the error from the list.");
        }
    }

    public enum HTTPError {
        CONTINUE, CREATED, FOUND, UNAUTHORIZED, BAD_GATEWAY
    }
}
