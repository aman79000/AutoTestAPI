package com.autobot.practice.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.autobot.api.PositionDataDTO;

public class Test1 {
//one more time
    public static boolean CheckTheNumberIsPalindrome(int a) {
       int z=0;
       int i=a;
       while(a>0)
       {
       z=a%10+z*10;
       a=a/10;
    }
    if(z==i)
    {
        System.out.println("The number is Palindrome");
        return true;
    }
    System.out.println("Its not");
    return false;
    }

    public static boolean CheckIfTheStringIsPalindromeOrNot(String s) {
        String z = "";
        for (char i : s.toCharArray()) {
            z = i + z;
        }
        if(z.equals(s))
        {
            System.out.println("TheString is palindrome");
            return true;
        }
        System.out.println("Its not");
        return false;

    }

    public static boolean CheckTheStringIsPalindromeSpecialCharacyer(String s)
    {
        String z="";
        char []c=s.toCharArray();
        s = "";
        for (int i = 0; i < c.length; i++)
        {
            if (Character.isLetterOrDigit(c[i])) {
                z = c[i] + z;
                s += c[i];
            }

        }
        System.out.println(z);
        System.out.println(s);
        if (s.equals(z)) {
            System.out.println("The String is Palindrome");
            return true;
        }
        System.out.println("its not");
        return false;
    }

//Redo   also watch the optimal solution
    public static int CountSubArraySumEqualK(int a[], int target) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum == target) {
                    count++;
                    break;
                }
            }

        }
        return count;
    }

        public static ArrayList<Integer> FindTheDuplicateElementInAnArray(int a[])
        {
            HashSet<Integer> hs = new HashSet<>();
            ArrayList<Integer> ar = new ArrayList<>();
            for(int i=0;i<a.length;i++)
            {
                if(hs.add(a[i])==false)
                {
                    ar.add(a[i]);
                }

            }
            return ar;


        }

//Redo
        public static int FindDuplicateElementOnNPlusOne(int []a)
        {
            int z [] = new int [a.length+1];
            for(int i=0;i<a.length;i++)
            {
                if (z[a[i]] == 0)
                {
                    z[a[i]]++;
                }
                else {
                    return a[i];
                }

            }
            return -1;
        }

        public static ArrayList<Integer> FindTheLeadersInAnArray(int[] a) {
            int max = Integer.MIN_VALUE;
            ArrayList<Integer> ar = new ArrayList<>();
            for (int i = a.length - 1; i >= 0; i--) {
                if (a[i] > max) {
                    max = a[i];
                    ar.add(max);
                }
            }
            return ar;
        }

//Redo
        public static ArrayList<Integer> FindTheCommonElementsInAnArray(int a[], int b[]) {
            ArrayList<Integer> al = new ArrayList<>();
            int i = 1;
            int j = 0;
            while (i < a.length && j < b.length) {
                if (a[i] == b[j]) {
                al.add(a[i]);
                i++;
                j++;
            }
            else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }

        }
        return al;
    }

    public static int FindTheFactorialOfGivenNumber(int a)
        {
            int prod=1;
            for(int i=a;i>0;i--)
            {
                prod = prod * i;
            }
            return prod;
        }

        public static HashMap<Integer, Integer> FindTheMajorityElementThatOccursMoreThanNDivide(
                int a[]) {
            HashMap<Integer,Integer> hs = new HashMap<>();
            for(int i=0;i<a.length;i++) {
           int value= hs.getOrDefault(a[i], 0);
           hs.put(a[i], value+1);
            }

            return hs;
    }

//redo
    public static int FindTheMajorityElementThatOccursMoreThanNDivide2(int a[])

        {
            int j = 0;
           int count =0;
           int count1=0;
           int el = 0;
           while (j < a.length)
           {
               if(count==0)
               {
                   count ++;
                   el = a[j];
               }
               else if (el == a[j])
               {
                   count++;
               }else
               {
                   count--;
               }
               j++;
           }


           for(int i=0;i<a.length;i++)
           {
               if(el==a[i])
               {
                   count1++;
               }
           }
           if(count1>a.length)
           {
               return el;
           }
           else
           {
               return -1;
           }
        }

//redo
        public static int FindTheMissingNumber(int a[]) {
            int n = a.length;
            int extranum = 0;
            int total = 0;
            int sum = 0;
            int b[] = new int[a.length + 1];
           for(int i=0;i<a.length;i++)
           {
               if (b[a[i]] == 0)
               {
                   b[a[i]]++;
               }
               else {
                   extranum = a[i];
                   break;
               }
           }

           for (int i = 0; i < a.length; i++) {
               sum += a[i];
           }
           total = n * (n + 1) / 2;
           sum = sum - extranum;
           total = total - sum;
           return total;
       }

       public static int FindTheNumberThatOccursOnceAndOtherNumberTwice(int a[])
        {
            int xor = 0;
            for(int i=0;i<a.length;i++)
            {
                xor= xor^a[i];
            }
            return xor;
        }

        public static ArrayList<Integer> FindAllTheDuplicateElementsInAnArray(int a[])
       {
           ArrayList<Integer>al = new ArrayList<>();

           Arrays.parallelSort(a);

           for (int i = 0; i < a.length - 1; i++) {
               if (a[i] == a[i + 1]) {
                   if (al.size() == 0 || al.get(al.size() - 1) != a[i])
                       al.add(a[i]);
               }
           }
           return al;
       }

       public static int FindTheDuplicateElementInAnArray2(int a[]) {
           int z[] = new int[a.length + 1];
           for (int i = 0; i < a.length; i++) {
               if (z[a[i]] == 0) {
                   z[a[i]]++;
               } else {
                   return a[i];
               }
           }
           return -1;
       }

       public static int RemoveTheDuplicateElementsFromAnArray(int a[])
       {
           Arrays.sort(a);
           int i=0;int j=1;
           int n=a.length;
           while(i<n&&j<n)
           {
               if(a[i]!=a[j]) {
                   i++;
                   a[i]=a[j];

               }
               else {
                   j++;
               }
           }
           return i+1;

       }

       public static void PrintTheStarPattern(int n)
       {
           for (int i = 0; i <= n; i++)
           {
               System.out.println("");
               for (int j = n; j >= i; j--)
               {
                   System.out.print(" ");
               }
               System.out.print("*");
               for (int k = 0; k <= i; k++) {
                   System.out.print("*");
               }
           }
       }

       public static String ReverseAString(String s)
       {
           char c[]=s.toCharArray();
           String z="";
           for(int i=0;i<c.length;i++)
           {
               z=c[i]+z;
           }
           return z;
       }

       public static int FindTheLargetElementInAnArray(int a[]) {
           int max = Integer.MIN_VALUE;
           for (int i = 0; i < a.length; i++) {
               if (a[i] > max) {
                   max = a[i];
               }
           }
           return max;
       }

       public static boolean isPalindrome(String s) {
           char c[] = s.toCharArray();
           int i = 0;
           int j = c.length - 1;
           while (i < j) {
               if (c[i] != c[j]) {
                   return false;
               }
               i++;
               j--;
           }
           return true;
       }

       public static int programToFindTheFactorial(int a) {
           int z = 1;
           for (int i = a; i > 1; i--) {

               z = z * i;
           }
           return z;
       }

       public static void fibonacciSeries() {
           int i = 0;
           int j = 1;
           int sum = 0;
           System.out.println(i);
           System.out.println(j);
           for (int k = 0; k < 10; k++) {
               sum = i + j;
               System.out.println(sum);
               i = j;
               j = sum;

           }
       }

       public static boolean isPrimeNumber(int a)
       {
           if (a % 2 != 0 && a % 3 != 0)
           {
               return true;
           }
           return false;
       }

       public static boolean isArmStrong(int a)
       {
           int b=0;
           int c=a;
           int cube = 0;
           int sum = 0;

           while(a!=0) {
           b=a%10;
           a = a / 10;
           cube = b * b * b;
           sum = cube + sum;
       }
       if (sum == c) {
           return true;

       }
       return false;


       }

       public static boolean isStringAlagram(String s, String a) {
           char c[] = s.toCharArray();
           char d[] = a.toCharArray();
           HashMap<Character, Integer> hs = new HashMap<>();
           if(a.length()!=s.length())
           {
               return false;
           }
           for(int i=0;i<a.length();i++)
           {
             int value=  hs.getOrDefault(c[i], 0);
             hs.put(c[i], value + 1);

             int value1 = hs.getOrDefault(d[i], 0);
             hs.put(d[i], value1 + 1);

           }

           for(Map.Entry<Character, Integer> cs:hs.entrySet())
           {
               if(cs.getValue()%2!=0)
                   return false;
           }
           return true;

       }

       public static void bubbleSort(int a[]) {
           for (int i = 0; i < a.length; i++) {
               for (int j = 0; j < a.length - 1 - i; j++) {
                   if (a[j] > a[j + 1]) {
                       int temp = a[j];
                       a[j] = a[j + 1];
                       a[j + 1] = temp;
                   }
               }
           }
       }

       public static int binarySearch(int a[], int target) {
           int start = 0;
           int end = a.length - 1;
           while (start <= end) {
               int mid = (start + end) / 2;

               if (a[mid] == target) {
                   return mid;
               }

               else if (a[mid] > target) {
                   end = mid-1;
               }
               else {
                   start = mid + 1;

               }


           }
           return -1;
       }

       public static void FindTheLargestAndSmallestElement(int a[])
       {
           int min=Integer.MAX_VALUE;
           int secondSmallest=Integer.MAX_VALUE;
           int max=Integer.MIN_VALUE;
           int secondLargest= Integer.MIN_VALUE;
           for(int i=0;i<a.length;i++) {
              if(a[i]>max)
              {
                  secondLargest=max;
                  max=a[i];
              }
              else  if(secondLargest<a[i]&&a[i]!=max)
               {
                   secondLargest=a[i];
               }

               if(a[i]<min)
               {
                   secondSmallest=min;
                   min=a[i];
               }
               else if(a[i]<secondSmallest &&a[i]!=min)
               {
                   secondSmallest=min;
               }
           }

           System.out.println("The SecondLaegestElement is  "+secondLargest+"  The SecondSmallest is "+ secondSmallest);
       }

       public static void  NegativeAndPositiove(int a[])
       {
           int odd=0;
           int even=1;
           ArrayList<Integer> as = new ArrayList<>();
           for(int i=0;i<a.length;i++)
           {
               if(a[i]>0)
               {
                   as.add(odd, a[i]);
                   odd += 2;

               } else {
                   as.add(even, a[i]);
                   even += 2;
               }
           }
       }

     void cutomSort(List<Map.Entry<String,Integer>> list){


        // ("S":1) , ("F" : 4) , ("R" : 4)
   /*      Comparator<Map.Entry<String,Integer>> comp = new Comparator<Map.Entry<String, Integer>>() {
             @Override
             public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                 if(a.getValue() == b.getValue()){
                     return  a.getKey().compareToIgnoreCase(b.getKey()) ;

                 }
                 return (a.getValue() > b.getValue()) ? 1 : -1;
             }
         };
         list.sort(comp);

         for( Map.Entry<String,Integer> map  : list){
             System.out.println(map.getKey() + "  " + map.getValue());
         }
         */



        list.sort((a,b) -> {

            return  -1;
        }
     );


     }

     public static void custome(List<Map.Entry<String,Integer>> ls) {
         ls.sort((a, b) -> {

             if(a.getValue() == b.getValue()){
                return a.getKey().compareToIgnoreCase(b.getKey());
             }
             return a.getValue() > b.getValue() ? 1 : -1;
         });

     }

     public static void CustomObject() {
         HashSet<Object> hs = new HashSet();
         PositionDataDTO p = new PositionDataDTO();
         PositionDataDTO p1 = new PositionDataDTO();
         p.setAccountNo("T");
         p1.setAccountNo("T");
        ;
        if (p.getClass().equals(p1.getClass())) {
         hs.add(p);

     } else {
         hs.add(p);
         hs.add(p1);
         }
         System.out.println("");

     }


    public static void main(String[] args) {
        // CheckTheStringIsPali ndromeSpecialCharacyer("2%$#&*52");
//      HashMap<String,Integer> hs = new HashMap<>();
//      hs.put("Test3", 4);
//      hs.put("Test",1);
//      hs.put("Test2",3);
//             List<Map.Entry<String,Integer>> lss = new ArrayList<>(hs.entrySet());
//             custome(lss);
//             System.out.println("");
        CustomObject();

    }}


