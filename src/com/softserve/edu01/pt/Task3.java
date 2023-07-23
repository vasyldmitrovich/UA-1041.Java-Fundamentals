package com.softserve.edu01.pt;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextInt();
        System.out.println("Enter b:");
        b=sc.nextInt();

        System.out.format("a+b = %d\n",a+b);
        System.out.format("a-b = %d\n",a-b);
        System.out.format("a*b = %d\n",a*b);
        System.out.format("a/b = %.2f\n",a/(double)b);
    }
}
