package com.autobot.practice.Strings;

import java.util.ArrayList;
import java.util.HashSet;

public class FindTheDuplicateWordsinAString {

    public static ArrayList<String> FindTheDuplicateWordsinAString(String s) {
       HashSet<String> stringSet = new HashSet<>();
       ArrayList<String> ans = new ArrayList<>();
       String se[] = s.replaceAll("\\s+", " ").split(" ");
       for (String itr : se) {
           if (stringSet.add(itr) == false) {
               ans.add(itr);
           }
       }
       return ans;
   }
    public static void main(String[] args) {
        System.out.println(FindTheDuplicateWordsinAString("This is java This is not python"));

    }

}
