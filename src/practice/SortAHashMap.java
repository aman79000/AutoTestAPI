package com.autobot.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortAHashMap {

    public static void SortAHashMap(List<Map.Entry<String, Integer>> hs) {

     hs.sort((a,b) ->{

         if(a.getValue()==b.getValue()) {
             return a.getKey().compareToIgnoreCase(b.getKey()) ;
         }

         return a.getValue() >b.getValue() ? 1:-1;
     });
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hs = new HashMap<>();
        ArrayList<Map.Entry<String, Integer>> al = new ArrayList<>(hs.entrySet());
        SortAHashMap(al);
    }

}
