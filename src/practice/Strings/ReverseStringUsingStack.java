package com.autobot.practice.Strings;

import java.util.Stack;

public class ReverseStringUsingStack {

    public static String ReverseStringUsingStack(String s) {
        Stack<Character> stack = new Stack<>();
        String ans = "";
        for(char c : s.toCharArray()) {
            stack.push(c);
        }
        for (int i = 0; i < s.length(); i++) {
            ans += stack.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(ReverseStringUsingStack("Aman Gupta"));

    }

}
