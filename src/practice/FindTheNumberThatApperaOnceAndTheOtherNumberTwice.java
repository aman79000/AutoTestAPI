package com.autobot.practice;

import java.util.HashMap;
import java.util.Map;

public class FindTheNumberThatApperaOnceAndTheOtherNumberTwice {

//BruteForceApproach
    public static int FindTheNumberThatApperaOnceAndTheOtherNumberTwice(int a[]) {

        for (int i = 0; i < a.length; i++)

        {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;

                }
            }
            if (count == 1) {
                return a[i];
            }
        }
        return -1;
    }

    // Betterone
    public static int FindTheNumberThatApperaOnceAndTheOtherNumberTwice1(int a[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int value = hm.getOrDefault(a[i], 0);
            hm.put(a[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> mp : hm.entrySet()) {
            if (mp.getValue() == 1) {
                return mp.getKey();
            }
        }
        return -1;

    }

    // Optimize approach
    public static int FindTheNumberThatApperaOnceAndTheOtherNumberTwice2(int a[]) {
        int xor = 0;
        for (int i = 0; i < a.length; i++) {
            xor = xor ^ a[i];
        }
        return xor;
    }

    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 5, 6 };

        System.out.println(FindTheNumberThatApperaOnceAndTheOtherNumberTwice
                .FindTheNumberThatApperaOnceAndTheOtherNumberTwice(a));

        System.out.println(FindTheNumberThatApperaOnceAndTheOtherNumberTwice
                .FindTheNumberThatApperaOnceAndTheOtherNumberTwice1(a));
        System.out.println(FindTheNumberThatApperaOnceAndTheOtherNumberTwice
                .FindTheNumberThatApperaOnceAndTheOtherNumberTwice2(a));
    }

}
