package com.softserve.edu11.pr;

import java.util.Scanner;



public class Latin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        String[] users = line.split("\\s+");
        for (var person: users){
            System.out.printf("User '%s' is %svalid%n", person,
                    validate(person) ? "" : "in" );
        }
    }

    public static boolean validate(String username){
        return username.matches("[A-Za-z]{3,15}");
    }
}
