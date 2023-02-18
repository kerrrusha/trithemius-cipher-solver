package com.kerrrusha;

import java.util.List;

import static com.kerrrusha.Util.*;
import static com.kerrrusha.Util.Algorithm.*;
import static com.kerrrusha.Util.Operation.*;
import static java.lang.Math.abs;

public class Main {

    private static final List<Pair> alphabet = CUSTOM_ALPHABET;

    public static void main(String[] args) {
        Algorithm algorithm = FREE_TEXT;
        String data = "ишсхвябх";

        String crypted = solveCipher(data, algorithm, CRYPTING);

        System.out.println("Data: " + data);
        System.out.println("Crypted data: " + crypted);

        System.out.println();

        String decrypted = solveCipher(data, algorithm, DECRYPTING);

        System.out.println("Data: " + data);
        System.out.println("Decrypted data: " + decrypted);
    }

    private static String solveCipher(String input, Algorithm algorithm, Operation operation) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int charIndexFromAlphabet = getCharIndexByChar(ch);

            int x = getCryptingKey(i + 1, algorithm);

            int resultCharIndexFromAlphabet = getResultCharIndexFromAlphabet(charIndexFromAlphabet, x, operation);
            char resultChar = getCharByIndex(resultCharIndexFromAlphabet);
            result.append(resultChar);
        }
        return result.toString();
    }

    private static int getResultCharIndexFromAlphabet(int charIndexFromAlphabet, int x, Operation operation) {
        if (operation == CRYPTING) {
            return mod(charIndexFromAlphabet + x, alphabet.size());
        }
        return mod(charIndexFromAlphabet - x, alphabet.size());
    }

    private static int getCryptingKey(int numOfChar, Algorithm algorithm) {
        if (algorithm == FREE_TEXT) {
            return getFreeTextCryptingKey(numOfChar);
        }
        if (algorithm == NON_LINEAR) {
            return getNonLinearCryptingKey(numOfChar);
        }
        return getLinearCryptingKey(numOfChar);
    }

    private static int getFreeTextCryptingKey(int numOfChar) {
        final String text = "причал";
        int numOfCharToChoose = mod(numOfChar, text.length()) - 1;
        char ch = text.charAt(numOfCharToChoose);
        return getCharIndexByChar(ch);
    }

    private static int mod(int i, int toInclusive) {
        if (i >= 1 && i <= toInclusive) {
            return i;
        }
        if (i < 1) {
            return mod(toInclusive - abs(1 - i) + 1, toInclusive);
        }
        return mod(i % toInclusive, toInclusive);
    }

    private static char getCharByIndex(int index) {
        return alphabet
                .stream()
                .filter(e -> e.index == index)
                .map(e -> e.ch)
                .findFirst()
                .orElse('\0');
    }

    private static int getCharIndexByChar(char ch) {
        return alphabet
                .stream()
                .filter(e -> e.ch == ch)
                .map(e -> e.index)
                .findFirst()
                .orElse(-1);
    }

    private static int getLinearCryptingKey(int charNumber) {
        return (3 * charNumber + 1) % alphabet.size();
    }

    private static int getNonLinearCryptingKey(int charNumber) {
        int key = 8 * charNumber * charNumber + 4 * charNumber + 9;
        return mod(key, alphabet.size());
    }

}
