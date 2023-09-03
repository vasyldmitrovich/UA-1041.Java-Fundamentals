package com.softserve.edu13.hw.task_1;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int ALPHABET_SIZE = 26;

    public static void main(String[] args) {
        System.out.println("Enter some text:");
        String text = SCANNER.nextLine();
        System.out.println("Enter key:");
        int key = Integer.parseInt(SCANNER.nextLine());
        String encryptText = encrypt(text, key);
        System.out.println("encrypt text:" + encryptText);
        String decryptText = decrypt(encryptText, -key);
        System.out.println("encrypt text:" + decryptText);

    }


    private static String encrypt(String text, int key) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Shift(chars[i], key);
        }
        return String.valueOf(chars);
    }

    private static String decrypt(String encryptText, int key) {
        char[] chars = encryptText.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Shift(chars[i], key);
        }
        return String.valueOf(chars);
    }

    private static char Shift(char ch, int key) {
        return (char) ((ch - 'a' + key + 100 * ALPHABET_SIZE)
                % ALPHABET_SIZE + 'a');
    }

}

