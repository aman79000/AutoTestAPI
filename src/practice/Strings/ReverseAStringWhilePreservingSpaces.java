package com.autobot.practice.Strings;

public class ReverseAStringWhilePreservingSpaces {

    // The questing means to say if the input is "Aman Gupta".The Output would be
    // "atpu GnamA".The Spaces places would be same

//Optimize Solution
    public static String ReverseAStringWhilePreservingSpaces(String s) {

        char c[]=s.toCharArray();
        int i = 0, j = c.length - 1;
        while(i<j) {
            if(c[i]==' ') {
                i++;
            }
            else if (c[j] == ' ') {
                j--;
            } else {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
    }
    return new String(c);



    }

    public static void main(String[] args) {
        System.out.println(ReverseAStringWhilePreservingSpaces("Aman Gupta"));

    }

}
