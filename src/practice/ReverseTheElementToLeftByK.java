package com.autobot.practice;

public class ReverseTheElementToLeftByK {

    public static int[] Reverse(int a[], int start, int end)
    {
        while(start<=end) {
         int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        start++;
        end--;
        }
        return a;
    }

    public static int[] solution(int a[], int k) {
        if (k == 0 || k < a.length) {
            System.out.println("The number is greter that teh array size");
            return a;
        }
        int m = a.length - 1;
        int i = k + 1;
        int n = 0;
        Reverse(a, n, k);
        Reverse(a, i, m);
        Reverse(a, n, m);



            return a;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i : solution(a, 3)) {
            System.out.println(i);
        }

    }

}
