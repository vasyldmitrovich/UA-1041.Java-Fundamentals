package com.softserve.edu04.pt;
//When you past your code there, write package like package com.softserve.edu04.pt;
import java.util.Scanner;

//Name of class should start from upper case
public class task2 {
    //This method should be in class like App.java
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Number of day: ");
        int numDay = scanner.nextInt();
        switch (numDay){
            case 1-> System.out.println("Monday (Понеділок)");
            case 2-> System.out.println("Tuesday (Вівторок)");
            case 3-> System.out.println("Wednesday (Середа)");
            case 4-> System.out.println("Thursday (Четвер)");
            case 5-> System.out.println("Friday (Пятниц'я)");
            case 6-> System.out.println("Saturday (Субота)");
            case 7-> System.out.println("Sunday (Неділя)");
            default -> {
                System.out.println("ERROR it is more then 7 or less then 1");
                System.out.println("Pleas enter a number that belong to the range [1, 7] ");
            }
        }
    }
}
