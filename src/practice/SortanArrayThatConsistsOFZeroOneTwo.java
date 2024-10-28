package com.autobot.practice;

import java.util.ArrayList;

public class SortanArrayThatConsistsOFZeroOneTwo {

    // BruteForceApproch
    public static ArrayList<Integer> SortanArrayThatConsistsOFZeroOneTwo(int a[]) {
        ArrayList<Integer> al = new ArrayList<>();
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count_0++;
            }
            if (a[i] == 1) {
                count_1++;
            }
            if (a[i] == 2) {
                count_2++;
            }
        }
        for (int i = 0; i <= count_0; i++) {
            al.add(0);
        }
        for (int i = 0; i <= count_1; i++) {
            al.add(1);
        }
        for (int i = 0; i <= count_2; i++) {
            al.add(2);
        }
        return al;
    }

//Optimize solution
    public static int[] SortanArrayThatConsistsOFZeroOneTwo1(int a[]) {
        int low = 0;
        int high = a.length - 1;
        int mid = 0;
        int temp;

        while (mid <= high) {
            if (a[mid] == 0) {
                temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            } else if (a[mid] == 2) {
                temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;

            }
            else {
                mid++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 1, 2, 0, 0, 1, 0, 2, 1 };
        for (int i : SortanArrayThatConsistsOFZeroOneTwo1(a)) {
            System.out.println(i);
        }
    }

}
