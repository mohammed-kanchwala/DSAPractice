package com.mohammed.dsa;

import java.util.HashMap;
import java.util.Map;

public class JPMorgan {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 8, 91, 22);
//
//        Integer max = list.stream().max(Integer::compareTo).get();
//
//        Integer secondMax =  list.stream().filter(x -> !Objects.equals(x, max)).toList().stream().max(Integer::compareTo).get();
//
//        list.stream().sorted();
//
//        System.out.println(max);
//        System.out.println(secondMax);
//        System.out.println(list.get(list.size()-2));

        String str = "JPMORGANCHASE";
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : str.toCharArray()) {

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.println(entry.getKey());
            }
        }

    }
}
