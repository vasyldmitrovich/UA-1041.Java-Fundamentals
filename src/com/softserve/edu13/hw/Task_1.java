package com.softserve.edu13.hw;

import java.util.Arrays;

public class Task_1 {

    private static String encrypt(String textToEncrypt, int key) {
        char[] chars = textToEncrypt.toCharArray();
        for (int i = 0; i < textToEncrypt.length(); i++) {
            chars[i] = charNumber(chars[i], key);
        }
        return String.valueOf(chars);
    }

    private static String decrypt(String textToDecrypt, int key) {
        char[] chars = textToDecrypt.toCharArray();
        for (int i = 0; i < textToDecrypt.length(); i++) {
            chars[i] = charNumber(chars[i], key);
        }
        return String.valueOf(chars);
    }

    private static char charNumber(char ch, int key) {
        key = 3;
        int len = Alphabet.values().length;
        return (char) (ch - 'z' + 'a' + key + len);
    }

    enum Alphabet {
        A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
    }
}
