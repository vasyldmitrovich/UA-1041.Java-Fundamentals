package com.softserve.edu04.hw;

import java.util.Scanner;

//Name of class should start from upper case
public class task1 {
    public static void main(String[] args) {
        var scanner =new Scanner(System.in);
        int s=0;
        System.out.println("First number: ");
        int number1=scanner.nextInt();
        System.out.println("Second number: ");
        var number2=scanner.nextInt();
        System.out.println("Third number: ");
        var number3=scanner.nextInt();

        //All this if else move to some method and call this method here
        if(number1 >5 || number1<-5){
            System.out.println("First number not belong to the range [-5, 5]");
            s++;
        }
        else System.out.println("First number  belong to the range [-5, 5]");
        if(number2 >5 || number2<-5){
            System.out.println("Second number not belong to the range [-5, 5]");
            s++;
        }
        else System.out.println("Second number  belong to the range [-5, 5]");
        if(number3 >5 || number3<-5){
            System.out.println("Third number not belong to the range [-5, 5]");
            s++;
        }
        else System.out.println("Third number  belong to the range [-5, 5]");
        System.out.println(s+(" numbers are belong to the range [-5, 5]"));

    }
}
