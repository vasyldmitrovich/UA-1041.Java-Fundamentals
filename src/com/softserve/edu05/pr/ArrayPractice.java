package com.softserve.edu05.pr;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args){
//        sorting array of strings
        String[] Arr1 = {"apple", "cherry", "banana"};
        Arrays.sort(Arr1);
        System.out.println( Arrays.toString(Arr1));

//        calculating average of 5 numbers in array
        double[] numArray = {3, 67, 43, 24.5, 26};
        double count = 0;
        for (int i=0; i< numArray.length; i++){
            count += numArray[i];
        }
        double result = count / numArray.length;
        System.out.println(result);

//        check if array contains an element
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element to find");
        var  value = sc.next();
        boolean track = false;
        for (String element: Arr1){
            if (element.equals(value)){
                track = true;
                break;
            }
        }
        System.out.println(track);
    }
}
