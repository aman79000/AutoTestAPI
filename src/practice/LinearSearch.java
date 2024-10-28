package com.autobot.practice;

public class LinearSearch {

    public void LinearSearch(int a[], int elementToSearch) {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==elementToSearch)
            {
                System.out.println("The index of given element is " + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] a = { 77, 88, 65, 45, 85, 25, 65, 45, 96, 46 };
        ls.LinearSearch(a, 96);

    }

}
