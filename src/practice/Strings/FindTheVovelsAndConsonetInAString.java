package com.autobot.practice.Strings;

public class FindTheVovelsAndConsonetInAString {

    public static void FindTheVovelsAndConsonetInAString(String s) {

        int vov = 0;
        int con = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vov++;
            } else {
                con++;
            }
        }
        System.out.println("The total vovels are " + vov + "The total consonent are " + con);
    }

    public static void main(String[] args) {
        FindTheVovelsAndConsonetInAString("AeIou");
    }

}
