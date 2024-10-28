package com.autobot.practice;

public class BinarySearch {

    public static int BinarySearch(int a[], int target) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
