package com.autobot.practice;

public class ReverseAInterger {

    public ReverseAInterger() {

    }

    public int reverseInteger(int a) {

        int b = 0;
        while (a != 0) {
            b = b * 10 + a % 10;
            a = a / 10;
        }
        return b;

    }

    public static void main(String[] args) {
        ReverseAInterger r = new ReverseAInterger();
        System.out.println(r.reverseInteger(987654));


    }
}
