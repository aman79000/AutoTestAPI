package com.autobot.practice;

public class SumDigitUntilOne {

    public static int SumDigitUntilOne1(int input) {
        while (input > 9) {
            int sum = 0;
            while (input > 0) {
                sum += input % 10;
                input /= input;
            }
            input = sum;
        }
        return input;
    }

    public static int SumDigitUntilOne(int input) {
        int temp1 = 0;
        while (input > 9) {
            int temp = input % 10;
            temp1 += temp;
            input = input / 10;
            if (input < 10 && input >= 0) {
                input += temp1;
                temp1 = 0;
            }
        }
        return input;

    }

    public static void main(String[] args) {
        System.out.println(SumDigitUntilOne(9999));
    }

}
