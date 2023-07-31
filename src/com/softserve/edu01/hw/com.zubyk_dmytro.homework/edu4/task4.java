package edu4;
import java.util.Scanner;
enum Seasons{
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private String name;

    Seasons(String name){this.name = name;}

    public String getName(){
        return name;
    }
}

class Faculty{
    private int numberOfStudents;
    private Seasons currentSeason;
    public Faculty(int numberOfStudents, Seasons currentSeason){
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Seasons getCurrentSeason() {
        return currentSeason;
    }
}

public class task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Choose the current season:");
        for(Seasons seasons : Seasons.values()){
            System.out.println((seasons.ordinal() + 1) + "." + seasons.getName());
        }
        int seasonChoice = scanner.nextInt();
        scanner.close();

        Seasons currenSeason = Seasons.values()[seasonChoice - 1];
        Faculty faculty = new Faculty(numberOfStudents, currenSeason);

        System.out.println("\nFaculty Information");
        System.out.println("Number of srudents: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason());
    }

}
