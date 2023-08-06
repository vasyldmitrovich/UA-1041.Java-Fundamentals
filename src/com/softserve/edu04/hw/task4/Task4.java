package com.softserve.edu04.hw.task4;

import java.util.Scanner;

public class Task4 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Faculty f1 = createFaculty();
        System.out.println(f1.getNumberOfStudents() + '\n' + f1.getSeason().name());
    }

    public static Faculty createFaculty(){
        System.out.println("Input amount of student and season");
        Faculty f = new Faculty();
        f.setNumberOfStudents(sc.nextInt());
        System.out.println("Input season");
        String name = sc.nextLine();
        f.setSeason(Season.valueOf(name));
        return f;
    }

}
