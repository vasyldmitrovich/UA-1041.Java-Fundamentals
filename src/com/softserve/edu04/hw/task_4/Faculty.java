package com.softserve.edu04.hw.task_4;

public class Faculty {
 private   int numberOfStudent;
  private   Season currentSeason;

    public Faculty() {
    }

    public Faculty(int numberOfStudent, Season currentSeason) {
        this.numberOfStudent = numberOfStudent;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Faculty faculty = (Faculty) o;

        if (numberOfStudent != faculty.numberOfStudent) return false;
        return currentSeason == faculty.currentSeason;
    }

    @Override
    public int hashCode() {
        int result = numberOfStudent;
        result = 31 * result + currentSeason.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "numberOfStudent=" + numberOfStudent +
                ", currentSeason=" + currentSeason +
                '}';
    }
}
