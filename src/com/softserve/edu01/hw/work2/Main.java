package com.softserve.edu01.hw.work2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String address;
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Where do you live, " + name + "?");
        address = scanner.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("You live at " + address);
    }
}