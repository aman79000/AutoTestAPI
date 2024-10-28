package com.autobot.practice;

public class FindTheSumOfContigiousNumberEqualsToTarget {

    public static int[] FindTheSumOfContigiousNumberEqualsToTarget(int arr[], int target) {

        int i=0;
        int j=0;
        int sum=0;
         while(i<arr.length &&j<arr.length) {
             sum += arr[i];

             while (sum > target && j < i) {
                 sum -= arr[j];
                 j++;
             }
             if(sum==target) {
                 int ans[] = { j, i };
                 return ans;

             }
             i++;

         }
         while (sum > target && j < arr.length) {
             sum -= arr[j];
             if(sum==target) {
                 return new int[] { j + 1, i };
             }
             j++;
         }
         return null;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 5 };
        FindTheSumOfContigiousNumberEqualsToTarget(arr, 7);
    }

}
