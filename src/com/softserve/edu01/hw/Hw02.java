package com.softserve.edu01.hw;

import java.util.Scanner;

public class Hw02 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        var name = scanner.nextLine();
        System.out.println("Where do you live, " + name + "?");
        var place = scanner.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("You live in " +place);
    }
}
