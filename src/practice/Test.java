package com.autobot.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test {

    public static int[] AlternatePositiveAndNegativeNumberinArray(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int ans[] = new int[arr.length];
        for (int itr : arr) {
            if (itr >= 0) {
                pos.add(itr);
            }
            else {
                neg.add(itr);
            }
        }
        if(neg.size()>pos.size()) {
            for(int i=0;i<pos.size();i++) {
                ans[(i*2)] =pos.get(i);
                ans[(i * 2) + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int j = pos.size(); j < neg.size(); j++) {
                ans[index] = neg.get(j);
                index++;
            }
        }
        else {
            for (int i = 0; i < neg.size(); i++) {
                ans[i * 2] = pos.get(i);
                ans[i * 2 + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int j = neg.size(); j < pos.size(); j++) {
                ans[index] = pos.get(j);
                index++;
            }
        }
        return ans;

    }

    public static int binarySearch(int arr[], int target) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }

        }
        return -1;

    }

    public static int[] bubbleSort(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static boolean checkIfTheArrayIsSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkNumberIsPalindrome(int a) {
        int input = a;
        int ans = 0;
        while (input != 0) {
            int temp = input % 10;
            ans = temp + (ans * 10);
            input /= 10;
        }

        if (ans == a) {
            return true;
        }
        return false;
    }

    public static boolean IsPalindrome(String s) {
        char c[] = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while(i<j) {
            if(c[i]!=c[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static ArrayList<Integer> FindTheDuplicateElementsInArray(int arr[])
    {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> intSet = new HashSet<>();
        for (int itr : arr) {
            if (intSet.add(itr) == false) {
                ans.add(itr);
            }
        }
        return ans;
    }

    public static ArrayList<Integer> FindTheLeaderInArray(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                ans.add(max);
            }
        }
        return ans;

    }

    public static ArrayList<Integer> CommenElements(int arr[], int arr2[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(arr);
        int i = 0;
        int j = 0;
        while (i < arr.length && j < arr2.length) {
            if (ans.size() != 0 && arr[i] == ans.get(ans.size() - 1)) {
                i++;
            }
            if (ans.size() != 0 && arr2[j] == ans.get(ans.size() - 1)) {
                j++;
            }

            if (arr[i] == arr2[j]) {
                ans.add(arr[i]);
                i++;
                j++;
            } else if (arr[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return ans;
    }

    public static void FindTheLongestOddNumberInGivenString(String s) {
        char c[] = s.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            if (Character.isDigit(c[i]) && c[i] % 2 != 0) {
                System.out.println("The Index of longest Odd number starts from 0 to " + i);
                break;

            }
        }
    }

    public static void FindTheMajorityElementThatOccursMoreThanNDiviDe(int arr[]) {
        HashMap<Integer, Integer> element = new HashMap<>();
for(int i=0;i<arr.length;i++) {
    int value= element.getOrDefault(arr[i], 0);
    element.put(arr[i], value + 1);

}

for (Map.Entry<Integer, Integer> itr : element.entrySet()) {
    if (itr.getValue() > (arr.length / 2)) {
        System.out.println(itr.getKey());
    }
}
    }

    public static int FindTheMissingNumber(int arr[]) {
     int n=arr.length+1;
     int total= (n*(n+1))/2;
     int sum=0;
     for(int itr:arr) {
         sum +=itr;
     }

     return total-sum;


    }

    public static int FindTheNumberThatAppearoneceAndOtherNumberAppearTwice(int arr[]) {
        int xor = 0;
        for (int itr : arr) {
            xor ^= itr;
        }
        return xor;
    }

    public static void FindTheLargestSecondLargestSmallestAndSecondSmallest(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secMin = Integer.MAX_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max) {
                secMax=max;
                max=arr[i];
            }
            else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }

            if (min > arr[i]) {
                secMin = min;
                min = arr[i];
            }
            else if (secMin > arr[i] && arr[i] != min) {
                secMin = arr[i];
            }

        }
        System.out.println("Largest " + max + " SecondLarget " + secMax + " Smallest " + min
                + " SecondSmallest " + secMin);

    }

    public static void FindTheSumOfContigiousNumberEqualToTarget(int arr[], int target) {

        int i = 0;
        int j = 0;
        int sum = 0;

        while (i < arr.length && j < arr.length) {
            sum += arr[i];
            while (sum > target && j < i) {
                sum -= arr[j];
                j++;
            }

            if (sum == target) {
                System.out.println("Sum Found The Start Index is " + j + " and End index is " + i);
                break;
            }
            i++;
        }

    }

    public static int LinearSearch(int arr[],int target) {
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int FindTheMaxmimumConsecutionOnesinAnArray(int arr[]) {
        int max = 0;
        int count = 0;
        for (int itr : arr) {
            if (itr == 1) {
                count++;
            }
            else {
                if (max < count) {
                    max = count;
                }
                count = 0;
            }
            if (max < count) {
                max = count;
            }
        }
        return max;
    }

    public static void reverse(int arr[], int startIndex, int endIndex) {
        while(startIndex<endIndex) {
        int temp=arr[startIndex];
        arr[startIndex]=arr[endIndex];
        arr[endIndex]=temp;
        startIndex++;
        endIndex--;
        }
    }

    public static void MoveElementToLeft(int arr[], int k) {

        reverse(arr,0,k-1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static int[] MoveTheZerosToTheStart(int arr[]) {
        int i = 0;
        for (i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                break;
            }
        }
        if(i==0) {
            return null ;
        }

        for (int j = i - 1; j >= 0; j--) {
            if (arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i--;
            }

        }
        return arr;
    }

    public static String RemoveSpecialCharacterFromString(String s) {
        return s.replaceAll("[^1-9,A-Z,a-z]", "");
    }

    public static int ReverseAInteger(int a) {
        int input =a;
        int temp=0;
        int ans=0;
        while (input != 0) {
           temp=  input%10;
           ans=temp +(ans*10);
           input /= 10;
         }
         return ans;
    }

    public static String ReverseAStringAtSamePlace(String s) {
 String se []= s.split(" ");
 StringBuilder ans = new StringBuilder("");
 for(String itr:se) {
     ans.append(new StringBuilder(itr).reverse() + " ");
 }

 return ans.toString();
    }

    public static String ReverseAWordInStringByIndex(String s, int index) {
        String se[]=s.split(" ");
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<se.length;i++) {
            if(i==index) {
                ans.append(new StringBuilder(se[i]).reverse()+" ");
            }
            else {
                ans.append(se[i] + " ");
        }

    }
        return ans.toString();
        }

        public static int StockBuySell(int arr[]) {
            int ans = 0;
            int max = Integer.MIN_VALUE;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                ans = Math.max(ans, max - arr[i]);

            }
            return ans;

    }

    public static int SumDigitUntilOne(int i) {
        int input = i;
        int ans = 0;

        while (input > 9) {
            int temp = input % 10;
            ans += temp;
            input /= 10;
            if (input < 10 && input >= 0) {
                input += ans;
                ans = 0;
            }
        }
        return input;
    }

    public static void swapTwoIntWithOutThirdVar(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }

    public static void swapTwoStringWithoutVariable(String s, String s1) {
        s = s + s1;
        s1 = s.replace(s1, "");
        s = s.replace(s1, "");

        System.out.println(s);
        System.out.println(s1);
    }

    public static void main(String[] args) {
//        checkIfTheArrayIsSorted(new int[] { 1, 2, 3, 4, 5, 6 });
//        int a[] = { 1, 1, 1, 1, 1, 2, 5, 6, 7, 7, 1 };
//        int b[] = { 1, 1, 1, 2, 5, 6, 1, 7, 7, 1 };
//        System.out.println(FindTheMaxmimumConsecutionOnesinAnArray(new int[] { 0, 0, 1, 1, 1, 1, 0,
//                0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }));
        ;
        System.out.println(SumDigitUntilOne(12345));
        swapTwoStringWithoutVariable("Aman", "gupta");


    }
}

