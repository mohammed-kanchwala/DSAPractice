package com.mohammed.dsa.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSubArray {

    public static void printLongestIncSubArr(List<Integer> products) {
        int max = 1, len = 1, maxIndex = 0;

        int n = products.size();
        for (int i = 1; i < n; i++) {
            if (products.get(i) > products.get(i - 1))
                len++;
            else {
                if (max < len) {
                    max = len;
                    maxIndex = i - max;
                }
                len = 1;
            }
        }
        if (max < len) {
            max = len;
            maxIndex = n - max;
        }

        List<Integer> maxProductsArray = new ArrayList<>();
        int j = 0;
        for (int i = maxIndex; i < max + maxIndex; i++) {
            maxProductsArray.add(j, products.get(i));
            j++;
        }
        System.out.println(maxProductsArray);
        List<Integer> arr = new ArrayList<>();
        arr.add(maxProductsArray.get(0));
        for (int i = 1; i < maxProductsArray.size() - 1; i++) {
            arr.add(arr.get(i - 1) + 1);
        }
        System.out.println(arr.stream().reduce(Integer::sum).orElse(0));
    }

    public static void main(String[] args) {
        printLongestIncSubArr(Arrays.asList(5, 6, 3, 5, 7, 8, 9, 1, 2));
    }
}
