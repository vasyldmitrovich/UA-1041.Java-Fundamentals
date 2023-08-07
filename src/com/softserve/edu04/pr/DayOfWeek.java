package com.softserve.edu04.pr;

import java.util.Scanner;

public class DayOfWeek {

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


//            @Override
//            public String toString() {
//                return "Day{" +
//                        "ua='" + ua + '\'' +
//                        ", en='" + en + '\'' +
//                        '}';
//            }

            private final String ua;
            private final String en;
            Day(String ua, String en){
                this.ua = ua;
                this.en = en;
            }
        }

}
