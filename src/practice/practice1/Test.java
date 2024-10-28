package com.autobot.practice.practice1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

    public Test() {

    }

    public static boolean CheckIfTheArrayIsSorted(int a[]) {
        int m = a.length;
        for (int i = 0; i < m - 1; i++) {
            if (a[i] > a[i + 1]) {
                System.out.println("Array Is not Sorted");
                return false;
            }

        }
        System.out.println("Array Is Sorted");
        return true;
    }

    public static boolean CheckIfTheNumberIsPalindrome(int a) {
        int b = 0;
        int c = a;
        while (a > 0) {
            b = b * 10 + a % 10;
            a = a / 10;
        }
        if (b == c) {
            System.out.println("Yes");
            return true;
        }
        System.out.println("No");
        return false;
    }

//TryOne  more time
    public static boolean CheckIfTheStringIsPalindrome(String s) {
        String b = "";
        for (char c : s.toCharArray()) {
            b = c + b;
        }
        if (b.contentEquals(s)) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }



    public static void FindDulpicateElementsInAnArray(int a[])
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i:a)
        {
            if(hs.add(i)==false)
            {
                System.out.println(i);
            }
        }

    }

//One more time
    public static int FindTheDuplicateinAnArrayOfNPlus1(int a[], int n) {
        int freq[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (freq[a[i]] == 0) {
                freq[a[i]] = +i;
            } else
                return a[i];
        }
        return 0;
    }

//one more time
    public static ArrayList<Integer> FindTheLeadersInAnArray(int a[])
    {
        ArrayList<Integer> al= new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for (int i = a.length - 1; i >= 0; i--)
        {
            if(a[i]>max)
            {
                al.add(a[i]);
                max = a[i];
            }
        }
        return al;
    }
//one more time
    public static ArrayList<Integer> FindTheCommonElementInArrays(int a[], int b[])
    {
        ArrayList<Integer> al = new ArrayList<>();
    int n=a.length;
    int m=b.length;
    int i=0;
    int j=0;

    while(i<n &&j<m)
    {
        if (a[i] == b[j])
        {
            al.add(a[i]);
            i++;
            j++;
        }

        else if (a[i] < b[j])
        {
            i++;
        }
        else {
            j++;
        }
    }
    return al;

    }

    public static void FindTheSmallestAndLargestElementInAnArray(int a[])
    {

        int max=Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        int i=0;
        int m=a.length;
        while(i<m)
        {
            if(a[i]<=min)
            {
                min=a[i];

            }
            else if (max<=a[i])
            {
                max=a[i];

            }
            i++;
        }
        System.out.println(min + " " + max);
    }

    public static int FindTheMajorityElementThatOccursMorethanNDivide2(int a[]) {
        int n = a.length / 2;
        int count = 0;
        int t;
        int i = 0;
        int j = 0;
        while (i < a.length && j < a.length) {
            if (count == 0) {
                i = j;
                j++;
                count++;

            } else if (a[i] == a[j]) {
                count++;
                j++;
            }

            else {
                count--;
                j++;

            }
        }
        return a[i];
    }

//Redo
    public static int FindTheMissingNumber(int a[]) {
        int n = a.length + 1;
        int b = (n * (n + 1)) / 2;
        int z = 0;
        for (int i : a) {
            z = z + i;
        }
        b = b - z;
        return b;
    }

    // one more time
//    public static int FindTheNumberThatAppearOnceAndTheOtherNumberTwice(int a[])
//    {
//
//    }

    public static void FindTheSecondLargestNumberAndSmallestInArrayWithoutSortinng(int a[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                secondLargest = max;
                max = a[i];

            } else if (a[i] > secondLargest && a[i] != max) {
                secondLargest = a[i];
            }
            if (min > a[i]) {
                secondSmallest = min;
                min = a[i];
            } else if (a[i] < secondSmallest && a[i] != min) {
                secondSmallest = a[i];

            }
        }
        System.out
                .println("The second smallest element is " + secondSmallest + " " + secondLargest);
    }

//One mORe time to do
    public static int MaximumConsecutiveOnesInAnArray1(int a[]) {
        {
            int value = 0;
            int ans = 0;
            for (int i = 0; i < a.length; i++) {
                if ((a[i] == 1)) {
                    value++;
                } else {
                    value--;
            }
                ans = Math.max(value, ans);
        }
        return ans;
        }
    }

    public static int[] Reverse(int start, int end, int[] ar) {

        while (start <= end) {
            int temp;
            temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }
        return ar;
    }

    public static int[] MoveElementsToLeft(int a[], int k)
    {
        Reverse(0, k, a);
        Reverse(k + 1, a.length - 1, a);
        Reverse(0, a.length - 1, a);

        return a;
    }

//one more time
    public static int[] MoveTheZerosToTheEndOfTheArray(int[] a)
    {
        int i=-1;
        int j=0;
        int count=0;
        while(i<a.length-1&&j<a.length-1)
        {
            if(a[j]!=0)
            {
                i++;
               a[i]=a[j];
               a[j] = 0;


            }
            else {
                count++;
            }
            j++;
        }

        return a;


    }

//Redo
    public static int[] RearrangeTheElementBySign(int a[]) {
        int pos = 0;
        int neg = 1;
        int n = a.length - 1;
        int i = 0;
        int z[] = new int[n];
        while (i < n) {
            if (a[i] < 0)
            {
                z[neg]=a[i];
                neg += 2;
            }
            else if(a[i]>0)
            {
                z[pos] = a[i];
                pos += 2;
                        }
                        i++;
            }
            return z;

}

//one more time
public static int StockBuySell(int a[]) {
    int min = Integer.MAX_VALUE;
    int maxPro = 0;
    for (int i = 0; i < a.length; i++) {
        min = Math.min(a[i], min);
        maxPro = Math.max(maxPro, a[i] - min);

    }
    System.out.println(maxPro);
    return maxPro;

}

public static ArrayList<Integer> RemoveDuplicateElementFromSortedArray(int a[])
{
    ArrayList<Integer>al= new ArrayList<>();
    int i=0;
    int j=1;
    al.add(a[0]);

    while(i<a.length&&j<a.length)
    {

         if(a[i]<a[j])
        {
            al.add(a[j]);
            i++;
            a[i]=a[j];

        }
        j++;
    }
    return al;
}

public static boolean SearchInSortedDMatrix(ArrayList<ArrayList<Integer>> a, int target) {
    int n = a.size();
    int m = a.get(0).size();
    int end = n * m - 1;
    int start = 0;
    int rows;
    int columns;
    while (start <= end) {
        int mid = (start + end) / 2;
        rows = mid / m;
        columns = mid % m;
        if (a.get(rows).get(columns) == target) {
            System.out.println("The rows is" + rows + "and columns is " + columns);
            return true;
        }
        else if (a.get(rows).get(columns) < target) {
            start = mid + 1;
        }
        else {
            end = mid - 1;
        }

    }
    return false;

}

public static boolean  twoSumProblem(int a[],int target)
{
    Arrays.sort(a);
    int i=0;
    int j=a.length-1;
     while(i<j)
     {
         int sum=a[i]+a[j];
         if(sum<target)
         {
             i++;
         }
         else if(sum>target)
         {
             j--;
         }
         if(sum==target)
         {
             System.out.println("Index of" +i + "Index of" +j);
             return true;
         }
     }
     return false;

}

public static boolean twoSumProblem1(int a[], int target) {
    HashMap<Integer, Integer> hs = new HashMap<>();
    int x = 0;

    for (int i = 0; i < a.length; i++) {
       x=target - a[i];
        if (hs.containsKey(x)) {
            System.out.println("Both The values are " + a[i] + " " + x);
            return true;
        }
        hs.put(a[i], i);
    }
    return false;
}

//redo
public static ArrayList<Integer> unionOfTwoArrayInAscendingOrder(int a[], int b[])
{
    Arrays.sort(a);
    Arrays.sort(b);
    ArrayList<Integer>al = new ArrayList<>();
    int i=0;
    int j=0;
    while(i<a.length&&j<b.length)
    {
        if(a[i]<=b[j])
        {
            if(al.size()==0||al.get(al.size()-1) !=a[i])
            {
                al.add(a[i]);
            }
            i++;

        }

        else
        {
            if(al.size()==0||al.get(al.size()-1) !=b[j])
            {
                al.add(a[j]);
            }
            j++;

        }
        }

    while(i<a.length)
    {
        if (al.size() == 0 || al.get(al.size() - 1) != a[i]) {
        al.add(a[i]);
    }
        i++;
    }

    while(j<b.length)
    {
        if (al.size() == 0 || al.get(al.size() - 1) != b[j]) {
        al.add(b[j]);
        }
        j++;
    }

    return al;

}

//Redo
public static int[] SortAaArrayThatConsistsOfZerosOnesAndTwos(int a[]) {
    int  mid=0;
    int start=0;
    int end=a.length-1;
    int temp;

    while(mid<end)
    {
        if(a[mid]==0) {
        temp=a[mid];
        a[mid]=a[start];
        a[start]=temp;
        mid++;
        start++;
    }

        else if(a[mid]==2)
        {
            temp=a[mid];
            a[mid]=a[end];
            a[end]=temp;
             end--;
        }
        else {
            mid++;
        }
    }
    return a;

}

//redo
public static int[][] SetMatrixZero(int a[][])
{
    int rows[] = new int[a.length];
    int column[] = new int [a[0].length];
    int n=a.length;
    int m=a[0].length;
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[0].length;j++)
        {
            if(a[i][j]==0)
            {
            rows[i]=1;
            column[j]=1;
            }
        }
    }
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a.length;j++)
        if(rows[i]==1||column[j]==1)
        {
            a[i][j]=0;
        }
    }
    return a;
}

public int[] reverse(int start, int end, int[] a) {
    while (start < end) {
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        start++;
        end--;
    }
    return a;
}

public boolean check(int[] nums) {
    boolean flag = true;
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] > nums[i + 1]) {

            reverse(0, i, nums);
            reverse(i + 1, nums.length - 1, nums);
        flag = false;
        break;
    }
    }
//    if(flag)
//    {
//     return flag;
//    }
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] < nums[i + 1]) {
            return false;
        }
    }
    return true;

}

public static void solution(int a[])
{
    int sum=0;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++)
    {
        sum += a[i];
        if(sum<0)
        {
           sum=0;
        }
      max=  Math.max(sum, max);
    }
    System.out.println(max);
}

public static void solution1(int a[])
{
    int sum=0;
    int max=Integer.MIN_VALUE;
    int start = 0;
    int arrStart = 0;
    int end = a.length - 1;
    for(int i=0;i<a.length;i++)
    {
        sum=sum+a[i];
        if(sum<=0)
        {
            sum=0;
            start = i + 1;
        }
        else if(sum>max)
        {
            arrStart=start;
            end=i;
            max=sum;
        }
    }
    for(int i=arrStart;i<=end;i++)
    {
        System.out.println(a[i]);
    }
}

public static void recursion(int z) {

    if (z == 0) {
        return;
    }
    System.out.println("Test");
    z--;
    recursion(z);
}

public static void printNumberoneToN(int n) {
    if (n == 0) {
        return;
    }
    System.out.println(n);
    printNumberoneToN(n - 1);

}

public static int sumOfNNumbers(int n) {
    if (n == 0) {
        return n;
    }
    int z = sumOfNNumbers(n - 1);
    z += n;
    return z;

}

public static int factorial(int n) {
    if (n == 1) {
        return n;
    }
    return factorial(n - 1) * n;
}

public static int[] reverseAnArray(int a[], int i, int j)
{
    if(i==j)
    {
        return a;
    }
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    reverseAnArray(a, i + 1, j - 1);
    return a;
}

public static int armStrongNumber(int input) {
    int j = String.valueOf(input).length();

    int ans = 0;
    for (int i = 0; i < j; i++) {
        int lastDigit = input % 10;
        int mul = 1;
        for (int k = 0; k < j; k++) {
            mul = mul * lastDigit;
        }
        ans += mul;
        input = input / 10;
    }
    System.out.println(ans);
    return ans;


}

public static String removeTheSpecialCharcterFromString(String s) {
    return s.replaceAll("[^a-z,A-Z,0-9]", "");
}

public static int FindTheFactoral(int input) {
    int ans =input;
    for(int i=1;i<input;i++) {
        ans = i * ans;
    }
    return ans;
}

public static ArrayList<Character> FindTheDuplicateCharacter(String s) {
    char c[]= s.toCharArray();
    HashMap<Character,Integer>map = new HashMap<>();
    ArrayList<Character>ans = new ArrayList<>();
    for(char itr:c) {
        int value=map.getOrDefault(itr, 0);
       map.put(itr, value+1);

    }
    for(Map.Entry<Character,Integer>itr:map.entrySet()) {
        if(itr.getValue()>1) {
            ans.add(itr.getKey());

        }
    }
    return ans;

}

public static void FindTheSecondLargestAndSecondSmallest(int a[]) {
    int max=Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int secondMin=Integer.MAX_VALUE;
    for(int i=0;i<a.length;i++) {
 if(a[i]>max) {
     secondMax=max;
     max=a[i];

 }
 else if(a[i]>secondMax && a[i]!=max) {
     secondMax=a[i];

 }
 if (a[i] < min) {
     secondMin=min;
     min = a[i];

 }
 else if(a[i]<secondMin && a[i]!=min) {
     secondMin=a[i];

 }
    }

    System.out.println("The secondLargestNum   " + secondMin + "  " + secondMax);
}

public static void SortAHashMap(HashMap<Integer, Integer> inputMap) {

    ArrayList<Map.Entry<Integer, Integer>> ans = new ArrayList<>(inputMap.entrySet());
    ans.sort((a, b) ->

    a.getValue() > b.getValue() ? 1 : -1);

    System.out.println("");
}

public static void TakeScreenshot(String filePath) {
    WebDriver driver = new ChromeDriver();
    File destFile = new File(filePath);
    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    try {
    FileUtils.copyFile(srcFile, destFile);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

public static void scrollToView() {
    WebDriver driver = new ChromeDriver();
    WebElement element;
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeAsyncScript("arguments[0].scrollIntoView()", element);
}

public static void waitForElementPresence(WebElement element) {
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(driver, 30);
    wait.until(ExpectedConditions.visibilityOf(element));
    Alert s = driver.switchTo().alert();

}

public static void handleMultipleWindows(String title) {
    Set<String> hs = new HashSet<>();
    WebDriver driver = new ChromeDriver();
    hs = driver.getWindowHandles();
    for (String handle : hs) {
        driver.switchTo().window(handle).getTitle().equalsIgnoreCase(title);
        break;
    }



}

    public static void main(String[] args) {
        int z[] = { -105, 0, 99999, -95, 25, 9999, -100, 96385, 789, 7896542 };
//        int a[][] = { { 1, 1, 0 }, { 1, 1, 1 }, { 1, 1, 1 } };
        int b[] = { -10, -20, 5, 3, -1 };
        List<Integer> arrayList = new ArrayList<>();
        Collections.reverse(arrayList).st;

        

//        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//        Test t = new Test();
//        for (int i : reverseAnArray(b, 0, b.length - 1))
//        {
//            System.out.println(i);
//        }
//        System.out.println(
        // removeTheSpecialCharcterFromString("123!@#$%^&"));
//        // recursion(5);
//        // solution(arr);
//        // solution1(arr);
////        t.check(b);
//
//
//        SetMatrixZero(a);
        HashMap<Integer, Integer> inputmap = new HashMap<>();
        inputmap.put(80, 1);
        inputmap.put(79, 2);
        SortAHashMap(inputmap);
        System.out.println("");
    }
}
