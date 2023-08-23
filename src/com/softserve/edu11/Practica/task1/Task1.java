package com.softserve.edu11.Practica.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the text:");
        String text = scanner.nextLine();
        System.out.print("What to find in your text?");
        String fragment = scanner.nextLine();
        System.out.println(text.contains(fragment));
    }
}
