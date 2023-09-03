package com.softserve.edu13.hm;

import java.lang.reflect.Array;

public class Ceasar {
    public static String encrypt(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char next = str.charAt(i);
            if (next == 'z' && n == 1) {
                result.append('a');
            } else {
                char encryptedChar = (char) (next + n);

                if ((next >= 'a' && next <= 'z' && encryptedChar > 'z') ||
                        (next >= 'A' && next <= 'Z' && encryptedChar > 'Z')) {
                    encryptedChar -= 26;
                }

                result.append(encryptedChar);
            }
        }

        return result.toString();
    }


        public static String decrypt(String str, int n){
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char next = str.charAt(i);
                if (next == 'a' && n == 1) {
                    result.append('z');
                } else {
                    char decryptedChar = (char) (next - n);
                    if ((next >= 'a' && next <= 'z' && decryptedChar < 'a') ||
                            (next >= 'A' && next <= 'Z' && decryptedChar < 'A')) {
                        decryptedChar += 26;
                    }

                    result.append(decryptedChar);
                }
            }
            return result.toString();
        }





}
