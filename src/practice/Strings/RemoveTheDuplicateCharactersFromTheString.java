package com.autobot.practice.Strings;

import java.util.HashMap;

public class RemoveTheDuplicateCharactersFromTheString {

    public static String RemoveTheDuplicateCharactersFromTheString(String s) {
        char c[] = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder("");
        for (char itr : c) {
            int value = map.getOrDefault(itr, 0);
            if (value == 0) {
                sb.append(itr);
            }
            map.put(itr, value + 1);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(RemoveTheDuplicateCharactersFromTheString("aman"));

    }

}
