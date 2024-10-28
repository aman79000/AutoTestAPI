package com.autobot.practice.Strings;

public class KadaneAlgorithmMaximumSubArraySumInAnArray {

    public static int solution(int a[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            if (sum <= 0) {
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        return max;

    }


    public static void main(String[] args) {
        int a[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int b[] = { 4 };
        System.out.println(solution(b));
    }

}
