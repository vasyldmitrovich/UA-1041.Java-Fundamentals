package com.softserve.edu01.hw.task2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("What is your name?");
        String name =sc.nextLine();
        System.out.println("Where do you live, "+name+"?");
        String address=sc.nextLine();
        System.out.println("Your name is - "+name+",\n"+"you live - "+address+".");


    }
}
