package com.autobot.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchInSorted2dMartix {

    public static boolean SearchInSorted2dMartix(ArrayList<ArrayList<Integer>> matrix, int target) {

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                if (matrix.get(i).get(j) == target) {
                    System.out.println("The Index of " + target + "  is" + i + " and " + j);
                    return true;
                }
            }
        }
            System.out.println("The Value in't present in the given matrix");
            return false;

        }

//Better Solution
//        public static boolean SearchInSorted2DMatrix1(ArrayList<ArrayList<Integer>> matrix,
//                int target) {
//            int i = 0;
//            int mid;
//            int end = matrix.size() - 1;
//            int start = 0;
//
//            while (start <= end) {
//                mid = (start + end) / 2;
//
//                if (matrix.get(mid).get(matrix.get(end).size()) < target) {
//
//
//                }
//                else if (matrix.get(i).get(matrix.get(i).size() - 1) == target
//                        || matrix.get(i).get(0) == target) {
//                    System.out.println("The Index of " + target + "  is" + i);
//                    return true;
//                }
//
//                else if (matrix.get(i).get(matrix.get(i).size() - 1) > target) {
//
//                        }
//                    }
//                }
//
//
//            System.out.println("The Value in't present in the given matrix");
//            return false;

//MOst optimize solution
        public static boolean searchIn2DSortedmatrix3(ArrayList<ArrayList<Integer>> matrix,int target)
        {
            int start = 0;
            int end = matrix.size() * matrix.get(0).size() - 1;
            int n = matrix.get(0).size();
            while (start <= end) {
                int mid = (start + end) / 2;
                int row = mid / n;
                int column = mid % n;
                if (matrix.get(row).get(column) == target) {
                    System.out.println("The element is present in " + row + " " + column);
                    return true;
                }
                else if (matrix.get(row).get(column) > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            System.out.println("The element is not present in given array");
            return false;
        }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5)));
        arr.add(new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10, 11)));
        arr.add((new ArrayList<>(Arrays.asList(12, 13, 14, 15, 16, 17))));
        SearchInSorted2dMartix.searchIn2DSortedmatrix3(arr, 17);

    }

}
