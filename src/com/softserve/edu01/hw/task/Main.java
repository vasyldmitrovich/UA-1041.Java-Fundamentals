package com.softserve.edu01.hw.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        var name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Where do you live?, " + name);
        var address = scanner.nextLine();
        System.out.println("Your name: " +name);
        System.out.println("Your address:" +address);





    }

}
