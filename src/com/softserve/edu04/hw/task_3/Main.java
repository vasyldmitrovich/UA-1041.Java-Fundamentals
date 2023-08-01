package com.softserve.edu04.hw.task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int codeError = getNumber("Input a number representing an HTTP error:");
        boolean found = false;
        for (var err : HTTPError.values()
        ) {
            if (err.getCodeError() == codeError) {
                System.out.println("description of code " + codeError + ": " + err.getDescription());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("code not found, try again!");
        }
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
}
