package com.softserve.edu11.pt;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        var scaner=new Scanner(System.in);
        System.out.println("Enter a number, how many words you want to enter");
        int number= scaner.nextInt();
        scaner.nextLine();
        String[] Array = new String[number];
        for (int i = 0; i <number; i++) {
            Array[i]=scaner.nextLine();

        }
        for (int i = 0; i <number; i++) {
            System.out.printf("User'%s'<%s >is %svalid%n",i+1,Array[i],validate(Array[i])?"":"in");
        }
    }


    public static boolean validate(String text) {
        return text.matches("\\w{3,15}");
    }
}
