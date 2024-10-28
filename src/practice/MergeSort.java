package com.autobot.practice;

import java.util.ArrayList;

public class MergeSort {

    public void merge(int arr[], int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
            temp.add(arr[left]);
            left++;
        }
        else {
            temp.add(arr[right]);
            right++;
        }
    }

    while (left <= mid) {
        temp.add(arr[left]);
        left++;
    }
    while (right <= high) {
        temp.add(arr[right]);
        right++;
    }

    for (int i = low; i <= high; i++) {
        arr[i] = temp.get(i - low);
    }

}

public int[] mergrSort(int arr[], int low, int high) {
    if (low >= high) {
        return arr;
    }
      int mid = (low+high)/2;
      mergrSort(arr,low,mid);
      mergrSort(arr,mid+1,high);
      merge(arr, low, mid, high);
      return arr;
  }



    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int arr[] = { 7, 4, 5, 3, 6, 8, 8, 0, 9 };
        m.mergrSort(arr, 0, arr.length - 1);
        System.out.println("");

    }

}
