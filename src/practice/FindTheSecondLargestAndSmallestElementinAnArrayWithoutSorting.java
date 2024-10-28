package com.autobot.practice;

public class FindTheSecondLargestAndSmallestElementinAnArrayWithoutSorting {
//Optimize solution
    public void FindTheSecondLargestAndSmallestElementinAnArrayWithoutSorting(int a[]) {
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if (min > a[i])
            {
                secondSmallest=min;
                min=a[i];
            }
            else if(a[i]<secondSmallest && min != a[i])
            {
                secondSmallest=a[i];
            }

            if (max < a[i])
            {
                secondLargest=max;
                max=a[i];
            }
            else if(a[i]>secondLargest && max != a[i])
            {
                secondLargest=a[i];
            }
        }
        System.out.println(secondSmallest + " " + secondLargest);
        }

    public static void main(String[] args) {
        FindTheSecondLargestAndSmallestElementinAnArrayWithoutSorting cs = new FindTheSecondLargestAndSmallestElementinAnArrayWithoutSorting();
        int a[] = { 100, 90, 98, 7, 5, 8, 13, 12 };
        cs.FindTheSecondLargestAndSmallestElementinAnArrayWithoutSorting(a);

    }

}
