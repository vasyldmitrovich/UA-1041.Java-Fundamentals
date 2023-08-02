package com.softserve.edu05.hm;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    String type;
    int yearOfProduction;
    double engineCapacity;
    int[] carArray = new int[4];
    int[] newArray;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        newArray = Arrays.copyOf(carArray, carArray.length+1);
        newArray[carArray.length] = yearOfProduction;
    }

//    public String[] sortYear(int year){
//        for (int i = 0; i < newArray.length; i++){
//            if (newArray[i] == year){
//
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car1 = new Car("volvo", 2011, 1.2);
        Car car2 = new Car("ford", 2015, 1.5);
        Car car3 = new Car("chevrolet", 2011, 2.0);
        Car car4 = new Car("renault", 2013, 1.2);
        System.out.println("Enter the year:");
        int year = sc.nextInt();

    }
}
