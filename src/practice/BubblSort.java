package com.autobot.practice;

public class BubblSort {

    public static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
