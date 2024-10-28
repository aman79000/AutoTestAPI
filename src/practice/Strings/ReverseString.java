package com.autobot.practice.Strings;

public class ReverseString {

//With ForEach Loop
    public String reverseString(String a) {
        char[] c = a.toCharArray();
        String d = "";

        for (char f : c) {
            d = f + d;
        }
        return d;
    }

    // WithForLoop
    public String ReverseString(String a) {

        String reverse = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse = reverse + a.charAt(i);
        }
        return reverse;
    }

    // with String Buffer
    public StringBuffer reverseStringWithStringBuffer(String a) {
        StringBuffer sb = new StringBuffer(a);
        return sb.reverse();
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("Young"));
        System.out.println(rs.ReverseString("Young"));
        System.out.println(rs.reverseStringWithStringBuffer("Young"));

    }

}
