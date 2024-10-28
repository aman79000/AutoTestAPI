package com.autobot.practice;

import java.util.ArrayList;

public class AlternatepositiveAndNegativeNumberInArray {

    public static int[] solution(int b[]) {
        int neg = 1;
        int pos = 0;
        int[] a = new int[b.length];
        for (int i : b) {
            if (i > 0) {
                a[pos] = i;
                pos += 2;
            } else {
                a[neg] = i;
                neg += 2;
            }
        }
        return a;
    }

    // if the array have the positive or negative element more
    public static int[] solution2(int a[]) {
        int b[] = new int[a.length];
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i : a) {
            if (i > 0) {
                pos.add(i);
            } else {
                neg.add(i);
            }
        }

        if (neg.size() > pos.size()) {
            for (int i = 0; i < pos.size(); i++) {
                b[i * 2] = pos.get(i);
                b[(i * 2) + 1] = neg.get(i);

            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                b[index] = neg.get(i);
                index++;
            }
        }
        else {
            for (int i = 0; i < neg.size(); i++) {
                b[i * 2] = pos.get(i);
                b[(i * 2) + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                b[index] = pos.get(i);
                index++;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, -1, -2, -3, -4, 4 };
        int b[] = { 1, 2, 3, 4, -1, 6, 7, -9, -8 };
        for (int i : solution2(b)) {
            System.out.println(i);
        }

    }

}
