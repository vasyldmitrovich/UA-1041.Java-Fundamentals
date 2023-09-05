package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Crypt {

    public static void main(String[] args) {
        String s = "abcxyz";
        String encryptS = encrypt(s, 27);
        System.out.println("Encrypted string: " + encryptS);
        String decryptS = decrypt(encryptS, 27);
        System.out.println("Decrypted string: " + decryptS);
    }

    public static String encrypt(String s, int n){
       char[] chars = s.toCharArray();
       n %= 25;
       for (int i = 0; i < chars.length; i++){
           int a = chars[i] + n;
           chars[i] = (char) (a > 122 ? a - 26 : a);
       }
       return new String(chars);
    }

    public static String decrypt(String s, int n){
        char[] chars = s.toCharArray();
        n %= 25;
        for (int i = 0; i < chars.length; i++){
            int a = chars[i] - n;
            chars[i] = (char) (a < 97 ? a + 26 : a);
        }
        return new String(chars);
    }
}