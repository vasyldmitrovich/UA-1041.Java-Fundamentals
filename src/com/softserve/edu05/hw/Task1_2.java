package com.softserve.edu05.hw;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        int[] array = new int[10];
        boolean flag=true;
        int summ=0;
        int multiplication=1;
        for (int i = 0; i < 10; i++) {
            System.out.println("enter a number № "+(i+1)+" ");
            array[i] = scaner.nextInt();
            if (array[i] <= 0) {
                flag= false;
            }
            if (i < 5) {
                summ += array[i];
            }
            if (i >= 5) {
                multiplication*=array[i];
            }
        }
        if(flag==false){
            System.out.println(multiplication);

        }
        else System.out.println(summ);
    }
}
