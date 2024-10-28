package com.autobot.practice.Strings;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharacterOfAString {

    public static void PrintDuplicateCharacterOfAString(String s) {
        HashMap<Character, Integer> ans = new HashMap<>();
        char c[] = s.toCharArray();
        for (char itr : c) {
            int value = ans.getOrDefault(itr, 0);
            ans.put(itr, value + 1);
        }

        for (Map.Entry<Character, Integer> dup : ans.entrySet()) {
            if (dup.getValue() > 1) {
                System.out.println(dup.getKey());
            }
        }

    }

    public static void main(String[] args) {
        PrintDuplicateCharacterOfAString("aman");

    }

}
