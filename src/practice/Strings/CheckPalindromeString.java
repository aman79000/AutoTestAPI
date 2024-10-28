package com.autobot.practice.Strings;

public class CheckPalindromeString {

    public void CheckPalindromeString(String a) {
        char[] b = a.toCharArray();
        String c = "";
        for (int i = b.length - 1; i >= 0; i--) {
            c = c + b[i];
        }

        if (c.equals(a)) {
            System.out.println("the String  is Plaindrome");
        } else {
            System.out.println("The string isn't palindrome");
        }

    }

    public boolean isPalindrome(String s) {
        int left=0;
        int right =s.length()-1;
        char[] t = s.toCharArray();
        while(left<right)
        {
            if(!Character.isLetterOrDigit(t[left]))
            {
                left++;
            }
            else if(!Character.isLetterOrDigit(t[right]))
            {
                right--;
            }
            else if(Character.toLowerCase(t[left])!=Character.toLowerCase(t[right]))
            {
                return false;
            }
            else{
                right++;
                left++;
            }


        }
        return true;
    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub

        CheckPalindromeString cp = new CheckPalindromeString();
        cp.CheckPalindromeString("noon");

    }

}
