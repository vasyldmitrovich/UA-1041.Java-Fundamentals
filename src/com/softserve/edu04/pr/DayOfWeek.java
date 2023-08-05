package com.softserve.edu04.pr;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //This is not good Enum should be in another file like Day.java
        //And there you use this enum
    enum Day{
        Mon("Понеділок", "Monday"), Tue("Вівторок", "Tuesday"), Wed("Середа", "Wednesday"),
                Thu("Четвер", "Thursday"), Fri("П'ятниця", "Friday"), Sat("Субота", "Saturday"), Sun("Неділя", "Sunday");

    public String getUa() {
        return ua;
    }

    public String getEn() {
        return en;
    }

    public String getGeneralInfo(){
        return getEn() + " " + getUa();
    }

    private final String ua;
            private final String en;
            Day(String ua, String en){
                this.ua = ua;
                this.en = en;
            }
        }
        System.out.println("Enter the number of day in week:");
        int numberOfDay = sc.nextInt();
        switch (numberOfDay){
            case 1 -> System.out.println(Day.Mon.getGeneralInfo());
            case 2 -> System.out.println(Day.Tue.getGeneralInfo());
            case 3 -> System.out.println(Day.Wed.getGeneralInfo());
            case 4 -> System.out.println(Day.Thu.getGeneralInfo());
            case 5 -> System.out.println(Day.Fri.getGeneralInfo());
            case 6 -> System.out.println(Day.Sat.getGeneralInfo());
            case 7 -> System.out.println(Day.Sun.getGeneralInfo());
        }

    }
}
