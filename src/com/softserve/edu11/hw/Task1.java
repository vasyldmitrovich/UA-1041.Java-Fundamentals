package com.softserve.edu11.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        var scaner=new Scanner(System.in);
        String[] Array=new String[5];
        System.out.println("Enter sentence of five words");
        String UsersText=scaner.nextLine();
        String[] words = UsersText.split(" ");
        var maxLenth=0;
        String longestWord = null;
        String textForOrder=null;
        for (int i = 0; i < 5; i++) {

            if (words[i].length() > maxLenth) {
                maxLenth = words[i].length();
                longestWord = words[i];
            }
            if(i==1){
                textForOrder=words[i];
            }
        }

        StringBuilder st=new StringBuilder();
        st.append(textForOrder);
        st.reverse();
        System.out.println("The longest word is: "+longestWord);
        System.out.println("The number of letters in the longest word: "+maxLenth);
        System.out.println("The second word of the sentence in reverse order:  "+st);
    }
}
