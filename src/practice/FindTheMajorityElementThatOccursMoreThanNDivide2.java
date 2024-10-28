package com.autobot.practice;

import java.util.HashMap;
import java.util.Map;

public class FindTheMajorityElementThatOccursMoreThanNDivide2 {
//Better approch but it willl work if the array ahve multiple elements by n/2 times
    public static void solution(int a[]) {
        HashMap<Integer,Integer>hs = new HashMap<>();
        int n=a.length;
        int value;
        for(int i=0;i<a.length;i++)
        {
            value = hs.getOrDefault(a[i], 0);
                hs.put(a[i],value+1);

        }

        for(Map.Entry<Integer,Integer>it:hs.entrySet())
        {
            if(it.getValue()>n/2)
            {
                System.out.println(it.getKey());
            }
        }

    }

    // Optimize approch nut it only works with if the array have only one element
    public static int FindTheMajorityElementThatOccursMorethanNDivide2(int a[]) {
        int n = a.length / 2;
        int count = 0;
        int i = 0;
        int j = 0;
        int count1 = 0;
        while (i < a.length && j < a.length) {
            if (count == 0) {
                i = j;
                j++;
                count++;

            } else if (a[i] == a[j]) {
                count++;
                j++;
            }

            else {
                count--;
                j++;

            }
        }

        for (int k = 0; k < a.length; k++) {
            if (a[i] == a[k]) {
                count1++;
                System.out.println(a[i]);
            }
        }
        if (count1 > n) {
            return a[i];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 1, 1, 2, 5, 6, 7, 7 };
        int b[] = { 1, 1, 1, 2, 5, 6, 1, 7, 7, 1 };
        System.out.println(FindTheMajorityElementThatOccursMorethanNDivide2(b));

    }

}
