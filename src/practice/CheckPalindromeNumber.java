package com.autobot.practice;

public class CheckPalindromeNumber {

    public void CheckPalindromeNumber(int a) {

        int s = a;
        int b = 0;
        while (a != 0) {


        b = b * 10 + a % 10;
        a = a / 10;
    }

        if (s == b) {
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        CheckPalindromeNumber cp = new CheckPalindromeNumber();
        cp.CheckPalindromeNumber(710007);

    }

}
