package com.autobot.practice.Strings;

public class FindTheLargestPalindromeicString {

    public static String FindTheLargestPalindromeicString(String s) {
       String output="";
for(int i=0;i<s.length();i++) {
    for (int j = s.length() - 1; j > i; j--) {
        String subString = s.substring(i,j);
        if (subString.equals(new StringBuilder(subString).reverse().toString())) {
            if (subString.length() > output.length()) {
                output = subString;
            }
        }
    }
}
return output;


    }

    public static void main(String[] args) {
        System.out.println(FindTheLargestPalindromeicString("forgeeksskeegfor"));

    }

}
