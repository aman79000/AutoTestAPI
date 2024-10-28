package com.autobot.practice.Strings;

public class ReverseTheWordInSentence {

    public static String ReverseTheWordInSentence(String s) {
        String se[] = s.replaceAll("\\s+", " ").split(" ");
        StringBuilder ans = new StringBuilder("");
        for (int i = se.length - 1; i >= 0; i--) {
            ans.append(se[i] + " ");
        }

        return ans.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(ReverseTheWordInSentence("Testing is    easy"));

    }

}
