package com.softserve.edu02.hm;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        System.out.println("Enter cost per minute of the 3 calls:");
        Scanner sc = new Scanner(System.in);
        int c1;
        int c2;
        int c3;
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        c3 = sc.nextInt();
        System.out.println("Enter duration of each of 3 calls:");
        int t1;
        int t2;
        int t3;
        t1 = sc.nextInt();
        t2 = sc.nextInt();
        t3 = sc.nextInt();
        int cost1 = c1 * t1;
        int cost2 = c2 * t2;
        int cost3 = c3 * t3;
        int total_cost = cost1 + cost2 + cost3;
        System.out.println("Cost of each call: ");
        System.out.println(cost1 + ", " + cost2 + ", " + cost3);
        System.out.println("Your total cost is: " + total_cost);
    }
}
