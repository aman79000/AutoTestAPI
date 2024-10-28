package com.autobot.practice.Strings;

public class ReverseAStringatSamePlace {

    public static void solution(String s) {

        String []se=s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String str:se)
        {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            result.append(sb).append(" ");

        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        solution("Hello World");

    }

}
