package com.autobot.practice;

public class CheckIfTheArrayIsSorted {

    public void CheckIfTheArrayIsSorted(int a[]) {
        boolean sorted = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                sorted = false;
            }
        }
        if (!sorted) {
            System.out.println("The Array isn't sorted");
        } else {
            System.out.println("The Array is sorted");
        }

    }

    public static void main(String[] args) {
        CheckIfTheArrayIsSorted cs = new CheckIfTheArrayIsSorted();
        int a[] = { 1, 2, 3, 4, 5 };
        cs.CheckIfTheArrayIsSorted(a);

    }

}
