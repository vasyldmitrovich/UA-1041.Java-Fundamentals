package com.softserve.edu04.hw.Task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int number1 = scanner.nextInt();
        System.out.println("Second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Third number: ");
        int number3 = scanner.nextInt();
        Task1 ob=new Task1();
        ob.Perevirka(number1,number2,number3);


        //All this if else move to some method and call this method here

    }
}
