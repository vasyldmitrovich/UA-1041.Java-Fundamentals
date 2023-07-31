package com.softserve.edu02;
//In your local project mark as source code package src
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?");
        String name = scanner.nextLine();

        System.out.print("Where do you live?");
        String address = scanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
