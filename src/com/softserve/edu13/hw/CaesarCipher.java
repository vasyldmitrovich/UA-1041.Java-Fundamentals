package com.softserve.edu13.hw;

import java.util.function.Function;

public class CaesarCipher {
    public  String encrypt(String text,int shift){
        return applyCipher(text,character -> encryptCharacter(character,shift));
    }
    public  String decrypt(String text,int shift){
        return applyCipher(text,character -> decryptCharacter(character,shift));
    }
    public static char encryptCharacter(char c, int shift) {
        char base = Character.isUpperCase(c) ? 'A' : 'a';
        return (char) (((c - base + shift) % 26) + base);
    }

    public static char decryptCharacter(char c, int shift) {
        char base = Character.isUpperCase(c) ? 'A' : 'a';
        return (char) (((c - base - shift + 26) % 26) + base);
    }

    public static String applyCipher(String text, Function<Character, Character> method) {
        StringBuilder sb = new StringBuilder();
        for (Character character : text.toCharArray()
        ) {
            if (Character.isLetter(character)) {
                char newChar = method.apply(character);
                sb.append(newChar);
            } else {
                sb.append(character);
            }
        }
        return sb.toString();
    }
}
