package com.autobot.practice;

public class moveTheZerosToStart {

    public static void moveTheZerosToStart(int arr[]) {
        int i;
        for (i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                break;
            }
        }

        for (int j = i; j >= 0; j--) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 0, 4, 0, 0, 4, 6, 0 };
        moveTheZerosToStart(arr);
        System.out.println("");

    }

}
