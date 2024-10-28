package com.autobot.practice;

public class ImplementLowerBound {

    public static int ImplementLowerBound(int a[], int target) {// TODO Auto-generated constructor
                                                                // stub

        int low = 0;
        int high = a.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int a[] = { 5, 7, 8, 15, 19 };
        System.out.println(ImplementLowerBound(a, 5));

    }

}
