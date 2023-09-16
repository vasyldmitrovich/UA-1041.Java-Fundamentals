package com.softserve.edu11.Homework.task1;


import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = scan.nextLine();
        System.out.println("The longest word is : " + LongestWordLength(sentence));

    }

    static String LongestWordLength(String str) {


            int n = str.length();
            int res = 0, curr_len = 0;
            for (int i = 0; i < n; i++)
            {
                // If current character is not
                // end of current word.
                if (str.charAt(i) != ' ')
                    curr_len++;

                    // If end of word is found
                else
                {
                    res = Math.max(res, curr_len);
                    curr_len = 0;
                }
            }

            // We do max one more time to consider
            // last word as there won't be any space
            // after last word.
            return String.valueOf(Math.max(res, curr_len));
        }



    }


















