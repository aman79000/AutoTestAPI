package com.autobot.practice;

public class FindDuplicateOnNPlusOneInteger {

    public static int solution(int[] a) {
   int b[] = new int[a.length+1];
   for(int i=0;i<a.length;i++)
   {
       if(b[a[i]]==0)
       {
           b[a[i]]+=1;

       }
       else {
           return a[i];
       }
   }
   return 0;
    }

    public static void main(String[] args) {
        int a[] = { 4, 3, 4, 5, 6 };
        System.out.println(solution(a));

    }

}
