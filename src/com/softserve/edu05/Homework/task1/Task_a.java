package com.softserve.edu05.Homework.task1;


import java.util.Scanner;

public class Task_a {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of month:");
        int month = input.nextInt();


        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};



            System.out.println("In this month\t"  + (monthDays[month-1])+ "\t" + "days");



        }




    }



