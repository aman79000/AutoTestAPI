package com.autobot.practice;

public class ReverseAWordInStringByIndex {

    public static void solution(String s, int index) {

        if(index>s.length()-1||index<=0) {
            System.out.println("invalid index");
        }
        String se[]= s.split(" ");
        String word = se[index-1];
        String reverseword=reverse(word);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<se.length;i++) {
            if((index-1) !=i) {
                sb.append(se[i]);
            }
            else {
                sb.append(reverseword);
            }
            if(i<se.length-1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);

    }

    public static String reverse(String s)
    {
        char []c=s.toCharArray();
        int start=0;
        int end=c.length-1;
        while(start<end) {
          char temp=  c[start];
          c[start]=c[end];
          c[end]=temp;
          start++;
          end--;
        }
        return new String(c);
    }

    public static void main(String[] args) {
        solution("Hello i am Aman", 4);

    }

}
