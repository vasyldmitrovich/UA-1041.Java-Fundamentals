package com.softserve.edu04.hw.Task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner =new Scanner(System.in);
        System.out.println("First number: ");
        int number1=scanner.nextInt();
        System.out.println("Second number: ");
        var number2=scanner.nextInt();
        System.out.println("Third number: ");
        var number3=scanner.nextInt();
        Task2 mm=new Task2();
        mm.Maximum(number1,number2,number3);
        mm.Minimum(number1,number2,number3);
    }
}
