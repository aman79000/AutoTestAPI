package com.autobot.practice;

import java.util.Arrays;
import java.util.HashMap;

public class twoSumProblem {

    public static boolean twoSumProblem(int a[], int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] + a[j]) == target) {
                    System.out.println(a[i] + " " + a[j]);
                    return true;

                }
            }
        }
        System.out.println("-1  -1");
        return false;
    }

//better approach
    public static boolean twoSumProblem1(int a[], int target) {

        int j = 0;
        int i = 1;
        while (j < a.length - 1) {

            if ((a[i] + a[j]) == target) {
                System.out.println(a[i] + " " + a[j]);
                return true;
            }
            else if (i == a.length - 1) {
                j++;
                i = j;

            }
            i++;

        }
        System.out.println(-1 + " " + -1);
        return false;

    }

    // Better than above
    public static boolean twoSumProblem2(int a[], int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int i = 0;
        while (i < a.length) {
            int value = target - a[i];
            if (hs.containsKey(value)) {
                System.out.println(a[i] + " " + value);
                return true;
            }
            hs.put(a[i], i);
            i++;
        }
        System.out.println(-1 + " " + -1);
        return false;
    }

//Optimize
    public static boolean twoSumProblem3(int a[], int target) {
        Arrays.sort(a);
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            int sum = (a[i] + a[j]);
            if (sum == target) {
                System.out.println(a[i] + "  " + a[j]);
                return true;
            }
            else if (sum < target) {
            i++;
            } else {
            j--;
            }
        }
        System.out.println(-1 + " " + -1);
        return false;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        // twoSumProblem.twoSumProblem(a, 7);
        // twoSumProblem.twoSumProblem1(a, 11);
        // twoSumProblem.twoSumProblem2(a, 50);
        twoSumProblem.twoSumProblem3(a, 11);

    }

}
