package org.example;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        char[] word1Chars = word1.toCharArray();
        char[] word2Chars = word2.toCharArray();

        Arrays.sort(word1Chars);
        Arrays.sort(word2Chars);

        return Arrays.equals(word1Chars, word2Chars);
    }
}
