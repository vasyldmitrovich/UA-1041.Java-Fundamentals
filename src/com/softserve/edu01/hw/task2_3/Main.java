package com.softserve.edu01.hw.task2_3;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
        //Good
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input cost per minute of a phone call to the country 1, с1:");


        double c1 = sc.nextDouble();
        System.out.println("input cost per minute of a phone call to the country 2, с2:");
        double c2 = sc.nextDouble();
        System.out.println("input cost per minute of a phone call to the country 3, с3:");
        double c3 = sc.nextDouble();
        System.out.println("input duration of a phone call to the country 1, t1:");
        double t1 = sc.nextDouble();
        System.out.println("input duration of a phone call to the country 2, t2:");
        double t2 = sc.nextDouble();
        System.out.println("input duration of a phone call to the country 3, t3:");
        double t3 = sc.nextDouble();
        double total = 0;
        double cost;
        cost = c1 * t1;
        total += cost;
        System.out.println("cost of each call to the country 1: " + cost);
        cost = c2 * t2;
        total += cost;
        System.out.println("cost of each call to the country 2: " + cost);
        cost = c3 * t3;
        total += cost;
        System.out.println("cost of each call to the country 3: " + cost);
        System.out.println("total cost: " + total);


//        Scanner sc = new Scanner(System.in);
//        double c;
//        double t;
//        double cost;
//        double total = 0;
//        for (int i = 0; i < 3; i++) {
//            System.out.println("input cost per minute of a phone call to the country " + (i+1) + ", с" + (i+1) + ": ");
//            c = sc.nextDouble();
//            System.out.println("input duration of a phone call to the country " + (i+1) + ", t" + (i+1) + ": ");
//            t = sc.nextDouble();
//            cost=c*t;
//            System.out.println("cost of each call to the country " + (i+1) + ": "+cost);
//            total+=cost;
//            System.out.println();
//        }
//        System.out.println("total cost: " +total);


//        Scanner sc = new Scanner(System.in);
//        double[] c = new double[3];
//        double[] t = new double[3];
//        double[] cost = new double[3];
//        double total = 0;
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("input cost per minute of a phone call to the country " + i + ", с" + i + ": ");
//            c[i-1] = sc.nextDouble();
//        }
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("input duration of a phone call to the country " + i + ", t" + i + ": ");
//            t[i-1] = sc.nextDouble();
//        }
//        for (int i = 1; i <= 3; i++) {
//            cost[i-1]=c[i-1]*t[i-1];
//            System.out.println("cost of each call to the country " + i + ": "+cost[i-1]);
//
//            total+=cost[i-1];
//        }
//        System.out.println("total cost: " +total);


    }
}
