package com.mohammed.dsa.dynamic_programming.medium;

public class LongestPalindromeSubString {
    public static String longestPalindrome(String s) {
        int strLength = s.length();
        if (strLength < 2) {
            return s;
        }
        int resultLength = 0;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            // Odd length
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > resultLength) {
                    result = s.substring(l, r + 1);
                    resultLength = r - l + 1;
                }
                l -= 1;
                r += 1;
            }

            // Even length
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > resultLength) {
                    result = s.substring(l, r + 1);
                    resultLength = r - l + 1;
                }
                l -= 1;
                r += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
    }
}