package com.softserve.edu01.hw;

import java.util.Scanner;

public class AnswerOnQuestion {
    public static void main(String[] args) {
        String name;
        String address;

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Where do you live " + name + " ?");
        address = scanner.nextLine();

        System.out.println("Your name is: " + name);
        System.out.println("You live: " + address);

    }
}
