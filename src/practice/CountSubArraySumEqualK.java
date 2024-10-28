package com.autobot.practice;

public class CountSubArraySumEqualK {
//better solution
    public static int CountSubArraySumEqualK(int a[], int target) {

        int count = 0;



        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = a[j] + sum;
                if (sum == target) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] a = { 3, 1, 2, 4 };
        System.out.println(CountSubArraySumEqualK(a, 6));
    }

}
