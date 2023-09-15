package com.softserve.edu13.hw;

public class Hw01 {
    private static final String TEXT = "xyzabcdefghijklmnopqrstuvwxyz";

    private static char shift(char symbol, int position) {
        var ix = TEXT.indexOf(symbol);
        if (ix != -1) {
            return TEXT.charAt((ix + position) % TEXT.length());
        } else {
            return symbol;
        }
    }

    private static String encrypt(String string, int position) {
        string = string.toLowerCase();
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = shift(chars[i], position);
        }
        return String.valueOf(chars);
    }

    private static String decrypt(String codedString, int position) {
        char[] chars = codedString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = shift(chars[i], position);
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String string = "abc";
        int position = 3;

        var codedString = encrypt(string, position);
        var decodedString = decrypt(codedString, -position);

        System.out.println(string);
        System.out.println(codedString);
        System.out.println(decodedString);
    }
}
