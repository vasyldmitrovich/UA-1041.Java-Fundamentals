package com.softserve.edu04.hw;

import java.util.Scanner;

public class HW_task3 {
    public static void main(String[] args) {
        HTTPError httpError = HTTPError.CLIENTERROR;
        System.out.println(httpError.getMistake());
    }
    //Create enum of HTTP ERRORS
    public enum HTTPError {
        INFORMACIONAL, SUCCESSFULL, REDIRECTION, CLIENTERROR, SERVERERROR;

        public String getMistake() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input the number: ");
            int numbersOfError = scanner.nextInt();
            if ((numbersOfError >= 100) && (numbersOfError < 200)) {
                System.out.println("This is a " + HTTPError.INFORMACIONAL + " mistake");
            } else if ((numbersOfError >= 200) && (numbersOfError < 300)) {
                System.out.println("This is a " + HTTPError.SUCCESSFULL + " mistake");
            } else if ((numbersOfError >= 300) && (numbersOfError < 400)) {
                System.out.println("This is a " + HTTPError.REDIRECTION + " mistake");
            } else if ((numbersOfError >= 400) && (numbersOfError < 500)) {
                System.out.println("This is a " + HTTPError.CLIENTERROR + " mistake");
            } else if ((numbersOfError >= 500) && (numbersOfError < 600)) {
                System.out.println("This is a " + HTTPError.SERVERERROR + " mistake");
            } else {
                System.out.println("Unexpected Error");
            }
            return ("Code: " + numbersOfError);
        }


    }
}

