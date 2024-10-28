package com.autobot.practice;

import java.util.Arrays;
import java.util.HashSet;

public class FIndTheLongestConsecutiveNumberinArray {

    // Optimize Solution
    public static int FindTheLongestConsecutiveNumberinArray1(int arr[]) {
        HashSet<Integer> arrSet = new HashSet<>();
        int i=0;
        int count = 1;
        for (int itr : arr) {
            arrSet.add(itr);
        }
        while(i<arr.length) {
            if (arrSet.contains(arr[i] + 1)) {
                count++;
            }
        }

    }




///Better solution
    public static int  FIndTheLongestConsecutiveNumberinArray(int arr[]) {
        Arrays.sort(arr);
        int count = 1;
        int ans = 0;
        for (int i = arr.length - 1; i > 0; i--) {

            while (i > 0 && arr[i] == arr[i - 1]) {
                i--;
            }
            if (arr[i] - arr[i - 1] == 1) {
                count++;
            } else {

                count = 1;
            }
        }
        ans = Math.max(ans, count);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(
                FIndTheLongestConsecutiveNumberinArray(new int[] { 1, 9, 3, 3, 10, 4, 20, 2 }));

    }

}
