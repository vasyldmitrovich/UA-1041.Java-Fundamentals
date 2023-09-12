package edu04;

class Faculty{
    private int numberOfStudents;
    private Seasons currentSeason;

    //Add constructor without parameters

    public Faculty(int numberOfStudents, Seasons currentSeason){
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    //Add getters and setters equals hashcode and toString

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Seasons getCurrentSeason() {
        return currentSeason;
    }
}
