package com.softserve.edu04.hw.task3;

import java.util.Scanner;

public class HTTPRequest {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int HTTPStatus = getNumber("Input HTTP Request: ");
        System.out.println("HTTP status: " + HTTPError.values()[HTTPStatus/100 - 1]);
    }

    public static int getNumber(String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }
}
