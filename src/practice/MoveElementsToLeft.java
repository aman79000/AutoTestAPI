package com.autobot.practice;

import java.util.ArrayList;

public class MoveElementsToLeft {
    // This is the progam to move the firt element to left

    public void MoveOneElementsToLeft(int a[]) {
        int temp = a[0];
        for (int i = 0; i < a.length - 1; i++)
        {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = temp;
        for (int b : a)
            System.out.println(b);
    }

    public void MoveElementsToLeft(int a[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int k = 0;
        for (int j = 0; j < n; j++) {
            al.add(a[j]);
        }
        for (int i = n; i < a.length; i++) {
            a[k] = a[i];
            k++;
        }
    }

    public static void main(String[] args) {
        MoveElementsToLeft ls = new MoveElementsToLeft();
        int[] a = { 77, 88, 65, 45, 85, 25, 65, 45, 96, 46 };
        ls.MoveElementsToLeft(a, 3);

    }

}
