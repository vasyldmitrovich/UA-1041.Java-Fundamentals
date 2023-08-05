package edu5;
import java.util.Scanner;
import java.util.Arrays;

public class task1 {
   public static void main(String[] args) {
       int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number of month(1-12)");
       int monthNumber = scanner.nextInt();

       if(monthNumber >= 1 && monthNumber<=12){
           int daysInMonth = daysInMonths[monthNumber - 1];
           System.out.println("Number of days in month " + monthNumber + ": " + daysInMonth);
       } else{
           System.out.println("Invalid input");
       }
   }
}