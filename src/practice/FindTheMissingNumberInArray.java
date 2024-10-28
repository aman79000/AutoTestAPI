package com.autobot.practice;

public class FindTheMissingNumberInArray {

    // Givern the integer N and an array of size N-1 numbers between 1 to N .Find
    // the number (between 1 to N ) that is not present in the given array



    // BruteForce Approach
    public void solution2(int a[]) {

        for (int i = 1; i < a.length; i++) {
            int flag = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("The Missing number is " + i);
                break;
            }
        }
    }

    // Optimize Approach with Formula
    public void solution3(int a[]) {
        int j = 0;
        int k = a.length + 1;
        k = (k * (k + 1)) / 2;
        for (int i : a) {
            j = j + i;
        }
        k = k - j;

        System.out.println("The Missing number is " + k);
    }

    public static void main(String[] args) {
        FindTheMissingNumberInArray fs = new FindTheMissingNumberInArray();
        int a[] = { 1, 2, 3, 4, 5, 6, 10, 8, 9 };
        // TODO Auto-generated method stub
        fs.solution3(a);

    }

}
