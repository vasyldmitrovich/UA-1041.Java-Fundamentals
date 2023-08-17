package com.softserve.edu05.Practical.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //first
        String[] flowers = {"Rose","Tulip","Sunflower"};
        System.out.println(Arrays.toString(flowers));
        Arrays.sort(flowers);
        System.out.println(Arrays.toString(flowers));
//second
        double[] numbers = {3.5,2.7,5,11.8,15,6};
        double sum = 0;
        for (var d : numbers) {
            sum += d;
        }
        double average = (sum / numbers.length);
        String result = String.format("%.3f",average);
        System.out.println("Average =  " + result);


        //third
        System.out.println("Enter the name of flower: ");
        Scanner scan = new Scanner(System.in);
        var nameToSearch = scan.nextLine();
        var ix = Arrays.binarySearch(flowers,nameToSearch);
        if (ix<0) {
            System.out.println("No found");
        } else {
                System.out.println(nameToSearch +"\t" + "is found in position\t" + ix);
            }
        }
    }


