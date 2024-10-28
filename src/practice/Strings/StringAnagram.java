package com.autobot.practice.Strings;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram {

    public static boolean StringAnagram(String s, String s1) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != s1.length()) {
            return false;
        }
        char[] c = s.toCharArray();
        char[] c1 = s1.toCharArray();
        for (char itr : c) {
            int value = map.getOrDefault(itr, 0);
            map.put(itr, value + 1);
        }

        for (char itr : c1) {
            int value = map.getOrDefault(itr, 0);
            map.put(itr, value - 1);
        }

        for (Map.Entry<Character, Integer> hMapItr : map.entrySet()) {
            if (hMapItr.getValue() > 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println(StringAnagram("silen", "liste"));

    }

}
