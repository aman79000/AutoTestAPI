package com.autobot.practice.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindTheFirstNonRepetingCharacterFromString {

    public static int FindTheFirstNonRepetingCharacterFromString(String s) {
        LinkedHashMap<Character, Integer> hs = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            int value = hs.getOrDefault(c, 0);
            hs.put(c, value + 1);
        }

        for (Map.Entry<Character, Integer> itr : hs.entrySet()) {
            if (itr.getValue() == 1) {
                return s.indexOf(itr.getKey());

            }
        }
        return -1;
    }

    public static void main(String[] args) {

        FindTheFirstNonRepetingCharacterFromString("geeksgeeks");


    }

}
