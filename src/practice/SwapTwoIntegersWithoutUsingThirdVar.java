package com.autobot.practice;

public class SwapTwoIntegersWithoutUsingThirdVar {
//Without using 3rd Variable
    public void solution1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + "  " + b);
    }

    public void solution2(int a, int b) {
        int t;
        t = a;
        a = b;
        b = t;
        System.out.println(a + "  " + b);
    }

    public static void main(String[] args) {

        SwapTwoIntegersWithoutUsingThirdVar si = new SwapTwoIntegersWithoutUsingThirdVar();
        si.solution1(50, 55);
        si.solution2(50, 55);



    }

}
