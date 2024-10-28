package com.autobot.practice;

public class FindTheFactoralOfTheNumber {

    public static void FindTheFactoralOfTheNumber(int a) {
        int i = a - 1;
        while(i>1)
        {
            a *= i;
            i--;
        }
        System.out.println(a);
        }

    public static void main(String[] args) {
        FindTheFactoralOfTheNumber(5);

    }

}
