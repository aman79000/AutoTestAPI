package com.autobot.practice;

public class RotateNMultipyNMatrixTo90degree {

    public static void reverse(int start, int end, int[][] a, int i) {
        while (start <= end) {
        int temp = a[i][start];
        a[i][start] = a[i][end];
        a[i][end] = temp;
        start++;
        end--;
    }


}

    public static void solution(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;

        }
    }
    for (int i = 0; i < a.length; i++) {
        reverse(0, a.length - 1, a, i);
    }
}

public static void main(String[] args) {
    int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
    solution(a);
    System.out.println(a);

}
}
