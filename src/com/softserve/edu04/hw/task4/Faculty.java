package com.softserve.edu04.hw.task4;

import java.util.Objects;

public class Faculty {
    private int numberOfStudents;
    private Season currentSeason;

    // Constructor
    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    // Getters and Setters
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    //Add toString equals and hash code

    @Override
    public String toString() {
        return "Faculty{" +
                "numberOfStudents=" + numberOfStudents +
                ", currentSeason=" + currentSeason +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return numberOfStudents == faculty.numberOfStudents && currentSeason == faculty.currentSeason;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfStudents, currentSeason);
    }
}
