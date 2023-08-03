package com.softserve.edu01.pt;

import java.util.Scanner;

public class AnswerOnRequest {
    public static void main(String[] args) {
        System.out.println("How are you?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        System.out.println("You are " + answer.toLowerCase());
    }
}
