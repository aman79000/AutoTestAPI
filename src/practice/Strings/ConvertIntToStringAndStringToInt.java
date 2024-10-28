package com.autobot.practice.Strings;

public class ConvertIntToStringAndStringToInt {

    public static String ConvertIntToString(int n) {
        return String.valueOf(n);
    }

    public static int ConvertStringToInt(String s) {
        return Integer.valueOf(s);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(ConvertIntToString(5));
        System.out.println(ConvertStringToInt("6"));
    }

}
