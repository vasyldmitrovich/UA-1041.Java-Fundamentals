package com.softserve.edu05.pt.Task3;

import com.softserve.edu04.hw.Task2.Task2;

import java.util.Random;

import static java.lang.Math.*;

public class Task3 {
    static int countpositive;
    static int countnegative;
    static int []array;


    public void getmin(int []array){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            if(array[i]< min){
                min=array[i];
            }
        }
        System.out.println("minimum is: "+(min));;
    }
    public void getmax(int []array){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("max is: "+(max));;
    }
    public int getpositive (int []array){
        int sum=0;
        for (int i = 0; i < 10; i++) {
            if(array[i]>0){
                sum+=array[i];
                countpositive++;
            }
        }
        System.out.println("the sum of positive numbers is: "+(sum));;
        return countpositive;
    }
    public int getnegative (int []array){

        for (int i = 0; i < 10; i++) {
            if(array[i]<0){
                countnegative ++;
            }
        }
        System.out.println("the count of negative numbers is: "+(countnegative ));;
        return countnegative;
    }

    public void getResult(){
        if(countnegative<countpositive){
            System.out.println("There are more positive values in the array");
        }
        else if(countnegative>countpositive){
            System.out.println("There are more negative positive values in the array");
        }
        else System.out.println("There are an equal number of positive and negative values in the array");
        System.out.println("Negative: "+countnegative);
        System.out.println();
        System.out.println("Positive: "+countpositive);
    }


}
