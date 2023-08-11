package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("What is your name?");
        var name = sc.nextLine();
        System.out.println("Where do you live " + name + "?");
        var address = sc.nextLine();
        System.out.println("Your name is " + name + ".");
        System.out.println("You live on " + address + ".");

    }
}
