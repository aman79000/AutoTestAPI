package com.autobot.practice.Strings;

public class RemoveTheDigitsFormTheString {

    public static String RemoveTheDigitsFormTheString(String s) {
        char c[] = s.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (char c1 : c) {
            if (!Character.isDigit(c1)) {
                sb.append(c1);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(RemoveTheDigitsFormTheString("123aman456"));

    }

}
