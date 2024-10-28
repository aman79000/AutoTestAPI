package com.autobot.practice.Strings;

import java.util.Stack;

public class ChackForBalancedParanthis {

    public ChackForBalancedParanthis() {
        class Solution {
            public boolean isValid(String s) {
                Stack<Character> stack = new Stack<>();
                for(char itr:s.toCharArray()){
                    if (itr == ')' && stack.size() != 0) {
                        if (stack.peek() != '(') {
                            return false;
                        }
                        stack.pop();

                    }
                    else if (itr == '}' && stack.size() != 0) {
                        if (stack.peek() != '{') {
                        return false;
                    }
                        stack.pop();

                    }
                    else if (itr == ']' && stack.size() != 0) {
                        if (stack.peek() != '[') {
                        return false;
                    }
                        stack.pop();

                    }
                    else{
                        stack.push(itr);
                    }
                }
                if (stack.empty()) {
                return true;
                }
                return false;
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
