package com.autobot.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UnionOfTwoArrayInAscendingOrder {

    public static ArrayList<Integer> UnionOfTwoArrayInAscendingOrder(int a[], int b[]) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            hs.add(b[i]);

        }
        for (int j : hs) {
            al.add(j);

        }
        Collections.sort(al);
        return al;
    }

//optimize approch
    public static ArrayList<Integer> UnionOfTwoArrayIAscendingOrder1(int a[], int b[]) {
        ArrayList<Integer> al = new ArrayList<>();

        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;
        while (i < n && j < m)
        {
            if(a[i]<=b[j])
            {
                if(al.size()==0 || al.get(al.size()-1) !=a[i])
                {
                    al.add(a[i]);
                }
                i++;
            }
            else
            {
                if(al.size()==0 || al.get(al.size()-1) !=b[j])
                {
                    al.add(b[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (al.size() == 0 || al.get(al.size() - 1) != a[i]) {
                al.add(a[i]);
            }
            i++;
        }
        while (j < m) {
            {
                if (al.size() == 0 || al.get(al.size() - 1) != b[j]) {
                    al.add(b[j]);
                }
                j++;
            }
        }
        return al;

    }


    public static void main(String[] args) {

        int a[] = { 1, 4, 4, 5 };
        int b[] = { 2, 3, 4, 4, 6 };
//
//        for (int i : UnionOfTwoArrayInAscendingOrder.UnionOfTwoArrayInAscendingOrder(a, b)) {
//            System.out.println(i);
//        }

        for (int i : UnionOfTwoArrayIAscendingOrder1(a, b)) {
            System.out.println(i);
        }

    }

}
