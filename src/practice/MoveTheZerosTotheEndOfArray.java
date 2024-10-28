package com.autobot.practice;

import java.util.ArrayList;

public class MoveTheZerosTotheEndOfArray {
//BruteForceApproch
    public int[] MoveTheZerosTotheEndOfArray(int a[]) {
        ArrayList<Integer> b = new ArrayList<>();
        for (int c : a) {
            if (c > 0) {
                b.add(c);
            }
        }
        for (int i = 0; i < b.size(); i++)
        {
            a[i] = b.get(i);
        }
        for (int i = b.size(); i < a.length; i++) {
            a[i] = 0;
        }
        return a;
    }

    // Optimize approch 2pointer approach
    public int[] MoveTheZerosTotheEndOfArray1(int a[]) {
        int j = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return a;

        }
        for (int i = j + 1; j < a.length; i++) {
            if (a[i] != 0) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j++;

            }
        }
        return a;

    }

//More optimize and EASY this will fail if we don't have any 0 in an array
    public static int[] MoveTheZerosToTheEndOfTheArray(int[] a) {
        int i = -1;
        int j = 0;
        while (i < a.length - 1 && j < a.length - 1) {
            if (a[j] != 0) {
                i++;
                a[i] = a[j];
                a[j] = 0;

            }
            j++;
        }

        return a;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 0, 1, 2, 0, 40, 0, 0, 0, 5, 0, 6, 0, 7, 0 };
        int c[] = { 1, 2, 3, 4 };

        for (int b : MoveTheZerosToTheEndOfTheArray(c)) {
            System.out.println(b);
    }

}
}
