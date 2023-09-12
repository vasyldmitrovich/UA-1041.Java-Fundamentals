package edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Ptask1 {
    public static void main(String[] args) {
        String[] arr1 = {"Andrew", "Tom", "Cilian"};
        Arrays.sort(arr1);
        System.out.println("Sorted array:");

        //Divide logic to some methods and here call that methods
        for (String str : arr1) {
            System.out.print(str + " ");
        }
        int[] arr2= {1, 4, 5, 6, 9};
        int sum = 0;
        for(int num: arr2){
            sum += num;
        }

        //Divide to some method
        int avVal = sum/arr2.length;
        System.out.println("\nAvarage value:" + avVal);
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int inputVal = scanner.nextInt();
        boolean numberFound = false;
        for(int num: arr2){
            if(num == inputVal){
                numberFound = true;
                break;
            }
        }
        if(numberFound){
            System.out.println("Number " + inputVal + " is in array");
        } else{
            System.out.println("Number "  + inputVal + " is not in array");
        }
    }
}
