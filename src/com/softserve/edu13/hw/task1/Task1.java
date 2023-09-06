package com.softserve.edu13.hw.task1;

public class Task1 {

    public static void main(String[] args) {

        String message = "hello World!";

        String encrypted = encrypt(message, 2);


        System.out.println("Message:" + message);
        System.out.println("Encrypted:" + encrypted);
        System.out.println("Decrypted:" + decrypt(encrypted, 2));

    }

    public static String encrypt(String s, int n) {
        var builder = new StringBuilder();

        var chars = s.toCharArray();

        for (var c : chars) {
            if (Character.isLetter(c)) {
                char shift = Character.isUpperCase(c) ? 'A' : 'a';

                char newC = (char) ((c + n - shift + 100 * 26) % 26 + shift);
                builder.append(newC);
            } else {
                builder.append(c);
            }
        }

        return builder.toString();
    }

    public static String decrypt(String s, int n) {


        return encrypt(s, -n);
    }
}
