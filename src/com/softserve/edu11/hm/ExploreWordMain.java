package com.softserve.edu11.hm;

import java.util.Scanner;

public class ExploreWordMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String longestword = new ExploreWord().longestWord(line);
        System.out.println(longestword);
        System.out.println(new ExploreWord().NumOfLetters(longestword));
        System.out.println(new ExploreWord().secondWordReverse(line));
    }
}
