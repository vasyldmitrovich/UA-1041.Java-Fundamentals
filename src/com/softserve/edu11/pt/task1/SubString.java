package com.softserve.edu11.pt.task1;

import java.util.Scanner;

public class SubString {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first string: "); // SoftServe
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");  // SoftServe Academy
        String s2 = sc.nextLine();
        System.out.println(s2.contains(s1));
    }

}