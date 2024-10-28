package com.autobot.practice;

public class TransposeTheMatrix {

    public static void solution(int a[][]) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        solution(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]);
            }
        }
    }

}
