package com.softserve.edu01.hw;

import java.util.Scanner;

public class NamesAdresses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,address;

        System.out.println("What is your name?");
        name = sc.nextLine();
        String nameCapitalized = name.substring(0,1).toUpperCase()+name.substring(1);
        System.out.println("Where do you live "+nameCapitalized+" ?");
        address=sc.nextLine();
        System.out.println("Nice to meet you "+nameCapitalized+" who's address is "+address);
    }
}
