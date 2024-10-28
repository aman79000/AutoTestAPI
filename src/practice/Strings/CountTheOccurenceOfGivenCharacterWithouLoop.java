package com.autobot.practice.Strings;

public class CountTheOccurenceOfGivenCharacterWithouLoop {

    public static int CountTheOccurenceOfGivenCharacterWithouLoop(String s, String c) {
        return s.length() - s.replaceAll(c + "", "").length();
    }
    public static void main(String[] args) {
        System.out.println(CountTheOccurenceOfGivenCharacterWithouLoop("aman gupta", "m"));

    }

}
