package com.mohammed.dsa.sliding_window.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        Map<Character, Integer> characterCount = new HashMap<>();
        int windowStart = 0;
        int result = 0;
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char endChar = s.charAt(windowEnd);
            characterCount.put(endChar, (characterCount.getOrDefault(endChar, 0) + 1));

            while ((windowEnd - windowStart + 1) - Collections.max(characterCount.values()) > k) {
                char startChar = s.charAt(windowStart);
                characterCount.put(startChar, characterCount.get(startChar) - 1);
                windowStart = windowStart + 1;
            }
            result = Math.max(result, windowEnd - windowStart + 1);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(characterReplacement("aabccbb", 2));
        System.out.println(characterReplacement("abbcb", 1));
        System.out.println(characterReplacement("abccde", 1));
        System.out.println(characterReplacement("", 1));
    }
}
