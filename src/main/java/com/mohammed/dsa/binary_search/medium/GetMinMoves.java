package com.mohammed.dsa.binary_search.medium;

import java.util.Arrays;
import java.util.List;

public class GetMinMoves {
    static int getMinMoves(List<Integer> plates) {
        int min_element = Integer.MAX_VALUE;
        int max_element = Integer.MIN_VALUE;
        int min_ind = -1;
        int max_ind = -1;
        int size = plates.size() - 1;
        for (int i = 0; i < size; i++) {
            if (plates.get(i) <= min_element) {
                min_element = plates.get(i);
                min_ind = i;
            }
            if (plates.get(i) > max_element) {
                max_element = plates.get(i);
                max_ind = i;
            }
        }
        if (max_ind == min_ind) {
            return 0;
        } else if (max_ind > min_ind) {
            return max_ind + (size - min_ind - 2);
        } else {
            return max_ind + (size - min_ind - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getMinMoves(Arrays.asList(3, 2, 1)));
    }
}
