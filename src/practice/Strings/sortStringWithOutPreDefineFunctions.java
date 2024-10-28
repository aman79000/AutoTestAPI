package com.autobot.practice.Strings;

public class sortStringWithOutPreDefineFunctions {

    public static String sortStringWithOutPreDefineFunctions(String s) {
        char c[] = s.toCharArray();
        for(int i=0;i<c.length;i++) {
            for(int j=i;j<c.length;j++) {
                if (c[i] > c[j]) {
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        return new String(c);
    }

    public static void main(String[] args) {
        System.out.println(sortStringWithOutPreDefineFunctions("zxcvbnmlkjhgfdsa"));
        // sortStringWithOutPreDefineFunctions("zxcvbnmlkjhgfdsa");

    }

}
