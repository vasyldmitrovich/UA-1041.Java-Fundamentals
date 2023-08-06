package com.softserve.edu04.pt.Task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner =new Scanner(System.in);
        int s=0;
        System.out.println("First number: ");
        int number1=scanner.nextInt();
        System.out.println("Second number: ");
        var number2=scanner.nextInt();
        System.out.println("Third number: ");
        var number3=scanner.nextInt();
        Task1 pere=new Task1();
        pere.obr(number1);
        pere.obr(number2);
        pere.obr(number3);
        pere.countOfOdd();
    }
}
