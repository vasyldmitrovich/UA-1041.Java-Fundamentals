package com.softserve.edu05.hw;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        int[] array = new int[10];
        boolean f=true;//Give correct name of variables
        int s=0;
        int d=1;
        for (int i = 0; i < 10; i++) {
            System.out.println("enter a number № "+(i+1)+" ");
            array[i] = scaner.nextInt();
            if (array[i] <= 0) {
                f = false;
            }
            if (i < 5) {
                s += array[i];
            }
            if (i >= 5) {
                d*=array[i];
            }
        }
        if(f==false){
            System.out.println(d);

        }
        else System.out.println(s);
    }
}
