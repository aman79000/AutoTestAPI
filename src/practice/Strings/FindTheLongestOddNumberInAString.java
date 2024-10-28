package com.autobot.practice.Strings;

public class FindTheLongestOddNumberInAString {

    public static String solution(String s) {
        char c[] = s.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            try {
            int num = Integer.parseInt(c[i] + "");

            if (num % 2 != 0) {

                return s.substring(0, i + 1);
            }
        }

        catch(NumberFormatException e) {
            return "[]";
        }
    }
        return "[]";
}



public static void main(String[]args){
    System.out.println(solution("1234a"));

}
}