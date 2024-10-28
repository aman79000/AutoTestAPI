package com.autobot.practice.Strings;

import java.util.HashMap;

public class FindTheLongestSubStringBetweenSameChar {

    public static int solution(String s) {
        char c[] = s.toCharArray();
        int max = 0;
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            int value = hs.getOrDefault(c[i], 0);
            if (value == 0) {
                hs.put(c[i], i + 1);
        }
          else {
              int ans = i - value;
              if (ans > max) {
                  max = ans;
              }

          }
      }
      return max;
    }

    public static int solution(String s, String se) {
        if (!s.contains(se)) {
            return -1;
        }

        return s.indexOf(se);
    }

    public static void main(String[] args) {
        System.out.println(solution("aaabccabc", "abc"));

    }

}
