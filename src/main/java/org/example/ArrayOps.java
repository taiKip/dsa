package org.example;

import java.util.HashMap;
import java.util.Map;

public class ArrayOps {
    public static int[] findThreeLargest(int[] arr) {
        if (arr.length < 3 || arr == null) {
            throw new IllegalArgumentException("Array must have at least 3 elements");
        }
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > first) {
                third = second;
                second = first;
                first = j;
            } else if (j > second) {
                third = second;
                second = j;
            } else if (j > third) {
                third = j;
            }
        }
        return new int[]{first, second, third};
    }

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("array must have more than one value");
        }
        int largest, secondLargest;
        largest = secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int[] moveAllZerosToEndOfArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }

        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
        return arr;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }

        return nums;
    }

}