package com.autobot.practice;

public class QuickSort {

    public void swap(int arr[], int startIndex, int endIndex) {
        int temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
    }

    public int partiation(int arr[], int startIndex, int endIndex) {
        int i = startIndex;
        int j = endIndex;
        int privot = arr[startIndex];
        while (i < j) {

            while (i <= endIndex - 1 && arr[i] <= privot) {
                i++;
            }
            while (j >= startIndex + 1 && arr[j] > privot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, startIndex, j);

        return j;
    }

    public void qs(int arr[], int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int part = partiation(arr, lowIndex, highIndex);
            qs(arr, part + 1, highIndex);
            qs(arr, lowIndex, part - 1);
        }
    }

    public void quickSort(int arr[]) {
        qs(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        int []arr= {6,5,3,5,3,54,33,0};
        q.quickSort(arr);
        System.out.println("");

    }

}
