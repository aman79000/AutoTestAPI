package com.autobot.practice;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
//BruteForceApproach
    public int[] RemoveDuplicatesFromSortedArray(int[] a) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);



        }
        int j=0;
        for(int i:hs)
        {
            a[j++]= i;
        }
        return a;


    }

    // 2nd approch2 pointer but not optimize
    public int[] RemoveDuplicatesFromSortedArray1(int[] a) {
        int j = -1;
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] == a[i]) {
                j = i;

        for (int k = j + 1; k < a.length; k++) {
            if (a[j] != a[k]) {
                int temp = a[k];
                a[k] = a[j];
                a[j] = temp;
                j++;
            }
        }
    }
}
return a;
}

// 2pointer and optimized
public int[] RemoveDuplicatesFromSortedArray2(int[] a) {
int i = 0;
for (int j = 1; j < a.length; j++) {
    if (a[i] != a[j]) {
        a[i + 1] = a[j];
        i++;
    }

}
return a;

}




    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5, 6 };
        RemoveDuplicatesFromSortedArray rd = new RemoveDuplicatesFromSortedArray();
//        rd.RemoveDuplicatesFromSortedArray(a);
//        for (int i : rd.RemoveDuplicatesFromSortedArray(a)) {
//            System.out.println(i);
//        }
//        for (int j : rd.RemoveDuplicatesFromSortedArray1(a)) {
//            System.out.println(j);
//
//        }
        for (int j : rd.RemoveDuplicatesFromSortedArray2(a)) {
            System.out.println(j);

        }
    }
}


