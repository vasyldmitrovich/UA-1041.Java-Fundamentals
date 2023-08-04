package com.softserve.edu04.pt;
//When you past your code there, write package like package com.softserve.edu04.pt;
import java.util.Scanner;
//Name of class should start from upper case
public class task1 {
    //This method should be in class like App.java
    public static void main(String[] args) {
        var scanner =new Scanner(System.in);
        int s=0;
        System.out.println("First number: ");
        int number1=scanner.nextInt();
        System.out.println("Second number: ");
        var number2=scanner.nextInt();
        System.out.println("Third number: ");
        var number3=scanner.nextInt();
        //All this logic move to method and there call this method
        if(number1 % 2 == 0){
            System.out.println("First number is even");
        }
        else {
            System.out.println("First number is odd");
            s++;
        }
        if(number2 % 2 == 0){
            System.out.println("Second number is even");
        }
        else {
            System.out.println("Second number is odd");
            s++;
        }
        if(number3 % 2 == 0){
            System.out.println("Third number is even");
        }
        else {
            System.out.println("Third number is odd");
            s++;
        }
        System.out.println("Number of odd: "+(s));

    }
}