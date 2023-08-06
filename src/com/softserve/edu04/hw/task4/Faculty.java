package com.softserve.edu04.hw.task4;

public class Faculty {

    private int numberOfStudents;
    private Season season;

    public Faculty() {
    }

    public Faculty(int numberOfStudents, Season season) {
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
