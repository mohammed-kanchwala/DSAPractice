package com.mohammed.dsa.arrays.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (Objects.equals(s, t)) return true;
        if (s.length() != t.length()) return false;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.merge(s.charAt(i), 1, Integer::sum);
            tMap.merge(t.charAt(i), 1, Integer::sum);
        }
        for (Character c : sMap.keySet()) {
            if (!sMap.get(c).equals(tMap.get(c))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }
}
