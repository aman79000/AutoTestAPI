package com.autobot.practice;

import java.util.ArrayList;
import java.util.Collections;

public class RearrageElementBySign {

    public static int[] solution1(int a[]) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                pos.add(a[i]);
            } else {
                neg.add(a[i]);
            }
        }
        for(int j=0;j<a.length/2;j++)
        {
           a[j*2]=pos.get(j);
           a[j * 2 + 1] = neg.get(j);
        }
        return a;
    }

//Optimize solution
    public static ArrayList<Integer> solution(int a[]) {
        ArrayList<Integer> al = new ArrayList<>(Collections.nCopies(a.length, 0));

int neg=1;
int pos=0;
for (int i = 0; i < a.length; i++)
{
    if (a[i] > 0)
    {

        al.add(pos, a[i]);
        pos += 2;

    }
    else if (a[i] < 0) {
        al.add(neg, a[i]);
        neg += 2;
    }
}
return al;
}

    public static void main(String[] args) {
        int a[] = { 1, -3, 2, 7, -4, 5, -6, -8 };
        for (int i : solution1(a)) {
            System.out.println(i);
        }
//        for (int i : solution(a)) {
//            System.out.println(i);
//        }

    }

}
