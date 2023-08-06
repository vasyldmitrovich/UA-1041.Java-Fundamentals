package com.softserve.edu04.hw;

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


}