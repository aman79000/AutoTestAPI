package com.autobot.practice;

import java.util.ArrayList;

public class FIndLeadersInAnArray {
    // BruteForceApproch
    public static ArrayList<Integer> FIndLeadersInAnArray(int a[]) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] < a[j]) {
                    flag = false;
                    break;
                }


            }
            if (flag) {
                al.add(a[i]);
            }

        }

        return al;
    }

    public static ArrayList<Integer> FindLeadersInAnArray1(int b[])
    {
        ArrayList<Integer>al =new ArrayList<>();
        int max=b[b.length-1];
        al.add(max);
        for(int i=b.length-1;i>=0;i--)
        {
            if (max < b[i]) {
                al.add(b[i]);
                max = b[i];
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int a[] = { 100, 89, 90, 70, 60, 61, 8, 9, 62 };
//        for (int i : FIndLeadersInAnArray.FIndLeadersInAnArray(a)) {
//            System.out.println(i);
//        }
        for (int i : FIndLeadersInAnArray.FindLeadersInAnArray1(a)) {
            System.out.println(i);
        }

    }

}
