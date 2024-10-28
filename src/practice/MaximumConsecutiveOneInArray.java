package com.autobot.practice;

public class MaximumConsecutiveOneInArray {

    public void MaximumConsecutiveOneInArray(int a[]) {

        int value = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == 1) {
                count++;
            }

            else if (a[i] == 0) {
                count = 0;
            }
            value = Math.max(value, count);
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        int[] a = { 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1,
                1, 1, 1 };
        MaximumConsecutiveOneInArray mc = new MaximumConsecutiveOneInArray();
        mc.MaximumConsecutiveOneInArray(a);
    }

}
