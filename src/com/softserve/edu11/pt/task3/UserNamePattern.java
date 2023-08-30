package com.softserve.edu11.pt.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNamePattern {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            System.out.printf("Enter user %d: ", i + 1);
            users.add(sc.nextLine());
        }
//        users.add("userFIRst89_78");
//        users.add("_ivan_90_BQ");
//        users.add("Maxim@io=cecond");
//        users.add("(Olha)_18");
//        users.add("roman.third 65");

        for (String user : users){
            System.out.format("%s : %s\n", user, checkUsername(user) ? "valid" : "invalid");
        }
    }

    public static boolean checkUsername(String username){
        // (?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*_)
        Pattern pattern = Pattern.compile("^[a-zA-Z\\d_]{3,15}$");
        Matcher matcher = pattern.matcher(username);
        return matcher.find();
    }
}