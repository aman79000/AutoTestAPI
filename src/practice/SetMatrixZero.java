package com.autobot.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {

    public static ArrayList<ArrayList<Integer>> row(ArrayList<ArrayList<Integer>> a, int row,
            int n) {
        for (int j = 0; j < n; j++) {
            a.get(row).set(j, -1);
        }
        return a;
    }

    public static ArrayList<ArrayList<Integer>> col(ArrayList<ArrayList<Integer>> a, int col,
            int m) {
        for (int j = 0; j < m; j++) {
            a.get(j).set(col, -1);
        }
        return a;
    }

    // BruteForce Solution
    public static ArrayList<ArrayList<Integer>> Solution(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        int m = a.get(0).size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a.get(i).get(j) == 0) {
                    row(a, i, n);
                    col(a, j, m);
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a.get(i).get(j)==-1)
                {
                    a.get(i).set(j, 0);
                }
            }
        }
        return a;

    }

//Better Solution
    public static ArrayList<ArrayList<Integer>> solution(ArrayList<ArrayList<Integer>> a) {
        int col[] = new int[a.get(0).size()];
        int row[] = new int[a.size()];
        int m = a.size();
        int n = a.get(0).size();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if (a.get(i).get(j) == 0)
                {
                    col[j] = 1;
                    row[i]=1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (col[j] == 1 || row[i] == 1) {
                    a.get(i).set(j, 0);
                }
            }

    }
        return a;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        al.add(new ArrayList<>(Arrays.asList(1, 1, 0, 1)));
        al.add(new ArrayList<>(Arrays.asList(1, 1, 1, 0)));
        al.add(new ArrayList<>(Arrays.asList(1, 0, 1, 1)));
        al.add(new ArrayList<>(Arrays.asList(1, 1, 1, 1)));
        Solution(al);

        for (int i = 0; i < al.size(); i++) {
            System.out.println("");
            for (int j = 0; j < al.get(i).size(); j++) {
                System.out.print(al.get(i).get(j));
            }
        }
    }

}
