package com.autobot.practice;

public class FindTheSmallestAndLargestNumberInArray {

    public void solution(int a[]) {


        int smallest = a[0];
        int largest = a[0];
        for (int i = 0; i < a.length ; i++) {

            if ( largest < a[i]) {

                largest = a[i];
            } else if (smallest > a[i]) {
                smallest = a[i];
            }

        }
        System.out.print(
                "The smallest number is " + smallest + "   The largest number is " + largest);
    }

    public static void main(String[] args) {
        int[] a = { -105, 0, 99999, -95, 25, 9999, -100, 96385, 789, 7896542 };
        FindTheSmallestAndLargestNumberInArray fs = new FindTheSmallestAndLargestNumberInArray();
        fs.solution(a);

    }

}
