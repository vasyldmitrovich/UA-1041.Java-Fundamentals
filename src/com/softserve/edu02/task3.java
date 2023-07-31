package src.com.softserve.edu02;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First call: ");
        double c1 = sc.nextDouble();
        System.out.print("Input the duration of call 1 in minutes: ");
        double t1 = sc.nextDouble();

        System.out.print("Second call: ");
        double c2 = sc.nextDouble();
        System.out.print("Input the duration of call 2 in minutes: ");
        double t2 = sc.nextDouble();

        System.out.print("Third call: ");
        double c3 = sc.nextDouble();
        System.out.print("Input the duration of call 3 in minutes: ");
        double t3 = sc.nextDouble();


        System.out.println("Cost of call 1: " + c1*t1);
        System.out.println("Cost of call 2: " + c2*t2);
        System.out.println("Cost of call 3: " + c3*t3);
        System.out.println("Total cost: " + ((c1*t1)+(c2*t2)+(c3+t3)));
    }
}