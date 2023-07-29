package com.softserve.edu01.pt;

import java.util.Scanner;

public class Pt04 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("How are you?");
        var answer = scanner.nextLine();
        System.out.println("You are "+ answer);
    }
}
