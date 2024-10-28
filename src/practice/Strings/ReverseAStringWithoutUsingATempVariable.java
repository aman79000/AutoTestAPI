package com.autobot.practice.Strings;

public class ReverseAStringWithoutUsingATempVariable {

    public static String ReverseAStringWithoutUsingATempVariable(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(ReverseAStringWithoutUsingATempVariable("Aman"));

    }

}
