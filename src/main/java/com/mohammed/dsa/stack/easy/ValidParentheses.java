package com.mohammed.dsa.stack.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    static boolean isValidParenthesesArray(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpenMap = new HashMap<>();
        closeToOpenMap.put(')', '(');
        closeToOpenMap.put('}', '{');
        closeToOpenMap.put(']', '[');

        for (Character c : s.toCharArray()) {
            if (closeToOpenMap.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpenMap.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValidParenthesesArray("()[]{}"));
    }
}
