package com.softserve.edu05.hm;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    String type;//Field should have access modifier private. You should read about encapsulation
    int yearOfProduction;
    double engineCapacity;
    //In this class should be constructor without parameters
    //With parameters
    //Getters and Setters
    //Equals and hash code




    int[] carArray = new int[4];//field like this array should be in class like App.java
    //Because this class should do only one thing, represent entity
    // and have method which can do something with entity
    //Move this array to class like App.java and all methods which change or do something with array to App.java class





    int[] newArray;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        newArray = Arrays.copyOf(carArray, carArray.length+1);
        newArray[carArray.length] = yearOfProduction;
    }

    //If you do not use next method then delete all code which is commented
//    public String[] sortYear(int year){
//        for (int i = 0; i < newArray.length; i++){
//            if (newArray[i] == year){
//
//            }
//        }
//    }


    //Main method should be in class like App.java

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
