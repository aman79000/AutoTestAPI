package com.autobot.practice;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {



        public static int titleToNumber(String columnTitle) {

            int result = 0;
            for (int i = 0; i < columnTitle.length(); i++) {
                char charAtPosition = columnTitle.charAt(i);
                result = result * 26 + (charAtPosition - 'A' + 1);
            }
            return result;
        }

        public static char findTheDifference(String s, String t) {
            HashMap<Character, Integer> hs = new HashMap<>();
            for (char c : t.toCharArray()) {
                int value = hs.getOrDefault(c, 0);
                hs.put(c, value + 1);
            }
            for (char c : s.toCharArray()) {
                int value = hs.getOrDefault(c, 0);
                hs.put(c, value - 1);
            }
            for (Map.Entry<Character, Integer> mp : hs.entrySet()) {
                if (mp.getValue() == 1) {
                    return mp.getKey();
                }
            }
            return 0;
        }



    public static void main(String[] args) {
        System.out.println(findTheDifference("a", "aa"));
    }

}
