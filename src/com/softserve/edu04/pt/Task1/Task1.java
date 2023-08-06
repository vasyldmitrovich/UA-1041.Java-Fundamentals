package com.softserve.edu04.pt.Task1;
//When you past your code there, write package like package com.softserve.edu04.pt;
import java.util.Scanner;
//Name of class should start from upper case
public class Task1 {
    private int number;
    private static int s=0;
    public void obr(int number){
        if(number % 2 == 0){
            System.out.println("First number is even");
        }
        else {
            System.out.println("First number is odd");
            s++;
        }
    }
    public void countOfOdd(){
        System.out.println("Number of odd: "+(s));
    }

    //This method should be in class like App.java

}