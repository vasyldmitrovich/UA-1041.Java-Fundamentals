package com.softserve.edu04.hw;

import static com.softserve.edu04.util.CollectInputs.inputNumberInt;
import static com.softserve.edu04.util.CollectInputs.inputString;
import static com.softserve.edu04.util.WorkingWithStrings.capitalizeString;

public class Faculty {
    private int numOfStudents;
    private String season;

    Faculty() {

    }

    Faculty(int numOfStudents, String season) {
        this.numOfStudents = numOfStudents;
        this.season = season;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = capitalizeString(season);
    }

    public void intputNumOfStudents() {
        this.numOfStudents = inputNumberInt("Input num of students");
    }

    public void inputSeason() {
        String season = capitalizeString(inputString("Please enter name of season"));
        switch (season) {
            case "Summer", "Літо" -> this.season = Season.SUMMER.getEngSeason();
            case "Spring", "Весна" -> this.season = Season.SPRING.getEngSeason();
            case "Winter", "Зима" -> this.season = Season.WINTER.getEngSeason();
            case "Autumn", "Осінь" -> this.season = Season.AUTUMN.getEngSeason();
            default -> System.out.println("No such season");
        }
    }

    public void outputNumOfStudents() {
        System.out.println("The number of students is: " + this.numOfStudents);
    }

    public void outputSeason() {
        switch (this.season) {
            case "Summer", "Літо" -> System.out.println("This is beautiful hot summer");
            case "Spring", "Весна" -> System.out.println("This is blooming spring");
            case "Winter", "Зима" -> System.out.println("This is frozen winter");
            case "Autumn", "Осінь" -> System.out.println("This is mystery autumn");
            default -> System.out.println("No such season");
        }
    }

}