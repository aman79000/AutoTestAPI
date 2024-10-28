package com.autobot.practice.Strings;

import java.util.HashMap;

public class FindTheMaximumOccuringCharacterInString {
//not optimize
    public static void FindTheMaximumOccuringCharacterInString(String s) {
        int ans = 0;
        char c[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            int temp = s.length() - s.replaceAll(String.valueOf(c[i]), "").length();
            if (temp>ans) {
                ans=temp;
            }}
        System.out.println(ans);

    }

    public static String Solution2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char c[] = s.toCharArray();
        int temp = -1;
        StringBuilder ans = new StringBuilder("");
        for (char itr : c) {
            int value = map.getOrDefault(itr, 0);
            if (temp < value) {
                ans = new StringBuilder(String.valueOf(itr));
            }
            map.put(itr, value);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(Solution2("abmanb gbuptab"));

    }

}
