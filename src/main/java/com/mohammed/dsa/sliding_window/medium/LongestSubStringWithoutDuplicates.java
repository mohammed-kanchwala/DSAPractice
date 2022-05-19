package com.mohammed.dsa.sliding_window.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutDuplicates {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int l = 0;
        int result = 0;

        for (int r = 0; r < s.length(); r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            result = Math.max(result, r - l + 1);
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
