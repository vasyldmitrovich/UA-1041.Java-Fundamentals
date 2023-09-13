package edu04.hw;
import java.util.Scanner;




public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int numberOfStudents = scanner.nextInt();

        scanner.nextLine();//What is that???
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
