package edu04;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("enter number 1:");
        float num1 = scanner.nextFloat();

        System.out.println("enter number 2");
        float num2 = scanner.nextFloat();

        System.out.println("enter number 3");
        float num3 = scanner.nextFloat();


        if(num1 >=-5.0 && num1<=5.0 && num2 >=-5.0 && num2<=5.0 && num3 >=-5.0 && num3<=5.0){
            System.out.println("All number are in range [-5,5]");
        } else {
            System.out.println("not all numbers are in proper range");
        }

    }
}
