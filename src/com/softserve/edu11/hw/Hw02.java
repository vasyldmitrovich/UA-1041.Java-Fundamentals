package com.softserve.edu11.hw;

import java.util.Scanner;

public class Hw02 {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input a sentence that contains words separated by more than one space: ");
        String s = SC.nextLine();

        System.out.println(spaceReplace(s));
    }

    public static String spaceReplace(String string) {
        return string.replaceAll("\\s+", " ");
    }
}
