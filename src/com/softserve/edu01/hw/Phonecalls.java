package com.softserve.edu01.hw;

import java.util.Scanner;

public class Phonecalls {

    public static void main (String []args){

        var scanner= new Scanner(System.in);
        System.out.println("Enter c1:   ");
        int c1=scanner.nextInt();
        System.out.println("Enter c2:  ");
        int c2=scanner.nextInt();
        System.out.println("Enter c3:   ");
        int c3=scanner.nextInt();
        System.out.println("Enter t1:   ");
        int t1=scanner.nextInt();
        System.out.println("Enter t2:  ");
        int t2=scanner.nextInt();
        System.out.println("Enter t3:   ");
        int t3=scanner.nextInt();
        System.out.println( "Call1: "+(c1+t1));
        System.out.println( "Call2: "+(c2+t2));
        System.out.println( "Call3: "+(c3+t3));
        System.out.println( "Total cost: " +(c2+t2+c1+t1+c3+t3));
    }
}
