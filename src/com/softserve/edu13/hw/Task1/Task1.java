package com.softserve.edu13.hw.Task1;

public class Task1 {
    public static void main(String[] args) {
        int n=5;
        String text="dfaaa";
        System.out.println("original text");
        System.out.println(text);
        System.out.println();
        System.out.println(encrypt(text, n));
        System.out.println(decrypt(text, n));


    }
    public static String  encrypt(String s,int n){
        s.toLowerCase();
        int c=0;
        int y=0;
        String new_str="";
        for (int i = 0; i < s.length(); i++) {
            c = (s.charAt(i) + n);
            if (c > 122) {
                c=  c-26;
            }
            y = (c - 122) % 26 + 122; // 1040 - это код буквы А, 32 - это кол-во букв
            new_str += (char) y; // получаем букву по коду

        }


        return new_str;
    }
    public static String decrypt(String s,int n){
        int c=0;
        int y=0;
        String new_str="";
        for (int i = 0; i < s.length(); i++) {
            c = (s.charAt(i));
            if (c < 97) {
                c=  c+26;
            }
            y = (c - 97) % 26 + 97; // 1040 - это код буквы А, 32 - это кол-во букв
            new_str += (char) y; // получаем букву по коду

        }


        return new_str;
        }



}

