package javaapplication5;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String name;
        String addres;
        System.out.println("What is your name?");
        name=scanner.nextLine();
        System.out.println("Where do you live "+(name)+"?");
        addres=scanner.nextLine();
        System.out.println("You are "+(name)+" and you live in "+(addres)+(" have a nice day)"));
    }
}
