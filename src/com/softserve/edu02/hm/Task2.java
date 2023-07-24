package com.softserve.edu02.hm;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        System.out.println("What is your name?");
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Where do you live, " + name + "?");
        String address;
        address = sc.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("You live in " + address);


    }
}
