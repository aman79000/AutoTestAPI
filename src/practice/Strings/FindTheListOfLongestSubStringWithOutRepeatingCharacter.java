package com.autobot.practice.Strings;

import java.util.HashMap;

public class FindTheListOfLongestSubStringWithOutRepeatingCharacter {



    public static String FindTheListOfLongestSubStringWithOutRepeatingCharacter(String s) {
      int start=0;
      String ans="";
      HashMap<Character,Integer> charMap = new HashMap<>();
      for(int end=0;end<s.length();end++) {
          char currentChar = s.charAt(end);
          if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= start) {
              start = charMap.get(currentChar) + 1;
          }
          charMap.put(currentChar, end);

          if (end - start + 1 > ans.length()) {
              ans = s.substring(start, end + 1);
          }
      }
      return ans;
    }

    // n(2) solution
    public static String FindTheListOfLongestSubStringWithOutRepeatingCharacter1(String s) {

        char[] c = s.toCharArray();

        int i = 0;
        StringBuilder s1 = new StringBuilder("");
        String ans = "";
        while (i < c.length) {

            if (s1.toString().contains(c[i] + "") && s1.length() != 0) {
                if (s1.length() > ans.length()) {
                    ans = s1.toString();
                }
                int index = s1.toString().indexOf(c[i]);
                s1.delete(0, index + 1);

            }
            s1.append(c[i]);
            i++;
        }
        if (s1.length() > ans.length()) {
            ans = s1.toString();
        }

        return ans.toString();

    }

    public static void main(String[] args) {
        System.out.println(FindTheListOfLongestSubStringWithOutRepeatingCharacter("abcabcabcd"));

    }



}
