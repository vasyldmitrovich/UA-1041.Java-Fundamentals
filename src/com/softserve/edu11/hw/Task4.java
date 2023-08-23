package com.softserve.edu11.hw;

import com.softserve.edu06.pt.Task3.Line;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        var scaner=new Scanner(System.in);
        String firstName;
        String lastName;
        boolean flagFirstName;
        boolean flagLastName;
         do{
             System.out.println("Enter your first name: ");
             firstName=scaner.nextLine();
             System.out.println("Enter your last name: ");
             lastName=scaner.nextLine();
             flagFirstName=firstName.matches("[a-zA-Z -]+");
             flagLastName= lastName.matches("[a-zA-Z -]+");
             if(!flagFirstName || !flagLastName){
                 System.out.println("ERROR, not available text");
             }
        }while (!flagFirstName || !flagLastName);

        System.out.printf("""
            Hello %s, our data has been added to the database, check if everything is correct
            your first name is: %s
            your last name is: %s.
            """
                ,firstName,firstName,lastName
        );
    }
}
