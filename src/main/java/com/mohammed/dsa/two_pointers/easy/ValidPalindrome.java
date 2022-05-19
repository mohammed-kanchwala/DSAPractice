package com.mohammed.dsa.two_pointers.easy;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reverseString = new StringBuilder(s).reverse();
        return s.equals(reverseString.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
