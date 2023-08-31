package com.softserve.edu06.Practica.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Task2 {

     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        Car[] cars = {
                new Sedan("Camry", 210, 2018),
                new Sedan("Corolla", 180, 2020),
                new Truck("Man", 160, 2019),
                new Sedan("Tacoma", 210, 2021),
                new Truck("Daf", 200, 2017)
        };

         Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed));

        for (var car : cars) {
            car.run();
            car.stop();
            System.out.println(car);
        }

    }


   public static abstract class Car {

        private String model;
        private int maxSpeed;
        private int yearOfProduction;


       public abstract void run();

        public abstract void stop();


       public Car(String model, int maxSpeed, int yearOfProduction) {
           this.model = model;
           this.maxSpeed = maxSpeed;
           this.yearOfProduction = yearOfProduction;
       }

       public Car(int maxSpeed, int yearOfProduction) {
           this.maxSpeed = maxSpeed;
           this.yearOfProduction = yearOfProduction;
       }

       public String getModel() {
           return model;
       }

       public void setModel(String model) {
           this.model = model;
       }

       public int getMaxSpeed() {
           return maxSpeed;
       }

       public void setMaxSpeed(int maxSpeed) {
           this.maxSpeed = maxSpeed;
       }

       public int getYearOfProduction() {
           return yearOfProduction;
       }

       public void setYearOfProduction(int yearOfProduction) {
           this.yearOfProduction = yearOfProduction;
       }

       @Override
       public String toString() {
           return "Car{" +
                   "model='" + model + '\'' +
                   ", maxSpeed=" + maxSpeed +
                   ", yearOfProduction=" + yearOfProduction +
                   '}';
       }
   }

 public static final class Sedan extends Car {


      public Sedan(String model, int maxSpeed, int yearOfProduction) {
            super(model, maxSpeed, yearOfProduction);
        }

        @Override
       public void run() {
            System.out.println("Sedan runs");
            System.out.println(this);
        }

        @Override
       public void stop() {
            System.out.println("Sedan stops");
            System.out.println(this);

        }
    }

    public static final class Truck extends Car {

        public Truck(String model, int maxSpeed, int yearOfProduction) {
            super(model, maxSpeed, yearOfProduction);
        }

        @Override
       public void run() {
            System.out.println("Truck runs");
            System.out.println(this);

        }

        @Override
        public void stop() {
            System.out.println("Truck stops");
            System.out.println(this);

        }
    }

}
