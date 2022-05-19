package com.mohammed.dsa.arrays.medium;

import java.util.HashMap;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, true);
        }
        int longest = 0;

        for (int n : nums) {
            if (!map.get(n)) {
                continue;
            }
            map.put(n, false);
            int current = 1;
            int left = n - 1;
            int right = n + 1;
            while (map.containsKey(left)) {
                map.put(left, false);
                left--;
                current++;
            }
            while (map.containsKey(right)) {
                map.put(right, false);
                right++;
                current++;
            }
            longest = Math.max(longest, current);
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}));
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }
}
