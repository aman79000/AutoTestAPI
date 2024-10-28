package com.autobot.practice;

public class FindTheLargestElementInTheArray {


    public void FindTheLargestElementInTheArray(int b[]) {
        int max = b[0];

        for (int i = 0; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }

        System.out.println(max); // Print the last element of the sorted array
    }


    public static void main(String[] args) {
        int a[] = { 40, 20, 50, 15, 17, 25 };
        FindTheLargestElementInTheArray fl = new FindTheLargestElementInTheArray();
        fl.FindTheLargestElementInTheArray(a);
    }

}
