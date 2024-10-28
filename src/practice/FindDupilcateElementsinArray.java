package com.autobot.practice;

import java.util.HashSet;

public class FindDupilcateElementsinArray {

    public void solution(int a[]) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int c : a)
        {
            if (hs.add(c) == false)
            {
                System.out.println(c);

            }
        }
    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FindDupilcateElementsinArray fs = new FindDupilcateElementsinArray();
        int a[] = { 1, 2, 3, 2, 5, 4, 7, 8, 8, 9, 1, 2, 5, 1, 1, 1, 1, 2, 2, 2, 5, 5, 6, 5, 8, 7,
                10 };
        fs.solution(a);
    }

}
