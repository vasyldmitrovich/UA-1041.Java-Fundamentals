package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


//enum Alphabet {
  //  A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
//}

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
      //  Task_1.charNumber();
     //   int key=3;
     //   int len=Alphabet.values().length;
    //    System.out.println('x' + 3 - len);
      //  System.out.println((char)('z'-'a'+4));

        //Task 2
        System.out.println("Task 2");
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("MM.dd.yy");
        var today = formater.format(LocalDate.now());
        System.out.println(today);
        System.out.println(formater.parse(today, LocalDate::from));
        System.out.println();

        //Task 3
        System.out.println("Task 3");
        var year = LocalDate.now().getYear();
        if (year % 4==0) {
            System.out.format("Current year - %d is a leap\n", year);
        } else {
            System.out.format("Current year - %d is not a leap\n", year);
        }
        System.out.println();

        //Task 4
        System.out.println("Task 4");
        LocalDate birthDate = LocalDate.of(1989, 7, 9);
        System.out.println(birthDate);
        System.out.println("Day of my birth - "+birthDate.getDayOfWeek());
        System.out.println("Day of the week after 6 month after my birth - "+
                birthDate.plusMonths(6).getDayOfWeek());
        System.out.println("Day of the week after year after my birth - "+
                birthDate.plusYears(1).getDayOfWeek());
    }
}
