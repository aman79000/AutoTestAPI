package com.autobot.practice.Strings;

public class StringManupulation {



    public static void main(String[] args) {

        String str = "The Rain IS Started Here in Sandiago";

        // Find the length of a String
        str.length();
        // Find the index of a String
        // Suppose you want to find the index of S
        str.indexOf("S");
        // Suppose you want to find the index of a specific string like "Here"
        System.out.println(str.indexOf("Here"));
        // Suppose you want to find the index of the third S
        System.out.println(str.indexOf("S", str.indexOf("S", (str.indexOf("S") + 1)) + 1));

        // Find the index of S that appeared at last of a String
        System.out.println(str.lastIndexOf("S"));
        // Suppose you want to Rain from the above string so we can sub string
        System.out.println(str.substring(str.indexOf("R"), str.indexOf("n")));

        // Replace -- from // in the below Date string
        String Date = "01-12-2024";
        System.out.println(Date.replace('-', '/'));
        // Replace -- from // and also replace 24 to 34
        System.out.println(Date.replace('-', '/').replace("24", "35"));

        // Split the below String from _ in to different strings
        String S = "Milka_is_a_fast_runner";
        String t[];
        t = S.split("_");
        for (String s : t) {
            System.out.println(s);

        }

        // Question for interview

        // There are 4 variables 2 is integer and 2 is string

        String a = "Automation";
        String b = "Testing";
        int c = 100;
        int d = 200;
        // What would be the expected output for this
        System.out.println(a + b + c + d);
        // Ans- In jave it all the mathimatical expression starts from left to right;
        // So the ans would be
        // AutomationTesting100200;

        // if you want to add c and d in the above we have to add the brackets
        System.out.println(a + b + (c + d));
        // Now the output will be AutomationTesting300
        System.out.println(c + d + a + b);
        // The output will be 300AutomationTesting

    }

}
