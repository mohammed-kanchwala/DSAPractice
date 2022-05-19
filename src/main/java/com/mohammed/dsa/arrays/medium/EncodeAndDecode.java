package com.mohammed.dsa.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecode {
    public static String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String s : strs) {
            result.append(s.length()).append("#").append(s);
        }
        return result.toString();
    }

    public static List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            StringBuilder length = new StringBuilder();
            while (str.charAt(i) != '#') {
                length.append(str.charAt(i));
                i++;
            }
            int wordLength = Integer.parseInt(length.toString());
            i++;
            StringBuilder word = new StringBuilder();
            for (int j = i; j < wordLength + i; j++) {
                word.append(str.charAt(j));
            }
            decodedStrings.add(word.toString());
            i = i + wordLength - 1;
        }
        return decodedStrings;
    }

    public static void main(String[] args) {
        String encodedString = encode(Arrays.asList("neet", "code"));
        System.out.println(encodedString);
        System.out.println(decode(encodedString));
    }
}
