package com.softserve.edu05.hw.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Car car1 = new Car("BMW", 2016, 3.0);
        Car car2 = new Car("Audi", 2020, 2.8);
        Car car3 = new Car("Volkswagen", 2016, 1.9);
        Car car4 = new Car("Toyota", 2010, 2.0);

        int modelYear = getNumber("Input model year: ");
        System.out.println("Cars of year " + modelYear + " :\n" + Arrays.toString(certainModelYear(modelYear,
                car1, car2, car3, car4)));

        System.out.println("Cars sorted by year production:");
        Arrays.stream(sortCarsByYearProduction(car1, car2, car3, car4)).forEach(System.out::println);

    }
    public static int getNumber(String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static Car[] certainModelYear(int modelYear, Car... cars){
        List<Car> list = new ArrayList<>();
        for(Car car : cars){
            if(car.getYear() == modelYear) list.add(car);
        }
        return list.toArray(Car[]::new);
    }

    public static Car[] sortCarsByYearProduction(Car... cars){
        Arrays.sort(cars);
        return cars;
    }
}