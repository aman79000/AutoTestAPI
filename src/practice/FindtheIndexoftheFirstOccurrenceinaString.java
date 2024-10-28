package com.autobot.practice;

public class FindtheIndexoftheFirstOccurrenceinaString {

    public static int solution(String s, String se) {
        if (!s.contains(se)) {
            return -1;
        }

        return s.indexOf(se);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
