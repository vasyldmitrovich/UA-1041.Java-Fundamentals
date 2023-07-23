package com.softserve.edu01.src;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Enter your address: ");
        String address = scan.next();
        System.out.println("You live in " + address + " and your name is " + name);

    }
}
