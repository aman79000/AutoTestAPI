package com.autobot.practice.Strings;

public class CheckIfGiveStringIsPalindrome {

    public static boolean CheckIfGiveStringIsPalindrome(String s) {

        char c[] = s.toCharArray();
        int i = 0, j = c.length - 1;
        while (i < j) {
            if (c[i] != c[j]) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(CheckIfGiveStringIsPalindrome("aamaa"));

    }

}
