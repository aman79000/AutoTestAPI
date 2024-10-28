package com.autobot.practice;

public class MultiplicationofMatrix {

    public static int multi(int a[][], int b[][], int x)
    {
        int sum=0;
            for(int col=0;col<a.length;col++)
            {
          int product= a[x][col]*b[col][x];
           sum=product+sum;

            }
            return sum;
        }



    public static int[][] MultiplicationofMatrix(int a[][], int b[][]) {
        int c[][] = new int[a.length][a[0].length];
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                c[row][col] = multi(a, b, row);

            }
        }
        return c;

    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(MultiplicationofMatrix(a, b));

    }

}
