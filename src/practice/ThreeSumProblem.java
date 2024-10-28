package com.autobot.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumProblem {

    public static ArrayList<ArrayList<Integer>> ThreeSumProblem(int a[], int target) {
        Arrays.sort(a);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {

            if (i != 0 && a[i] == a[i - 1]) {
                continue;

            }
            int j = i + 1;
            int k = a.length - 1;
            while(j<k)
            {

                int sum = a[i] + a[j] + a[k];
                if (sum == target) {
                    al.add(new ArrayList<>(Arrays.asList(a[i], a[j], a[k])));
                    j++;
                    k--;
                }
                else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
                while (j < k && a[j] == a[j - 1]) {
                    j++;
                }
                if (k < a.length - 1) {
                    while (j < k && a[k] == a[k + 1])
                {
                    k--;
                }
            }
        }

        }
        return al;


    }



    public static void main(String[] args) {
        // int[] a = { 12, 3, 4, 1, 6, 9 };
        int a[] = { 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5 };
        int b[] = { -1, 0, 1, 2, -1, -4 };
        for (ArrayList<Integer> i : ThreeSumProblem(a, 12)) {
            System.out.println(i);
        }
    }


}
