package com.autobot.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindTheCommonElementInAaArray {

    // better Approch with set
    public static ArrayList<Integer> FindCommonElements(int arr[], int arr2[]) {
        HashSet<Integer> intSet = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int itr : arr) {
            intSet.add(itr);
        }
        for (int itr : arr2) {
            if (intSet.contains(itr) && !ans.contains(itr)) {
                ans.add(itr);
            }

        }
        return ans;
    }

    public static ArrayList<Integer> CommenElements(int arr[], int arr2[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(arr);
        int i = 0;
        int j = 0;
        while (i < arr.length && j < arr2.length) {
            if (ans.size() != 0 && arr[i] == ans.get(ans.size() - 1)) {
                i++;
            }
            if (ans.size() != 0 && arr2[j] == ans.get(ans.size() - 1)) {
                j++;
            }

            if (arr[i] == arr2[j]) {
                ans.add(arr[i]);
                i++;
                j++;
            } else if (arr[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args)// TODO Auto-generated method stub
{
int a[] = { 1, 2, 3, 4, 4, 5, 5, 6 };
int b[] = { 4, 4, 5, 6, 7, 8 };
for (int i : FindCommonElements(a, b))
{
    System.out.println(i);
}
    }


}
