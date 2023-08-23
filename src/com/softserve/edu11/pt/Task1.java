package com.softserve.edu11.pt;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter first line: ");
        String FirstLine=scanner.nextLine();
        System.out.print("Enter second line: ");
        String SecondLine= scanner.nextLine();
        if(SecondLine.contains(FirstLine)){
            System.out.println("True");

        }
        else System.out.println("False");

    }
}
