package com.autobot.practice;

public class StockBuyAndSell {
//BruteFOrceSoltion
    public static int StockBuyAndSell(int a[]) {

        int b = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i]  <a[j]) {

                    b = Integer.max(b, a[j] - a[i]);
                }
            }
        }

        return b;
    }

//optimize solution
    public static int StockBuyAndSell1(int a[])
    {
        int min= Integer.MAX_VALUE;
        int maxPro=0;

        for(int i=0;i<a.length;i++)
        {
            min=Math.min(a[i], min);
            maxPro=Math.max(maxPro, a[i]-min);
    }
        return maxPro;
    }
    public static void main(String[] args) {

        int[] a = { 7, 5, 3, 6, 4, 1, 2 };

        System.out.println(StockBuyAndSell.StockBuyAndSell(a));
        System.out.println(StockBuyAndSell.StockBuyAndSell1(a));
    }

}

