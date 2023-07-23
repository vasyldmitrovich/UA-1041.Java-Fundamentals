package com.softserve.edu01.hw;

import java.util.Scanner;

public class KyivStarCosts {
    public static void main(String[] args) {
        //c... = cost per minute
        double c1;
        double c2;
        double c3;
        // t... = duration of the call
        double t1;
        double t2;
        double t3;
        //cost... cost for call
        double cost1;
        double cost2;
        double cost3;
        double totalCost;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st cost per minute:");
        c1=sc.nextDouble();
        System.out.println("Enter 1st duration:");
        t1=sc.nextDouble();
        System.out.println("Enter 2nd cost per minute:");
        c2=sc.nextDouble();
        System.out.println("Enter 2nd duration:");
        t2=sc.nextDouble();
        System.out.println("Enter 3rd cost per minute:");
        c3=sc.nextDouble();
        System.out.println("Enter 3rd duration:");
        t3 = sc.nextDouble();
        
        cost1 = calcCost(t1,c1);
        cost2 = calcCost(t2,c2);
        cost3 = calcCost(t3,c3);
        totalCost = calcTotal(cost1,cost2,cost3);

        System.out.format("First call cost:%.2f$\nSecond call cost:%.2f$\nThird call cost:%.2f$\nTotal cost:%.2f$",cost1,cost2,cost3,totalCost);
    }
    public static double calcTotal(double... costs){
        double sum=0;
        for (double cost:costs
             ) {
            sum+=cost;
        }
        return sum;
    }
    public static double calcCost(double duration, double cost){
        return duration*cost;
    }
}
