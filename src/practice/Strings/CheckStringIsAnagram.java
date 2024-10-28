package com.autobot.practice.Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckStringIsAnagram {

    public static boolean isStringAlagram(String s, String a) {
        char c[] = s.toCharArray();
        char d[] = a.toCharArray();
        HashMap<Character, Integer> hs = new HashMap<>();
        if (a.length() != s.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            int value = hs.getOrDefault(c[i], 0);
            hs.put(c[i], value + 1);

        }

        for (int i = 0; i < d.length; i++) {
            int value = hs.getOrDefault(d[i], 0);
            hs.put(d[i], value - 1);
        }

        for (Map.Entry<Character, Integer> cs : hs.entrySet()) {
            if (cs.getValue() > 0)
                return false;
        }
        return true;

    }

    public static boolean isStringAlagram1(String s, String a) {
        char[] s1 = s.toCharArray();
        char[] s2 = a.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }

    public static void main(String[] args) {

        isStringAlagram("abc", "acb");

    }

}
