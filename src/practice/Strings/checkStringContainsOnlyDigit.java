package com.autobot.practice.Strings;

public class checkStringContainsOnlyDigit {

    public static boolean checkStringContainsOnlyDigit(String s) {
        int len = s.length();
        int sub = s.length() - s.replaceAll("[^1-9]", "").length();
        if (sub == 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(checkStringContainsOnlyDigit("123a45"));

    }

}
